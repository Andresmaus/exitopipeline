package co.com.choucair.certification.app.exito.runners;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.net.URL;

import java.net.MalformedURLException;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/app_exito.feature",
        tags = "@caso1",
        glue = "co.com.choucair.certification.app.exito.definitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class RunnerDocker implements DriverSource {

    @Override
    public WebDriver newDriver() {
        String hubUrl = "http://localhost:4444";
        ChromeOptions options = new ChromeOptions();
        RemoteWebDriver driver = null;
        try {
            driver = new RemoteWebDriver(new URL(hubUrl), options);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        return driver;
    }

    @Override
    public boolean takesScreenshots() {
        return true;
    }

}
