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

    public void run(String arg) {
        // 创建独立窗口
        frame = new JFrame("噪声图像生成器");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new BorderLayout(10, 10));

        // 控件区
        JPanel controlPanel = new JPanel(new GridLayout(3, 2, 5, 5));
        controlPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        controlPanel.add(new JLabel("宽度:"));
        JTextField widthField = new JTextField("256");
        controlPanel.add(widthField);

        controlPanel.add(new JLabel("高度:"));
        JTextField heightField = new JTextField("256");
        controlPanel.add(heightField);

        JButton generateBtn = new JButton("生成随机噪声");
        controlPanel.add(generateBtn);

        JButton showBtn = new JButton("在ImageJ中打开");
        controlPanel.add(showBtn);

        frame.add(controlPanel, BorderLayout.NORTH);

        // 预览区（显示缩略图）
        previewLabel = new JLabel("预览区域", SwingConstants.CENTER);
        previewLabel.setPreferredSize(new Dimension(256, 256));
        previewLabel.setBorder(BorderFactory.createEtchedBorder());
        frame.add(previewLabel, BorderLayout.CENTER);

        // 生成按钮事件
        generateBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int w = Integer.parseInt(widthField.getText());
                int h = Integer.parseInt(heightField.getText());
                generateNoiseImage(w, h);
            }
        });

        // "在ImageJ中打开"按钮事件
        showBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (previewImp != null) {
                    // 复制一份新图像在ImageJ主窗口中打开
                    ImagePlus copy = previewImp.duplicate();
                    copy.setTitle("噪声图_" + System.currentTimeMillis());
                    copy.show();
                }
            }
        });

        frame.pack();
        frame.setLocationRelativeTo(null); // 居中
        frame.setVisible(true);
    }

    private void generateNoiseImage(int width, int height) {
        // 生成随机噪声
        byte[] pixels = new byte[width * height];
        for (int i = 0; i < pixels.length; i++) {
            pixels[i] = (byte) (Math.random() * 256);
        }

        ByteProcessor bp = new ByteProcessor(width, height, pixels);
        previewImp = new ImagePlus("预览", bp);

        // 缩放到预览区域大小显示（使用ImageJ自带的缩略图功能）
        ImagePlus scaled = previewImp.resize(previewLabel.getWidth(), previewLabel.getHeight(), "bilinear");
        if (scaled != null) {
            ImageIcon icon = new ImageIcon(scaled.getImage());
            previewLabel.setIcon(icon);
            previewLabel.setText(""); // 清除文字
        }
    }
}