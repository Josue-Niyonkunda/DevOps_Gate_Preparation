
import com.microsoft.playwright.*;

import java.util.ArrayList;
import java.util.List;

public class SortFunctionality {

    public List<String> getProductNames(String sortOption) {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium()
                .launch(new BrowserType.LaunchOptions().setHeadless(true));
        BrowserContext context = browser.newContext();
        Page page = context.newPage();
        page.navigate("https://practicesoftwaretesting.com/");
        page.selectOption("select", sortOption);
        page.waitForTimeout(2000);
        page.waitForSelector("[data-test='product-name']");

        // Get and trim product names
        List<String> names = page.locator("[data-test='product-name']")
                .allTextContents()
                .stream()
                .map(String::trim)
                .toList();

        page.close();
        context.close();
        browser.close();
        playwright.close();

        return names;
    }
}