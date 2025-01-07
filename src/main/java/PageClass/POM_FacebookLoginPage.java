package PageClass;


import org.testng.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POM_FacebookLoginPage {

    //Identify web element usin By  class
    By username = By.xpath("//input[@id='email']");

    By passWord = By.xpath("//input[@id='pass']");

    By loginbutton = By.name("login");

    //Defining the webDriver
    WebDriver PageClassWebDriver;

    //creating a constructor to pass value from test class
    public POM_FacebookLoginPage(WebDriver TestClassParameterDriver){

        this.PageClassWebDriver = TestClassParameterDriver;
    }

    //Initialize Methods
    public  void typeUserName(String userName){

            PageClassWebDriver.findElement(username).sendKeys(userName);
    }

    public  void typePassword(String password){

            PageClassWebDriver.findElement(passWord).sendKeys(password);
    }

    public  void clickLoginButton(){

            PageClassWebDriver.findElement(loginbutton).click();
    }

     public  void  passingValuestoUserNamePasswordclickLogin( String TxtuserName , String Txtpassword){

            PageClassWebDriver.findElement(username).sendKeys(TxtuserName);
            PageClassWebDriver.findElement(passWord).sendKeys(Txtpassword);
            PageClassWebDriver.findElement(loginbutton).click();
     }

     public  boolean verifyPageTitle(){

         Assert.assertEquals("Facebook" , PageClassWebDriver.getTitle());
         return true;
     }
}
