package paje;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TaskOne extends BasePage {

    public TaskOne(WebDriver driver) {
        super(driver);
    }

    public void checkElementIsCorrect() {
        isElemntisplayed(By.xpath("//li[text() = 'Zadanie 1']"));
    }
}
