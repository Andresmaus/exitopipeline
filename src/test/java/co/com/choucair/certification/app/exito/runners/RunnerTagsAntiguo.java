package co.com.choucair.certification.app.exito.runners;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/app_exito.feature",
        tags = "@caso1",
        glue = "co.com.choucair.certification.app.exito.definitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE )
public class RunnerTagsAntiguo {
}
