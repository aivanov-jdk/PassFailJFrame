import javax.swing.JFrame;

public class SampleManualTest {
    private static final String INSTRUCTIONS =
            "Click Pass, or click Fail if the test failed.";

    public static void main(String[] args) throws Exception {
        PassFailJFrame.builder()
                      .instructions(INSTRUCTIONS)
                      .testUI(SampleManualTest::createTestUI)
                      .build()
                      .awaitAndCheck();
    }

    private static JFrame createTestUI() {
        JFrame testUI = new JFrame("Test UI");
        testUI.setSize(250, 150);
        return testUI;
    }
}
