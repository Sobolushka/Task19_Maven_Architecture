package Tests;

import org.junit.Test;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.WebDriverWait;

public class DeleteTrash extends TstBase{
    private WebDriver driver;
    private WebDriverWait wait;
    @Test
    public void myFirstTest() throws InterruptedException {
        for (int i = 0; i < 3; i++) {
            app.GeneralPageandNewProduct();//general page
            app.ProductPage();
        }
        app.BasketPage();
    }

}
