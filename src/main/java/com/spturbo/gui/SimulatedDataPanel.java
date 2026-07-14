package com.spturbo.gui;

import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class SimulatedDataPanel extends JPanel {
    public SimulatedDataPanel() {
        this(new GridLayout(1, 5));
    }

    public SimulatedDataPanel(GridLayout layout) {
        setLayout(layout);
        TitledBorder title = BorderFactory.createTitledBorder("Simulated Data");
        setBorder(title);
    }
}
