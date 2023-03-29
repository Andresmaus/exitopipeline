package co.com.choucair.certification.app.exito.step;


import co.com.choucair.certification.app.exito.pageobject.Repositorio;
import net.thucydides.core.annotations.Step;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class VerificacionEscenario {
    private Repositorio repositorio;
    @Step
    public void verificar() {
        assertThat(repositorio.lbl_finalizar_compra.isCurrentlyVisible(), is(true));
    }
}
