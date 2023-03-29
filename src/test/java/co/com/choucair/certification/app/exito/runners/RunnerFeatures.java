package co.com.choucair.certification.app.exito.runners;

import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.thucydides.core.environment.SystemEnvironmentVariables;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;

import java.net.MalformedURLException;
import java.net.URL;

public class RunnerFeatures {


    @Before
    public void test() throws MalformedURLException {
        switch (SystemEnvironmentVariables.createEnvironmentVariables().getProperty("webdriver.driver")) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                break;
            case "ie":case "iexplorer":
                WebDriverManager.iedriver().setup();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                break;
            default:
                WebDriverManager.chromedriver().setup();
                break;
        }
    }

    @Test
    public void testRunner() {
        JUnitCore.runClasses(RunnerTags.class);
    }
    @RunWith(CucumberWithSerenity.class)
    @CucumberOptions(features = "src/test/resources/features/app_exito.feature",
            tags = "@caso1",
            glue = "co.com.choucair.certification.app.exito.definitions")
    public class RunnerTags {

    }
}
