package pages;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import elementos.Elementos;

public class Metodos {

	static WebDriver driver;
	Elementos elemento = new Elementos();
	JavascriptExecutor java = (JavascriptExecutor) driver;

	public void abrirNavegador(String urlApp) throws InterruptedException {
		// Configurar navegador
		System.setProperty("webdriver.chrome.driver", "C:\\driver90\\chromedriver.exe");
		// abrir uma pag web
		driver = new ChromeDriver();
		// acessar site
		driver.get(urlApp);
		// maximizar o site
		driver.manage().window().maximize();

	}

	public void clicar(By elemento) throws InterruptedException {

		driver.findElement(elemento).click();
	}

	public void preencher(By elemento, String texto) throws InterruptedException {

		driver.findElement(elemento).sendKeys(texto);

	}

	public void esperar(int tempo) throws InterruptedException {

		Thread.sleep(tempo);

	}

	public void fecharNavegador() throws InterruptedException {
		driver.quit();
	}

	public void validarTexto(By elemento, String textoAguardado) {

		String txt = driver.findElement(elemento).getText();
		System.out.println("Texto apresentado na tela: " + txt);
		assertEquals(textoAguardado, txt);

	}

	public void screenShot(String nome) throws IOException {

		TakesScreenshot srcShot = ((TakesScreenshot) driver);
		File SrcFile = srcShot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File("./src/evidencias/" + nome + ".png");
		FileUtils.copyFile(SrcFile, DestFile);
	}

	public void preencherDadosCadastrais(String nome, String sobrenome, String cep, String senha, String confirma) {

		driver.findElement(By.id("First name")).sendKeys(nome);
		driver.findElement(By.id("Last name")).sendKeys(sobrenome);
		driver.findElement(By.id("Zip/Postal/Code")).sendKeys(cep);
		
	}

	public void esperarElemento(By elemento) {

		(new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated((elemento)));

	}

	public void Scroll() {
		((JavascriptExecutor) driver).executeScript("scroll(0,200)");
	}
	public void ElementExists(By elemento, String txtEsperado) throws InterruptedException {

		String texto = driver.findElement(elemento).getText();
		Assert.assertTrue(texto.contains(txtEsperado));
		System.out.println("Texto apresentado na tela: " + txtEsperado);
	}
}
