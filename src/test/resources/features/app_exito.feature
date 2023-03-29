#Autor: Andres Sanchez
  @HUsuario
  Feature: Verificar el funcionamiento correcto del carrito en la app EXITO
    Yo como usuario
    Quiero ingresar a la app EXITO
    Para agregar un producto al carrito y verificar que este se agrego
    @caso1
    Scenario: Verificar el funcionamiento correcto del carrito
      Given que Andres ingresa a la app Exito
      When busca un producto iPhone y lo agrega al carrito
      Then verifica que pudo agregar correctamente el producto

