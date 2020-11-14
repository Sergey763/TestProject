package paje;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static java.lang.Thread.sleep;

public class TaskSix extends BasePage {

    public TaskSix(WebDriver driver) {
        super(driver);
    }

    public TaskSix fillIinLogin(String login) throws InterruptedException {
        sleep(500);
//        WebElement element = driver.findElement(By.id("LoginForm__username"));
//        element.sendKeys(login);
        writeText(By.id("LoginForm__username"),login);
        return this;
    }

    public TaskSix fillInPassword(String password) {
//        driver.findElement(By.name("LoginForm[_password]")).sendKeys(password);
        writeText(By.name("LoginForm[_password]"), password);
        return this;
    }

    public TaskSix buttonClick() {
//        driver.findElement(By.cssSelector(".btn-default.btn")).click();
        click(By.cssSelector(".btn-default.btn"));
        return this;
    }

    public TaskSix isLoginCorrect() {
//        driver.findElement(By.linkText("Pobierz plik")).isDisplayed();
        isElemntisplayed(By.linkText("Pobierz plik"));
        return this;
    }

    public void writeText(By elementBy, String text) {
        waitvisability(elementBy);
        WebElement element = driver.findElement(elementBy);
        element.clear();
        element.sendKeys(text);

    }

}
