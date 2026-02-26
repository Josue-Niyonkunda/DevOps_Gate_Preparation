import javax.swing.*;
import java.awt.*;

public class Test extends GuiCalculator {
    // git actions exercises by simple calculator app
    public static void main(String[] args) {
        if (!GraphicsEnvironment.isHeadless()) {
            SwingUtilities.invokeLater(() -> new GuiCalculator().setVisible(true));
        } else {
            System.out.println("Running in CI — GUI disabled");
        }
    }

}
