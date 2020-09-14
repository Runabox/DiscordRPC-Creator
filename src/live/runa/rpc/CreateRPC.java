package live.runa.rpc;

import net.arikia.dev.drpc.DiscordEventHandlers;
import net.arikia.dev.drpc.DiscordRPC;
import net.arikia.dev.drpc.DiscordRichPresence;
import net.arikia.dev.drpc.DiscordUser;

public class CreateRPC {

    DiscordRichPresence rpc;
    String username;
    DiscordUser user;

    public CreateRPC(String appID, String line2, String line1, String imgKey, String imgText){
        DiscordEventHandlers handlers = new DiscordEventHandlers.Builder().setReadyEventHandler((user) -> {
            this.user = user;
        }).build();

        DiscordRPC.discordInitialize(appID, handlers, true);
        rpc = new DiscordRichPresence.Builder(line1).setBigImage(imgKey, imgText).setDetails(line2).build();
        DiscordRPC.discordUpdatePresence(rpc);
    }

    public void updateRPC(String appID, String line2, String line1, String imgKey, String imgText){
        rpc = new DiscordRichPresence.Builder(line1).setBigImage(imgKey, imgText).setDetails(line2).build();
        DiscordRPC.discordClearPresence();
        DiscordRPC.discordUpdatePresence(rpc);
    }

    public String getDiscriminatedName(){
        return user.discriminator;
    }

}
