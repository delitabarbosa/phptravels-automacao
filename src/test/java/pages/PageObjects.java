package pages;

import static utils.Utils.driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjects {

	public PageObjects() {
		PageFactory.initElements(driver, this);
	}

	// ELEMENTOS

	@FindBy(xpath = "/html/body/div[2]/form[1]/div[1]/label[1]/input")
	public WebElement email;

	@FindBy(xpath = "/html/body/div[2]/form[1]/div[1]/label[2]/input")
	public WebElement senha;

	@FindBy(xpath = "/html/body/div[2]/form[1]/button")
	public WebElement btnLogin;

	// MÉTODOS

	public void acessarSite(String site) throws Exception {
		driver.get(site);
	}

	public void preencherEmailSenha(String login, String password) throws Exception {
		email.sendKeys(login);
		senha.sendKeys(password);
		btnLogin.click();
	}
}
