package maven_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MatrimonyAutomate {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.keralamatrimony.com");
		//to click select profile
		driver.findElement(By.xpath("//div[@id = 'dd']")).click();
		Thread.sleep(3000);
		// to click myself
		driver.findElement(By.id("1")).click();
		//to click male
		driver.findElement(By.xpath("//label[text() = 'Male']")).click();
		Thread.sleep(3000);
		// to enter name
		driver.findElement(By.xpath("//input[@name = 'NAME']")).sendKeys("D*** M****n");
		// to enter mobile number
		driver.findElement(By.xpath("//input[@placeholder = 'Enter Mobile Number']")).sendKeys("628*****");
		Thread.sleep(3000);
		// to click register free button
		driver.findElement(By.xpath("//input[@type = 'button']")).click();
		Thread.sleep(3000);
		//to click DOB
		driver.findElement(By.xpath("//input[@placeholder = 'DD / MM / YYYY']")).click();
		// to select year
		WebElement year = driver.findElement(By.xpath("//select[@data-handler = 'selectYear']"));
		Select s1 = new Select (year);
		s1.selectByVisibleText("2000");
		//to select month
		WebElement month = driver.findElement(By.xpath("//select[@data-handler = 'selectMonth']"));
		Select s2 = new Select (month);
		s2.selectByValue("4");
		//ro click day
		driver.findElement(By.linkText("2")).click();
		Thread.sleep(3000);
		// to click religion button and select which religion 
		driver.findElement(By.id("RELIGION")).click();
		WebElement religion = driver.findElement(By.xpath("//select[@name = 'RELIGION']"));
		Select s3 = new Select (religion);
		s3.selectByIndex(1);
		//to enter gmail
		driver.findElement(By.xpath("//input[@name = 'EMAIL']")).sendKeys("de&&&&&&@gmail.com");
		//to enter password
		driver.findElement(By.xpath("//input[@class = 'regis-input']")).sendKeys("dee*******@");
		//to click continue button
		driver.findElement(By.xpath("//button[@alt= 'Continue']")).click();
		Thread.sleep(3000);
		//to click caste and select which caste
		driver.findElement(By.xpath("//div[@id = 's2id_CASTE_NORMAL']/a[@class = 'select2-choice']")).click();
		Thread.sleep(2000);
		WebElement caste = driver.findElement(By.xpath("//select[@name='CASTE_NORMAL']"));
		Select s4 = new Select (caste);
		s4.selectByVisibleText("Ezhava");
		Thread.sleep(2000);
		//to click subcaste and select which subcaste
		driver.findElement(By.xpath("//div[@id = 's2id_SUBCASTE_SEL']/a[@class = 'select2-choice']")).click();
		Thread.sleep(2000); 
		WebElement subcaste =driver.findElement(By.xpath("//select[@id='SUBCASTE_SEL']"));
		Select s5 =new Select (subcaste);
		s5.selectByVisibleText("Thiyya");
		//to click continue button
		driver.findElement(By.xpath("//input[@class= 'hp-button']")).click();
		Thread.sleep(2000); 
		//to click martial status
		driver.findElement(By.xpath("//label[@for= 'MARITAL_STATUS1']")).click();
		//to click height and select height
		driver.findElement(By.xpath("//div[@id = 's2id_FEET']/a[@class = 'select2-choice']")).click();
		Thread.sleep(2000); 
		WebElement height =driver.findElement(By.xpath("//select[@id='FEET']"));
		Select s6 =new Select (height);
		s6.selectByVisibleText("5ft 7in / 170 cms");
		//to click family status
		driver.findElement(By.xpath("//label[@for= 'FAMILYSTATUS1']")).click();
		
		driver.findElement(By.xpath("//label[@for= 'FAMILYTYPE2']")).click();
		
		driver.findElement(By.xpath("//label[@for= 'FAMILYVALUE2']")).click();
	
		driver.findElement(By.xpath("//label[@for= 'PHYSICAL_STATUS0']")).click();
		
		//to click continue button
		driver.findElement(By.xpath("//*[@id=\"MatriForm\"]/div/div[6]/div[2]/div/div[10]/input")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id = 's2id_EDUCATION']/a[@class = 'select2-choice']")).click();
		Thread.sleep(2000); 
		//to click select button and choose education
		WebElement education =driver.findElement(By.xpath("//select[@id='EDUCATION']"));
		Select s7 =new Select (education);
		s7.selectByValue("49");
		//to select employment
		driver.findElement(By.xpath("//label[@for='OCCUPATIONCATEGORY3']")).click();
		//to click occupation
		driver.findElement(By.xpath("//div[@id= 's2id_OCCUPATION']/a[@class='select2-choice']")).click();
		Thread.sleep(2000); 
		WebElement occupation=driver.findElement(By.xpath("//select[@id='OCCUPATION']"));
		Select s8 =new Select (occupation);
		s8.selectByValue("128");
		//to click annual income
		driver.findElement(By.xpath("//div[@id= 's2id_INCOME_CURRENCY']/a[@class='select2-choice']")).click();
		Thread.sleep(2000); 
		WebElement income=driver.findElement(By.xpath("//select[@name='INCOME_CURRENCY']"));
		Select s9 =new Select (income);
		s9.selectByValue("4");
		//to enter the income
		driver.findElement(By.xpath("//input[@placeholder = 'Enter Income']")).sendKeys("1500");
		Thread.sleep(2000); 
		//to click state
		driver.findElement(By.xpath("//div[@id= 's2id_RESIDINGSTATE_SEL']/a[@class='select2-choice']")).click();
		Thread.sleep(2000); 
		WebElement state=driver.findElement(By.xpath("//select[@name='RESIDINGSTATE_SEL']"));
		Select s10 =new Select (state);
		s10.selectByValue("18");
		//to click city
		driver.findElement(By.xpath("//div[@id= 's2id_RESIDINGCITY_SEL']/a[@class='select2-choice']")).click();
		Thread.sleep(2000); 
		WebElement city =driver.findElement(By.xpath("//select[@name='RESIDINGCITY_SEL']"));
		Select s11 =new Select (city);
		s11.selectByValue("1707");
		//to click continue button
		driver.findElement(By.xpath("//*[@id=\"MatriForm\"]/div/div[8]/div[2]/div/div[9]/input")).click();
		Thread.sleep(2000);
		//to click complete button
		driver.findElement(By.xpath("//*[@id=\"submitform\"]")).click();
		Thread.sleep(2000);

	}

}
