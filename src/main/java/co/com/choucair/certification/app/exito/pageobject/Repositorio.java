package co.com.choucair.certification.app.exito.pageobject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class Repositorio extends PageObject {

    @FindBy(css = "#downshift-0-input")
    public WebElementFacade txt_buscador_exito;

    @FindBy(css = "#header-container > div.exito-header-3-x-searchBar > div.exito-header-3-x-searchContentWeb > div > div.w-100.mw7.pv4.vtex-store-components-3-x-searchBarContainer > div > div.vtex-store-components-3-x-autoCompleteOuterContainer > div > label > div > span > div > button")
    public WebElementFacade btn_buscador;

    @FindBy(css = "#gallery-layout-container > div:nth-child(1) > section > a > article > div.pointer.pt3.pb4.flex.flex-column.h-100 > div.vtex-flex-layout-0-x-flexRow.vtex-flex-layout-0-x-flexRow--product-info-container > div > div > div > div:nth-child(5) > div > div.exito-vtex-components-4-x-mainBuyButton > div.exito-vtex-components-4-x-buyButton.productSummaryBuyButtonProductRich > button > div > div")
    public WebElementFacade btn_agregar_carrito;

    @FindBy(css = "#header-container > div.exito-header-3-x-searchBar > div.exito-header-3-x-headerLinks > div > div > div.mr6 > div > a > div > svg")
    public WebElementFacade btn_carrito;

    @FindBy(css = "#cart-to-orderform")
    public WebElementFacade btn_pagar;

    @FindBy(css = "#orderform-title")
    public WebElementFacade lbl_finalizar_compra;

}
