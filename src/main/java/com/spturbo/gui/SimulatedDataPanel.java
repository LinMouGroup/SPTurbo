package com.spturbo.gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class SimulatedDataPanel extends JPanel {
    public SimulatedDataPanel() {
        setLayout(new BorderLayout());
        TitledBorder title = BorderFactory.createTitledBorder("Simulated Data");
        setBorder(title);

        JPanel paramsPanel = new JPanel(new GridLayout(6, 2));
        paramsPanel.add(new JLabel("Resolution"));
        paramsPanel.add(new JComboBox<>(new String[]{"256×256", "512×512", "1024×1026", "2048×2048"}));
        paramsPanel.add(new JLabel("D (μm²/s)"));
        paramsPanel.add(new JTextField());
        paramsPanel.add(new JLabel("SNR"));
        paramsPanel.add(new JTextField());
        paramsPanel.add(new JLabel("Frames"));
        paramsPanel.add(new JTextField());
        paramsPanel.add(new JLabel("Pixel Size"));
        paramsPanel.add(new JTextField());
        paramsPanel.add(new JLabel("Exposure"));
        paramsPanel.add(new JTextField());

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        buttonPanel.add(new JButton("SIMULATE"));

        add(paramsPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }
}
