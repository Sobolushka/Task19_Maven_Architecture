package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GeneralPage extends Page {
    public GeneralPage(WebDriver driver){ super(driver);}
    public void Generalpage1()
    {
       driver.get("http://localhost/litecart/en/");//general page

    }
    public void newproductpage() {
        driver.findElement(By.cssSelector("#box-most-popular [class = 'product column shadow hover-light']")).click();
    }
}
