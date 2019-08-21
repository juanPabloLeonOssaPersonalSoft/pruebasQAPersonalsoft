# new feature
# Tags: optional
    
Feature: como usuario
         deseo ingresar al portal de pruebas
         para manejar componentes
    
Scenario: escenario para dar clic en el boton de iframes test
    Given usuario del portal de pruebas
    When ingreso a la seccion iframes test
    Then ver la informacion de la seccion

Scenario: escenario para dar clic en el boton de form test
    Given usuario del portal de pruebas
    When ingreso a la seccion de form test
    Then ver la informacion de la seccion form test