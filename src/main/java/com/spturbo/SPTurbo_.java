package com.spturbo;

import ij.plugin.PlugIn;
import javax.swing.*;
import com.spturbo.gui.SPTLayout;

public class SPTurbo_ implements PlugIn {

    public static void main(String[] args) {
        // new ImageJ();
        new SPTurbo_().run("");
    }

    public void run(String arg) {
        JFrame frame = new SPTLayout();
        frame.setTitle("SPTurbo");
        frame.setSize(1000, 300);
        frame.setLocationRelativeTo(null); // 居中
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }
}