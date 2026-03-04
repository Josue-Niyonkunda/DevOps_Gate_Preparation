

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortFunctionalityTest {

    @Test
    void sortingTest() {
        SortFunctionality sf = new SortFunctionality();

        // Get actual product names from the website
        List<String> actualNames = sf.getProductNames("name,asc");

        // Create expected sorted list (case-insensitive)
        List<String> expectedNames = new ArrayList<>(actualNames);
        expectedNames.sort(String.CASE_INSENSITIVE_ORDER);

        System.out.println("Actual: " + actualNames);
        System.out.println("Expected: " + expectedNames);

        assertEquals(expectedNames, actualNames, "Product names are not sorted correctly!");
    }
}