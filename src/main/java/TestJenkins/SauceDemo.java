package TestJenkins;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class SauceDemo {
    //le point à partir duquel le programme démarre son exécution
    public static void main(String[] args) {


        // Recherche la dernière version du binaire WebDriver spécifié
        WebDriverManager.chromedriver().setup();

        //instancier l'instance Selenium WebDriver avec ChromeDriver.
        ChromeDriver driver = new ChromeDriver();

        //OUVRIR UN SITE WEB:
        driver.get("https://www.saucedemo.com/");

        //Manage
        driver.manage().window().maximize();

        //get current url
        String currentt = driver.getCurrentUrl();
        System.out.println("l'url current est    " + currentt);

        //get title :
        String titre = driver.getTitle();
        System.out.println("le titre de la page  est    " + titre);

        // get source page
        String SOURCE = driver.getPageSource();
        System.out.println(" la source de la page est       " + SOURCE);

        //get window handle
        String handle = driver.getWindowHandle();
        System.out.println("handle window est      " + handle);

        // get size   !!!!!
        Dimension size = driver.findElement(By.xpath("//input[@id='user-name']")).getSize();
        System.out.println("le size de cet element est     " + size);

        //get attribut

        String attributee = driver.findElement(By.xpath("//input[@id='user-name']")).getAttribute("type");
        System.out.println("le nom d'attribut de cet element est     " + attributee);

        //get tag name

        String xxx = driver.findElement(By.xpath("//input[@id='user-name']")).getTagName();
        System.out.println("le tagname de cet element est   " + xxx);

        //get location !!!!!

        Point Location = driver.findElement(By.xpath("//input[@id='user-name']")).getLocation();
        System.out.println("l'emplacement de cet element  est     " + Location);

        driver.close();
    }
}
