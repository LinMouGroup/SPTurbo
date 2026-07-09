// import java.io.File;
// import ij.ImageJ;

import ij.plugin.PlugIn;
import ij.ImagePlus;
// import ij.process.ByteProcessor;
// import ij.gui.ImageCanvas;
// import ij.gui.ImageWindow;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

public class SPTurbo_ implements PlugIn {

    private JFrame frame;
    private ImagePlus previewImp;
    private JLabel previewLabel;

    public static void main(String[] args) {
        // new ImageJ();
        new SPTurbo_().run("");
    }

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

    public void run(String arg) {
        JFrame frame = new SPTLayout();
        frame.setTitle("SPTurbo");
        frame.setSize(1000, 300);
        frame.setLocationRelativeTo(null); // 居中
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }
}