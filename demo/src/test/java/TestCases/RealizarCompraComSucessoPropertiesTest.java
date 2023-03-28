package TestCases;

import javax.security.auth.login.LoginContext;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import FrameWork.TestBase;
import Tasks.CheckoutTask;
import Tasks.FinishTask;
import Tasks.LoginTask;
import Tasks.ProdutoTask;
import Validations.CheckoutValidation;

public class RealizarCompraComSucessoPropertiesTest extends TestBase{

    
    private WebDriver driver = getDriverManager();
    
    LoginTask loginTask = new LoginTask(driver);
    ProdutoTask produtoTask = new ProdutoTask(driver);
    CheckoutTask checkoutTask = new CheckoutTask(driver);
    FinishTask finishTask = new FinishTask(driver);
    
    @Test
    public void realizarCompra() {
        
       // String user= FileOperation.getProperties("user").getProperty("user");
       // String password = FileOperation.getProperties("user").getProperty("password");
       // loginTask.efetuarLoginParametrizado(user, password);
        loginTask.efetuarloginProperties();
        produtoTask.selecionarProduto();
        checkoutTask.preencherFormulario();
        finishTask.finalizarCompra();
        
    }
}