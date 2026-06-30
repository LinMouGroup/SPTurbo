import java.io.File;
import ij.IJ;
import ij.ImageJ;
import ij.plugin.PlugIn;
import ij.ImagePlus;
import ij.gui.GenericDialog;
import ij.process.FloatProcessor;

public class SPTurbo_ implements PlugIn {
    public static void main(String[] args) {
        new ImageJ();
        new SPTurbo_().run("");
    }

    @Override
    public void run(String arg) {

       // 1. 创建UI对话框，收集参数
        GenericDialog gd = new GenericDialog("SPTurbo");
        gd.addNumericField("Width (pixels):", 512, 0);
        gd.addNumericField("Height (pixels):", 512, 0);
        gd.addNumericField("Frequency (cycles/pixel):", 0.02, 3);
        gd.addNumericField("Amplitude (gray value):", 100, 0);
        gd.addCheckbox("Show result", true);

        gd.showDialog();
        if (gd.wasCanceled()) return;

        // 2. 读取用户输入
        int width = (int) gd.getNextNumber();
        int height = (int) gd.getNextNumber();
        double frequency = gd.getNextNumber();
        double amplitude = gd.getNextNumber();
        boolean showResult = gd.getNextBoolean();

        // 3. 程序化生成图像数据（完全无依赖）
        float[] pixels = new float[width * height];
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                double value = amplitude * Math.sin(2 * Math.PI * frequency * x);
                pixels[y * width + x] = (float) value;
            }
        }

        // 4. 创建ImagePlus对象并显示
        FloatProcessor fp = new FloatProcessor(width, height, pixels);
        ImagePlus imp = new ImagePlus("Results", fp);

        if (showResult) {
            imp.show(); // 这会在ImageJ中打开一个新窗口
        } else {
            String path = System.getProperty("user.home") + File.separator + "Desktop" + File.separator + "SPTurbo_result.tif";
            IJ.save(imp, path);
            IJ.log("Saving to: " + path);
            IJ.log("File saved, window not shown.");
        }
    }
}
