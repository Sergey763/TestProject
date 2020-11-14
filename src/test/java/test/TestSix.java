package test;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import paje.BasePage;

public class TestSix extends TestBase {

    @Test
    public void firstTest() throws InterruptedException {
        main.goTo();
        main.chooseTsk("6");
        taskSix.fillIinLogin("tester")
                .fillInPassword("123-xyz")
                .buttonClick()
                .isLoginCorrect();
    }

}
