package steps;

import static utils.Utils.driver;
import static utils.Utils.validarMensagem;
import static org.junit.Assert.assertTrue;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import pages.PageObjects;

public class StepsDefinitions {

	PageObjects pg = new PageObjects();

	@Dado("que o usuario acesse o site phptravels")
	public void queOUsuarioAcesseOSitePhptravels() throws Exception {
		pg.acessarSite("https://www.phptravels.net/admin");
		assertTrue(driver.getPageSource().contains("Login Panel"));
	}

	@Dado("que o usuario preencha email {string} e senha {string}")
	public void queOUsuarioPreenchaEmailESenha(String login, String password) throws Exception {
		pg.preencherEmailSenha(login, password);
	}

	@Entao("o sistema exibe na tela a mensagem {string}")
	public void oSistemaExibeNaTelaAMensagem(String mensagem) throws Exception {
		validarMensagem(mensagem);
	}
}
