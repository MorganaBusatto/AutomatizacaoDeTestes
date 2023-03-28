package Tasks;

import org.openqa.selenium.WebDriver;

import FrameWork.Utils.FakersGeneration;
import PageObjects.CheckoutPage;
import Validations.CheckoutValidation;
import Validations.GenericValidation;

public class CheckoutTask {

    private WebDriver driver;
    private CheckoutPage checkoutPage;
    private GenericValidation genericValidation;
    private FakersGeneration fakers;
    private CheckoutValidation checkoutValidation;

    // metodo construtor
    public CheckoutTask(WebDriver driver) {

        this.driver = driver;
        checkoutPage = new CheckoutPage(this.driver);
        genericValidation = new GenericValidation(this.driver);
        fakers = new FakersGeneration();
        checkoutValidation = new CheckoutValidation(this.driver);

    }

    public void preencherFormulario() {

        // checkoutValidation.validationCheckoutPage();
        genericValidation.validationPages("Checkout: Your Information");// validacao do texto
        checkoutPage.getFirstNameInput().sendKeys(fakers.getFirstName());
        checkoutPage.getLastNameInput().sendKeys(fakers.getLastName());
        checkoutPage.getPostalColdeInput().sendKeys(fakers.getZipCode());
        // agora vai fazer validacao se foi preenchido os campos
        checkoutValidation.validationFormularioPostalCode();// verificar
        checkoutPage.getContinueButton().click();
        // vou validar que fui para pagina checkoutowerview
        genericValidation.validationPages("Checkout: Overview");
        genericValidation.validationProduto();// para ver se o produto ta na tela
        // depois clico no botao finish
        checkoutPage.getFinishButton().click();

    }

}
