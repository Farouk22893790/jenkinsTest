package TestJenkins;

import org.junit.After;
import org.junit.Before;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;




    public class Tunisia_NET  {
        WebDriver driver;


        @Before
        public void OpenTUNISIA_Net()
        {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();

            //Open Tunisianet

        }





        @After
        public void finish(){
            driver.quit();
        }



    }






