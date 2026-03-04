import com.microsoft.playwright.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortFunctionality {

    public List<String> getProductNames(String sortOption) {

        try (Playwright playwright = Playwright.create()) {

            Browser browser = playwright.chromium()
                    .launch(new BrowserType.LaunchOptions().setHeadless(true));

            BrowserContext context = browser.newContext();
            Page page = context.newPage();

            page.navigate("https://practicesoftwaretesting.com/");

            // Select sorting option
            page.selectOption("[data-test='sort']", sortOption);

            // Wait for products to be visible
            page.waitForSelector("[data-test='product-name']");

            // Collect and return trimmed product names
            return page.locator("[data-test='product-name']")
                    .allTextContents()
                    .stream()
                    .map(String::trim)
                    .collect(Collectors.toList());
        }
    }

    @Test
    void verifyProductsAreSortedAscending() {

        SortFunctionality sf = new SortFunctionality();

        List<String> actualNames = sf.getProductNames("name,asc");

        List<String> expectedNames = new ArrayList<>(actualNames);
        expectedNames.sort(String.CASE_INSENSITIVE_ORDER);

        System.out.println("Actual: " + actualNames);
        System.out.println("Expected: " + expectedNames);

        assertEquals(expectedNames, actualNames,
                "Product names are not sorted correctly!");
    }
}