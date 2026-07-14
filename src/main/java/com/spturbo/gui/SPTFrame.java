package com.spturbo.gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class SPTFrame extends JFrame {
    public SPTFrame() {
        JPanel panelCanvas = new JPanel(new GridLayout(1,5));

        JPanel panelSimulatedData = new SimulatedDataPanel();

        JPanel panelDenoise = new JPanel(new GridLayout(1,5));
        TitledBorder titleDenoise = BorderFactory.createTitledBorder("Denoise");
        panelDenoise.setBorder(titleDenoise);

        JPanel panelDetection = new JPanel(new GridLayout(1,5));
        TitledBorder titleDetection = BorderFactory.createTitledBorder("Detection");
        panelDetection.setBorder(titleDetection);

        JPanel panelTracking = new JPanel(new GridLayout(1,5));
        TitledBorder titleTracking = BorderFactory.createTitledBorder("Tracking");
        panelTracking.setBorder(titleTracking);

        JPanel panelAnalysis = new JPanel(new GridLayout(1,5));
        TitledBorder titleAnalysis = BorderFactory.createTitledBorder("Analysis");
        panelAnalysis.setBorder(titleAnalysis);

        panelCanvas.add(panelSimulatedData);
        panelCanvas.add(panelDenoise);
        panelCanvas.add(panelDetection);
        panelCanvas.add(panelTracking);
        panelCanvas.add(panelAnalysis);

        add(panelCanvas, BorderLayout.CENTER);
    }
}