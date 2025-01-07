package TestClass;

import PageClass.POM_FacebookLoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class POM_FacbookLoginTest {

    String baseURL = "https://en-gb.facebook.com/login/web/";

    WebDriver TestClassChromeDriver;

    public POM_FacbookLoginTest(WebDriver testClassChromeDriver) {
    }

    @BeforeTest
    public  void BeforeTestMethod(){

        TestClassChromeDriver = new ChromeDriver();
        TestClassChromeDriver.manage().window().maximize();
        TestClassChromeDriver.get(baseURL);
    }

    @Test(priority = 1)
    public  void FacebookLoginPage() throws InterruptedException {

        POM_FacebookLoginPage loginPage = new POM_FacebookLoginPage( TestClassChromeDriver );
        loginPage.passingValuestoUserNamePasswordclickLogin("udulaeranda@yahoo.com" , "udula1997");
        Thread.sleep(3000);
        loginPage.clickLoginButton();
    }

    @Test(priority = 2)
    public  void verifyPageTitle(){

        POM_FacebookLoginPage testTitle = new POM_FacebookLoginPage( TestClassChromeDriver);
        boolean status = testTitle.verifyPageTitle();
        if(status){
            System.out.println("Page Title is correct");
        }else{
            System.out.println("Page title is wrong");
        }
    }
}
