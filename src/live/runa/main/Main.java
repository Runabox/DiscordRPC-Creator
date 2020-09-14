package live.runa.main;

import live.runa.gui.GPNL;
import live.runa.rpc.CreateRPC;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args){
        new Main();
    }

    public Main(){
        JFrame frame = new JFrame("Discord RPC Creator | by Runabox");

        frame.setDefaultCloseOperation(3);
        frame.setResizable(false);
        frame.setContentPane(new GPNL());
        frame.pack();
        frame.setSize(new Dimension(557, 334));
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

}
