package cart.book.test.utility;

import com.microsoft.playwright.Page;

public class Fun {


    public static void searchAndPressEnter (Page page, String bookTitle) {

        PageObject.searchBookField(page).fill(bookTitle);
        PageObject.searchBookField(page).press("Enter");
    }
}
