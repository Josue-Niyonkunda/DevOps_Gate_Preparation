import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.awt.*;

public class TestClass {
    static SortFunctionality sortFunctionality;
    @BeforeEach
    void setup() {
        sortFunctionality = new SortFunctionality();
    }

    @Test
    void sortingTest() {
        sortFunctionality.testSort("name,asc");
    }


}
