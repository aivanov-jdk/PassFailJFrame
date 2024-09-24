import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class SampleOldManualTest {
    private static final String INSTRUCTIONS =
            "Click Pass, or click Fail if the test failed.";

    public static void main(String[] args) throws Exception {
        PassFailJFrame passFail = new PassFailJFrame(INSTRUCTIONS);
        SwingUtilities.invokeAndWait(() -> createTestUI());
        passFail.awaitAndCheck();
    }

    private static void createTestUI() {
        JFrame testUI = new JFrame("Test UI");
        testUI.setSize(250, 150);
        PassFailJFrame.addTestWindow(testUI);
        PassFailJFrame.positionTestWindow(testUI, PassFailJFrame.Position.HORIZONTAL);
        testUI.setVisible(true);
    }
}
