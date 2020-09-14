package live.runa.io;

import javax.swing.*;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.dnd.DropTargetListener;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class ReadConfiguration {

    public static String[] readConfig(String path) throws IOException {
        File config = new File(path);

        InputStream in = new FileInputStream(config);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));

        String contents = br.readLine();

        String configs[] = contents.split(" ");
        for(int i = 0; i < configs.length; i++){
            System.out.println(configs[i]);
        }
        return configs;
    }

    public static void saveConfig(String[] config, File file) throws IOException {
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < config.length; i++){
            sb.append(config[i] + " ");
        }

        String cofS = sb.toString();

        //create file if it already doesnt exist
        if(!file.exists()){
            System.out.println("Created file: " + file.getAbsolutePath());
        }

        PrintWriter out = new PrintWriter(file);
        out.println(cofS);
        out.close();
    }

}
