package Validations;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import PageObjects.CheckoutPage;

public class CheckoutValidation {

    private WebDriver driver;
    private CheckoutPage checkoutPage;

    public CheckoutValidation(WebDriver driver) {

        this.driver = driver;
        checkoutPage = new CheckoutPage(this.driver);

    }

    public void validationFormularioPostalCode() {

        Assertions.assertFalse(checkoutPage.getPostalColdeInput().getAttribute("value").equalsIgnoreCase(" "));
        // verificando se o atributo , nome a ser colocado no campo esta vazio

    }

}