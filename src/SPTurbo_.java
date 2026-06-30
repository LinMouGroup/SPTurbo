import ij.IJ;
import ij.ImageJ;
import ij.plugin.PlugIn;

public class SPTurbo_ implements PlugIn {
    public static void main(String[] args) {
        new ImageJ();
        new SPTurbo_().run("");
    }

    @Override
    public void run(String arg) {
        IJ.showMessage("Hello ImageJ", "This is the simplest ImageJ plugin.");
    }
}
