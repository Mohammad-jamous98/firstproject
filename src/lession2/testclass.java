package lession2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testclass {

	WebDriver driver = new EdgeDriver();

	String THEWEBSITE = "https://www.saucedemo.com/";

	@BeforeTest

	public void mysetup() {

		driver.manage().window().maximize();

		driver.get(THEWEBSITE);

	}

	@Test(priority = 1)

	public void Login() throws InterruptedException {

		driver.findElement(By.id("user-name")).sendKeys("standard_user");

		driver.findElement(By.id("password")).sendKeys("secret_sauce");

		driver.findElement(By.id("login-button")).click();

	}
	
	//This is my first test on github

	@Test(priority = 2)

	public void addrandomitem() throws InterruptedException {

		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

	}

	@Test(priority = 3)
	public void TestList() {
		List<WebElement> MyItem = driver.findElements(By.className("inventory_item_name"));

		for (int i = 0; i < MyItem.size(); i++) {

			String My = MyItem.get(i).getText();

			String[] parts = My.split(" ");

			if (parts.length > 0) {
				System.out.println(parts[parts.length - 1]);
			}
		}
	}

	/*
	 * @Test(priority = 3)
	 * 
	 * public void TestList() {
	 * 
	 * List<WebElement> MyItem =
	 * driver.findElements(By.className("inventory_item_name"));
	 * 
	 * char Letter = 't';
	 * 
	 * for (int i = 0; i < MyItem.size(); i++) {
	 * 
	 * String My = MyItem.get(i).getText();
	 * 
	 * char lam = My.charAt(My.length() - 1);
	 * 
	 * if (lam != Letter) {
	 * 
	 * System.out.println(My);
	 * 
	 * }
	 * 
	 * }
	 * 
	 * };
	 */

//	@Test(priority = 3)
//
//	public void removeitem() throws InterruptedException {
//
//		Thread.sleep(2000);
//
//		driver.findElement(By.id("remove-sauce-labs-backpack")).click();
//
//	}

//	@Test(priority = 4)
//
//	public void pressburgeremoji() throws InterruptedException {
//
//		Thread.sleep(2000);
//
//		driver.findElement(By.id("react-burger-menu-btn")).click();
//
//	}

//	@Test(priority = 5)
//
//	public void logout() throws InterruptedException {
//
//		Thread.sleep(2000);
//
//		driver.findElement(By.id("logout_sidebar_link")).click();
//
//	}

//	@AfterTest
//
//	public void myAfterTest() throws InterruptedException {
//
//		Thread.sleep(2000);
//		driver.quit();
//	}

}
