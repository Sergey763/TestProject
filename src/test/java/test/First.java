package test;

import org.junit.jupiter.api.Test;

public class First extends TestBase {


    @Test
    public void testFirst() {
        main.goTo();
        main.chooseTsk("1");
        taskOne.checkElementIsCorrect();
    }

//    @Test
//    public void testSecond() {
//        driver.get(SITE_URL);
//    }
}
