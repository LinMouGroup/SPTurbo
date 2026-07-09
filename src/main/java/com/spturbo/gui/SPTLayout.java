package com.spturbo.gui;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class SPTLayout extends JFrame {
    public SPTLayout() {
        JPanel panelCanvas = new JPanel(new GridLayout(1,5));

        JPanel panelSimulatedData = new JPanel(new GridLayout(1,5));
        TitledBorder titleSimulatedData = BorderFactory.createTitledBorder("Simulated Data");
        panelSimulatedData.setBorder(titleSimulatedData);

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
