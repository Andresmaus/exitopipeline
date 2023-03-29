package co.com.choucair.certification.app.exito.step;

import co.com.choucair.certification.app.exito.pageobject.PaginaExito;
import co.com.choucair.certification.app.exito.pageobject.Repositorio;
import co.com.choucair.certification.app.exito.util.Metodos;
import net.thucydides.core.annotations.Step;

public class BuscarProducto {
    private Repositorio repositorio;
    private PaginaExito pe;
    Metodos metodos;

    @Step
    public void producto() {
            metodos.tiempo();
            repositorio.txt_buscador_exito.sendKeys("iPhone");
            repositorio.btn_buscador.click();
            metodos.tiempo();

    }


    public void agregarCarrito() {
        repositorio.btn_agregar_carrito.click();
        repositorio.btn_carrito.click();
        metodos.tiempo();
        repositorio.btn_pagar.click();
    }
}
