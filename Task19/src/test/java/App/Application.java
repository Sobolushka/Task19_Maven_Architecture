package App;

import Pages.BasketTrashPage;
import Pages.GeneralPage;
import Pages.ProductPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;
import static org.openqa.selenium.support.ui.ExpectedConditions.not;

public class Application {
    private WebDriver driver;
    private WebDriverWait wait;
    private GeneralPage Generalpage;
    private ProductPage productPage;
    private BasketTrashPage basketTrashPage;
    public Application() {
        driver = new ChromeDriver();
        Generalpage = new GeneralPage(driver);
        productPage = new ProductPage(driver);
        basketTrashPage = new BasketTrashPage(driver);
    }
    public void quit(){
        driver.quit();
    }
    public void GeneralPageandNewProduct()
    {
        Generalpage.Generalpage1();
        Generalpage.newproductpage();
    }
    public void ProductPage()
    {
        String oldcount = productPage.countItems();
        productPage.AddNewProduct(oldcount);
    }
    public void BasketPage()
    {
        basketTrashPage.openbasket();
        basketTrashPage.deleteTrash();
    }
}
