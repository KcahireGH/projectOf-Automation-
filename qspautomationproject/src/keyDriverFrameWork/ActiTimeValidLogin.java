package keyDriverFrameWork;

import java.io.IOException;

import org.openqa.selenium.By;

public class ActiTimeValidLogin extends BaseTest {
public static void main(String[] args) throws IOException, InterruptedException {

          BaseTest bt = new BaseTest();
          Flib flib = new Flib();
          
          
          String username = flib.readPropertyFile("./data/configu.properties", "username");
          String password = flib.readPropertyFile("./data/configu.properties", "password");
          
          bt.openBrowser();
          Thread.sleep(3000);
          
          driver.findElement(By.name("username")).sendKeys("username");
          Thread.sleep(2000);
          driver.findElement(By.name("pwd")).sendKeys("password");
          Thread.sleep(2000);
          driver.findElement(By.id("loginButton")).click();
          
          Thread.sleep(5000);
          bt.closeBrowser();

}
}
