package sort;

import com.microsoft.playwright.*;

public class SortFunctionality {
    public SortFunctionality testSortFunctionality;
           public void testSort(){
        Playwright playwright=Playwright.create();
        Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext context=browser.newContext();
        Page page= browser.newPage();
        page.navigate("https://practicesoftwaretesting.com/");
        page.locator("[data-test='sort']").selectOption("name,asc");
       // //page.locator("[data-test='product-name']")
        Page page1= context.newPage();
                page1.navigate("https://practicesoftwaretesting.com/");
                page1.locator("[data-test='sort']").selectOption("name,asc");
                Page page2= context.newPage();
                page2.navigate("https://practicesoftwaretesting.com/");
                page2.locator("[data-test='sort']").selectOption("name,desc");
                Page page3= context.newPage();
                page3.navigate("https://practicesoftwaretesting.com/");
                page3.locator("[data-test='sort']").selectOption("price,asc");
                Page page4= context.newPage();
                page4.navigate("https://practicesoftwaretesting.com/");
                page4.locator("[data-test='sort']").selectOption("co2_rating,asc");
                Page page5= context.newPage();
                page5.navigate("https://practicesoftwaretesting.com/");
                page5.locator("[data-test='sort']").selectOption("co2_rating,desc");


    }


    }

