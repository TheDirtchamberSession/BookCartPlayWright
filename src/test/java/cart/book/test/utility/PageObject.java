package cart.book.test.utility;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class PageObject {

    public static Locator harryPotterAndTheChamberOfSecretsBook(Page page) {

        return page.locator("//img[contains(@src, '/Upload/9d8f4978-0ef8-42d0-873a-4eb583439237HP2.jpg')]");
    }

    public static Locator biographyOption(Page page) {

        return page.locator("//body/app-root[1]/div[1]/app-home[1]/div[1]/div[1]/div[1]/app-book-filter[1]/mat-nav-list[1]/mat-list-item[2]");
    }

    public static Locator fictionOption (Page page) {

        return page.locator("//a[contains(text(),'Fiction')]");
    }

    public static Locator searchBookField(Page page) {

        return page.locator("//input[contains(@aria-label, 'search')]");
    }

}
