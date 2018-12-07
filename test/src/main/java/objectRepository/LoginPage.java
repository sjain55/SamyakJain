package objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.BaseClass;

public class LoginPage{
	/*public LoginPage(){
		PageFactory.initElements(BaseClass.driver, this);
	}*/
	
	@FindBy(id="nav-link-yourAccount")
	private WebElement login; 
	@FindBy(id="ap_email")
	private WebElement username;
	@FindBy(id="continue")
	private WebElement continue_;
	@FindBy(id="ap_password")
	private WebElement pwd;
	@FindBy(xpath=".//*[@id='auth-error-message-box']//span")
	private WebElement error;
	@FindBy(id="signInSubmit")
	private WebElement submit;
	
	public void loginToAmazon(){
		//BaseClass.launchBrowser();
		login.click();
		username.sendKeys("9620350904");
		continue_.click();
		pwd.sendKeys("dfsff");
		submit.click();
	}
	
	
	
}
