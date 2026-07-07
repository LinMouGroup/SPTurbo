import java.io.File;
import ij.ImageJ;

import ij.plugin.PlugIn;
import ij.ImagePlus;
import ij.process.ByteProcessor;
import ij.gui.ImageCanvas;
import ij.gui.ImageWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SPTurbo_ implements PlugIn {

    private JFrame frame;
    private ImagePlus previewImp;
    private JLabel previewLabel;

    public static void main(String[] args) {
        new ImageJ();
        new SPTurbo_().run("");
    }

    public class SPTLayout extends JFrame {
        public SPTLayout() {
            JPanel p1 = new JPanel();
            p1.setLayout(new GridLayout(4,3));

            for (int i = 1; i <= 9; i++) {
                p1.add(new JButton("" + i));
            }

            p1.add(new JButton("0"));
            p1.add(new JButton("Start"));
            p1.add(new JButton("Stop"));
            

            JPanel p2 = new JPanel(new BorderLayout());
            p2.add(new JTextField("Time to be displayed here"), BorderLayout.NORTH);
            p2.add(p1, BorderLayout.CENTER);

            add(p2, BorderLayout.EAST);
            add(new JButton("Food to be placed here"), BorderLayout.CENTER);


        }
    }

    public void run(String arg) {
        JFrame frame = new SPTLayout();
        frame.setTitle("SPTurbo");
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null); // 居中
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }
}