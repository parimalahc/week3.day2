package week3.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListImplementation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.name("searchVal")).sendKeys("bags");
		driver.findElement(By.className("ic-search")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		Thread.sleep(2000);
		String noOfItems = driver.findElement(By.xpath("//div[@class='length']")).getText();
		System.out.println("Total number of items displayed: "+noOfItems);
		System.out.println("List of brands: ");
		List<WebElement> brandsList = driver.findElements(By.xpath("//div[@class='brand']"));
		System.out.println("Brands size: "+brandsList.size());
		for(int i=0;i<brandsList.size();i++) {
			System.out.println(brandsList.get(i).getText());
		}
		System.out.println("List of bags names: ");
		List<WebElement> bagsNamesList = driver.findElements(By.xpath("//div[@class='nameCls']"));
		System.out.println("Bags names size: "+bagsNamesList.size());
		for(int i=0;i<bagsNamesList.size();i++) {
			System.out.println(bagsNamesList.get(i).getText());
		}

	}

}
