#Author:vagnernodi29@gmail.com

Feature: Buscar Produtos
 Como cliente de uma loja virtual
 Desejo buscar produtos
 Para coloca-los em um carrinho e realizar compras

  
  Scenario: Realizar Busca
    Given que acesso o site de compras "https://www.saucedemo.com/inventory.html"
    When Realizo busca do Produto "Jaqueta de lã da Sauce Labs"
    Then Vejo o resultado e valido as informaçoes 
   