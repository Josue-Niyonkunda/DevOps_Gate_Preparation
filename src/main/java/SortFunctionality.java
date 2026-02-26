import com.microsoft.playwright.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SortFunctionality {
           public void testSort( String container){
        Playwright playwright=Playwright.create();
        Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext context=browser.newContext();
               Page page = context.newPage();
               page.navigate("https://practicesoftwaretesting.com/");
               page.selectOption("select",container);
               page.waitForSelector("[data-test='product-name']");
               List<String> names = page.locator("[data-test='product-name']").allTextContents();
               List<String> sorted = new ArrayList<>(names);
               Collections.sort(sorted);
               System.out.println(names);
               assertEquals(sorted, names);
               page.close();
               context.close();
               browser.close();
               playwright.close();


    }


    }

