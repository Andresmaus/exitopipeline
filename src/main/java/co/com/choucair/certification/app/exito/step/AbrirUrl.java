package co.com.choucair.certification.app.exito.step;

import co.com.choucair.certification.app.exito.pageobject.PaginaExito;
import co.com.choucair.certification.app.exito.util.Metodos;
import net.thucydides.core.annotations.Step;

public class AbrirUrl{
    private PaginaExito paginaExito;
    Metodos metodos;


    @Step
    public void appExito(){
        paginaExito.open();
    }
}
