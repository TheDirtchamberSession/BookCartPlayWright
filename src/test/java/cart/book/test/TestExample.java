package cart.book.test;

import cart.book.test.utility.Fun;
import cart.book.test.utility.PageObject;
import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;

public class TestExample extends BeforeAll {

    @Test
    void shouldSearchWiki() {

        //Check the Url
        assertEquals(page.url(), "https://bookcart.azurewebsites.net/");
        //Click on Biography Option
        PageObject.biographyOption(page).click();
        //Click on Fiction Option
        PageObject.fictionOption(page).click();
        //Click on Search Field
        PageObject.searchBookField(page).click();
        //Search Book and pres Enter
        Fun.searchAndPressEnter(page, "Harry");
        //Click on Book
        PageObject.harryPotterAndTheChamberOfSecretsBook(page).click();

    }
}