package commons;

import org.openqa.selenium.WebDriver;

import pageObjects.mercury.LoginPageObject;
import pageObjects.mercury.TaoNguoiDungPageObject;

public class PageGeneratorManager {

    public static LoginPageObject getLoginPage(WebDriver driver) {

    	return new LoginPageObject(driver);
    }

    public static TaoNguoiDungPageObject getTaoNguoiDungPage(WebDriver driver) {
        return new TaoNguoiDungPageObject(driver);
    }

    public static CommonPageObjects getCommonPage(WebDriver driver) {
        return new CommonPageObjects();
    }
}
