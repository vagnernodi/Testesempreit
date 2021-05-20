package testes;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Metodos;

public class Steps {

	Metodos metodo = new Metodos();
	Elementos elemento = new Elementos();

	@Given("que acesso o site de compras {string}")
	public void que_acesso_o_site_de_compras(String string) throws Throwable {

		metodo.abrirNavegador(string);

	}

	@When("Realizo busca do Produto {string}")
	public void realizo_busca_do_produto(String string) throws Throwable {
		metodo.esperar(2000);
		metodo.preencher(elemento.preencher, "standard_user");
		metodo.preencher(elemento.PrencherSenha, "secret_sauce");
		metodo.esperar(2000);
		metodo.clicar(elemento.ClicarLogin);
		metodo.clicar(elemento.Jaqueta);
		metodo.esperar(2000);
		metodo.clicar(elemento.AdicionarProdutoCarrinho);
		metodo.clicar(elemento.ComprarJaqueta);
		metodo.esperar(2000);
		metodo.clicar(elemento.BotãoCheckout);
		metodo.esperar(2000);
		metodo.preencher(elemento.Nome, "Vagner");
        metodo.preencher(elemento.SobreNome, "França");
        metodo.preencher(elemento.Cep, "00786-000");
    	metodo.esperar(2000);
        metodo.clicar(elemento.Continuar);
  
        
	}

	@Then("Vejo o resultado e valido as informaçoes")
	public void vejo_o_resultado_e_valido_as_informaçoes()throws Throwable {
		metodo.esperar(2000);
		metodo.clicar(elemento.BtnFinish);
		metodo.esperar(2000);
		metodo.ElementExists(elemento.ValidarCompra, "THANK YOU FOR YOUR ORDER");
		metodo.fecharNavegador();
	}
}
