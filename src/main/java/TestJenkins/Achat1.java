package TestJenkins;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Achat1 extends Tunisia_NET {

    @Test



    public void runTunisianet() throws InterruptedException {

        driver.get("https://www.tunisianet.com.tn/");

        // attendre 2 seconds
        Thread.sleep(2000);


        //mouseover informatique *****


        WebElement Informatique_Link = driver.findElement(By.xpath("//span[contains(text () ,' Informatique')]"));
        Actions actionProvider = new Actions(driver);
        // Performs mouse move action onto the element
        actionProvider.moveToElement(Informatique_Link).build().perform();


        // attendre 2 seconds
        Thread.sleep(2000);


        //Click sur le  button pc portable :: //a[@href=\"https://www.tunisianet.com.tn/301-pc-portable-tunisie\"]

        WebElement pc_portable = driver.findElement(By.xpath("//a[contains(text () ,'Pc Portable')]"));
        JavascriptExecutor pc_button = (JavascriptExecutor) driver;
        pc_button.executeScript("arguments[0].click();", pc_portable);

        //Click sur le  button chariot

        WebElement chariot = driver.findElement(By.xpath("//button[@class=\"cartb  btn-product add-to-cart wb-bt-cart wb-bt-cart_54073 wb-enable\"]"));
        JavascriptExecutor chariot_button = (JavascriptExecutor) driver;
        chariot_button.executeScript("arguments[0].click();", chariot);

        // attendre 2 seconds
        Thread.sleep(2000);

        //Click sur le  button commander *****

        //a[@href=\"//www.tunisianet.com.tn/panier?action=show\"]
        //a[contains (text() ,'Commander')]


        WebElement commander = driver.findElement(By.xpath("//a[contains (text() ,'Commander')]"));
        JavascriptExecutor commander_button = (JavascriptExecutor) driver;
        commander_button.executeScript("arguments[0].click();", commander);

        //input[@value="2"]
        //cliquer sur le bouton commander 2
        WebElement commander1 = driver.findElement(By.xpath("//a[@href=\"https://www.tunisianet.com.tn/commande\"]"));
        JavascriptExecutor commander1_button = (JavascriptExecutor) driver;
        commander1_button.executeScript("arguments[0].click();", commander1);

        // attendre 2 seconds
        Thread.sleep(2000);

        // Write email ////input[@Name=\"email\"]

        WebElement email1 = driver.findElement(By.xpath("//*[@id=\"login-form\"]/section/div[1]/div[1]/input"));
        JavascriptExecutor email_xx = (JavascriptExecutor) driver;
        email_xx.executeScript("arguments[0].value='trabelsifarou9@gmail.com';", email1);

        // Write pass_word // //input[@Name=\"password\

        WebElement pass = driver.findElement(By.xpath("//*[@id=\"login-form\"]/section/div[2]/div[1]/div/input"));
        JavascriptExecutor pass_word = (JavascriptExecutor) driver;
        pass_word.executeScript("arguments[0].value='12345';", pass);

        // attendre 2 seconds
        Thread.sleep(4000);

        //Click sur le  button continuer //button[@class="continue btn btn-primary float-xs-right"]

        WebElement continuer = driver.findElement(By.xpath("//*[@id=\"login-form\"]/footer/button"));
        JavascriptExecutor CNT_button = (JavascriptExecutor) driver;
        CNT_button.executeScript("arguments[0].click();", continuer);


    }
}
