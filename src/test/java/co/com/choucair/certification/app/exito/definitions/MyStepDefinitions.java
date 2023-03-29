package co.com.choucair.certification.app.exito.definitions;

import co.com.choucair.certification.app.exito.step.AbrirUrl;
import co.com.choucair.certification.app.exito.step.BuscarProducto;
import co.com.choucair.certification.app.exito.step.VerificacionEscenario;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.net.MalformedURLException;


public class MyStepDefinitions {
    @Steps
    AbrirUrl abrirUrl;
    @Steps
    BuscarProducto buscarProducto;
    @Steps
    VerificacionEscenario verificacionEscenario;


    @Given("que Andres ingresa a la app Exito")
    public void queAndresIngresaALaAppExito() throws MalformedURLException {
        abrirUrl.appExito();
    }

    @When("busca un producto iPhone y lo agrega al carrito")
    public void buscaUnProductoIPhoneYLoAgregaAlCarrito() {
        buscarProducto.producto();
        buscarProducto.agregarCarrito();
    }

    @Then("verifica que pudo agregar correctamente el producto")
    public void verificaQuePudoAgregarCorrectamenteElProducto() {
        verificacionEscenario.verificar();
    }
}
