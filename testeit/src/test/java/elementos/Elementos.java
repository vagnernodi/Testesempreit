package elementos;

import org.openqa.selenium.By;

public class Elementos {
	
	public By preencher = By.cssSelector("#user-name");

	public By PrencherSenha = By.cssSelector("#password");
	public By ClicarLogin = By.cssSelector("#login-button");
	public By Jaqueta = By.cssSelector("#item_5_title_link > div");
	public By AdicionarProdutoCarrinho = By.cssSelector("#add-to-cart-sauce-labs-fleece-jacket");
	public By ComprarJaqueta = By.cssSelector("#shopping_cart_container > a");
	public By BotãoCheckout = By.cssSelector("#checkout");
	public By Nome = By.cssSelector("#first-name");
	public By SobreNome = By.cssSelector("#last-name");
	public By Cep = By.cssSelector("#postal-code");
	public By Continuar = By.cssSelector("#continue");
	public By BtnFinish = By.cssSelector("#finish");
	public By ValidarCompra = By.cssSelector("#checkout_complete_container > h2");
	
}
