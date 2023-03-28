package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {

    private WebDriver driver;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;

    }

    public WebElement getFirstNameInput() {
        return driver.findElement(By.id("first-name"));
        //metodo get chama o primeiro espaço first name , retorna o elemento que procurou
    }

    public WebElement getLastNameInput() {

        return driver.findElement(By.id("last-name"));
      //metodo get chama o primeiro espaço lats name , retorna o elemento que procurou
    }

    public WebElement getPostalColdeInput() {
        
        return driver.findElement(By.id("postal-code"));
      //metodo get chama o codigo postao e usa o metodo find Element para encontrar o objeto
        
    }
    public WebElement getContinueButton() {//botao continue
        
        return driver.findElement(By.id("continue"));
        
    
        
    }

    public WebElement getFinishButton() {
        
        return driver.findElement(By.id("finish"));
        //foi colocado o botao finish aqui
    }

   
    
        
        
        
        

}