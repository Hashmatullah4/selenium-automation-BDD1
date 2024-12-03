package pages.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleMainPage {

    public WebDriver driver;

    //WebElements
    public WebElement aboutButton;

    public GoogleMainPage(WebDriver driver) {
        this.driver = driver;
        this.aboutButton = driver.findElement(By.xpath("//a[text()='About']"));
    }

    public void clickOnAboutButton() {
        this.aboutButton.click();
    }
}
