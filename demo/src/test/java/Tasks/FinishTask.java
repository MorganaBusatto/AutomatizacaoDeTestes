package Tasks;

import org.openqa.selenium.WebDriver;

import FrameWork.Browser.Waits;
import PageObjects.CheckoutPage;
import PageObjects.FinishPage;
import PageObjects.LoginPage;
import Validations.CheckoutValidation;
import Validations.FinishValidation;
import Validations.LoginValidation;


public class FinishTask {
    
    private WebDriver driver;
    private FinishPage finishPage;
    private FinishValidation finishValidation;
    private LoginValidation loginValidation;
    private Waits wait;
    private LoginPage loginPage;
    
    
    
  //metodo construtor
    public FinishTask(WebDriver driver) {
        
        this.driver = driver;
        finishPage = new FinishPage(this.driver);
        finishValidation = new FinishValidation(driver);
        wait = new Waits(this.driver);
        loginValidation = new LoginValidation(this.driver);
        loginPage = new LoginPage(this.driver);
        
        
    
        
    }
    public void finalizarCompra() {
        //chamar a validacao da mensagem final
        finishValidation.validationMessageCompra();
        finishPage.getMenuLogoutButton().click();//clique no botao sanduiche
        //depois que eu dou o clic no botao sanduiche coloco o wait sobre o elemento
        //wait.loadElement(finishPage.getLogoutLink());
        finishPage.getLogoutLink().click();
        wait.loadElement(loginPage.getLogoText());
        loginValidation.validationLoginPage();
        
    }
    
    
        
    }
       