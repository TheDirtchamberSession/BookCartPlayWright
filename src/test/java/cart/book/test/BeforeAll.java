package cart.book.test;

import com.microsoft.playwright.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BeforeAll {

    static Playwright playwright;
    static Browser browser;

    BrowserContext context;
    Page page;

    @BeforeClass
    static void launchBrowser() {
        playwright = Playwright.create();
        browser = playwright.chromium().launch();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

    }

    @AfterClass
    static void closeBrowser() {

        playwright.close();
    }

    @BeforeMethod
    void createContextAndPage() {
        context = browser.newContext();
        page = context.newPage();
        page.onConsoleMessage(message -> System.out.println("Console message: " + message.text()));
        page.onRequest(request -> System.out.println("Request: " + request.url()));
        page.navigate("https://bookcart.azurewebsites.net/");
        page.setViewportSize(1920, 1080);
    }

    @AfterMethod
    void closeContext() {
        context.close();
    }
}
