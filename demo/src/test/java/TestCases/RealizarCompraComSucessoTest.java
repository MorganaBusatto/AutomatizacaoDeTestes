package TestCases;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import FrameWork.TestBase;
import PageObjects.CheckoutPage;
import Tasks.CheckoutTask;
import Tasks.FinishTask;
import Tasks.LoginTask;
import Tasks.ProdutoTask;

//aqui é o unico lugar que o WebDriver vai usar, nos outros tem que colocar
//herda da TestBase
public class RealizarCompraComSucessoTest extends TestBase {

    private WebDriver driver = getDriverManager();
    LoginTask loginTask = new LoginTask(driver);
    ProdutoTask produtoTask = new ProdutoTask(driver);
    CheckoutTask checkoutTask = new CheckoutTask(driver);
    FinishTask finishTask = new FinishTask(driver);

    @Test
    public void realizarCompra() {
        loginTask.efetuarLogin();
        produtoTask.selecionarProduto();
        checkoutTask.preencherFormulario();
        finishTask.finalizarCompra();

    }

}
//metodo normal, com parametros fixos