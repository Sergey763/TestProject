package paje;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Main extends BasePage {

    String SITE_URL = "https://buggy-testingcup.pgs-soft.com/";

    public Main(WebDriver driver) {
        super(driver);
    }

    public void goTo() {
        driver.get(SITE_URL);
    }

    public void chooseTsk(String taskNumber) {
        click(By.xpath("//h2[text() = 'Zadanie " + taskNumber + "']"));
    }
}
