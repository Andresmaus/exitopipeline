package co.com.choucair.certification.app.exito.util;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Metodos extends PageObject {


    public Metodos() throws MalformedURLException {
    }

    public void tiempo(){
        try {
            Thread.sleep(8000);
        }catch (Exception e){
            System.out.println(e);
        }
    }

}
