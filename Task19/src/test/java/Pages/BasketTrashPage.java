package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class BasketTrashPage extends Page {
    public BasketTrashPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy (css = ".dataTable")
    public WebElement datatable;

    public void openbasket()
    {
        driver.findElement(By.cssSelector("#cart .link")).click();
    }
    private int row()
    {
        return datatable.findElements(By.cssSelector("tr")).size() - 5;
    }
    public void deleteTrash() {
        wait.until(presenceOfElementLocated(By.cssSelector(".dataTable tr")));
        for (int i = 0; i < row(); ++i) {
            WebElement table = driver.findElement(By.cssSelector(".dataTable"));
            wait.until(elementToBeClickable(By.cssSelector("button[name=remove_cart_item]")));
            driver.findElement(By.cssSelector("button[name=remove_cart_item]")).click();
            wait.until(stalenessOf(table));
            if (i != row() - 1) {
                wait.until(visibilityOfElementLocated(By.cssSelector(".dataTable")));//после удаления таблицы нет строк
            }
        }
    }
}
