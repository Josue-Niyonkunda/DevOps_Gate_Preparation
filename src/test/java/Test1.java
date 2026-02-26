import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.awt.*;

public class Test1 extends GuiCalculator {
    // git actions exercises by simple calculator
     @Test
    public void test() {
        if (!GraphicsEnvironment.isHeadless()) {
            SwingUtilities.invokeLater(() -> new GuiCalculator().setVisible(true));
        } else {
            System.out.println("Running in CI — GUI disabled");
        }
    }

}
