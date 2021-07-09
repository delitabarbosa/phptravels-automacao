package steps;

import static utils.Utils.addEnvironmentAllure;
import static utils.Utils.capturarScreenshot;
import static utils.Utils.getDriver;
import static utils.Utils.killDriver;
import static utils.Utils.limparCache;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	@Before
	public void setup() throws Exception {
		getDriver();
	}

	@After
	public void fecharNavegador(Scenario scenario) throws Exception {
		capturarScreenshot(scenario);
		addEnvironmentAllure();
		limparCache();
		killDriver();
	}
}
