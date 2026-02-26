import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sort.SortFunctionality;

import javax.swing.*;
import java.awt.*;

public class TestClass extends GuiCalculator {
    static SortFunctionality sortFunctionality;
    // git actions exercises by simple calculator


     @AfterAll
     public static void testCalculator() {
        if (!GraphicsEnvironment.isHeadless()) {
            SwingUtilities.invokeLater(() -> new GuiCalculator().setVisible(true));
        } else {
            System.out.println("Running in CI — GUI disabled");
        }

    }

    @BeforeEach
    void setup() {
        sortFunctionality = new SortFunctionality();
    }

    @Test
    void sortingTest() {
        sortFunctionality.testSort();
    }


}
