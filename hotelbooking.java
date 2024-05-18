package com.hotelBooking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class hotelbooking {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();

		WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
		username.sendKeys("Santhosh6855");

		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("Santhosh@9");

		WebElement loginbtn = driver.findElement(By.xpath("//input[@type='Submit']"));
		loginbtn.click();

		WebElement location = driver.findElement(By.xpath("//select[@name='location']"));
		Select select = new Select(location);
		select.selectByValue("London");

		WebElement selecthotel = driver.findElement(By.xpath("//select[@name='hotels']"));
		Select select1 = new Select(selecthotel);
		select1.selectByValue("Hotel Sunshine");

		WebElement roomtype = driver.findElement(By.xpath("//select[@name='room_type']"));
		Select select2 = new Select(roomtype);
		select2.selectByValue("Double");

		WebElement numberofroom = driver.findElement(By.xpath("//select[@name='room_nos']"));
		Select select3 = new Select(numberofroom);
		select3.selectByValue("4");

		WebElement checkdate = driver.findElement(By.xpath("(//input[@class='date_pick'])[1]"));
		checkdate.clear();
		checkdate.sendKeys("25/05/2024");

		WebElement checkout = driver.findElement(By.xpath("(//input[@class='date_pick'])[2]"));
		checkout.clear();
		checkout.sendKeys("26/05/2024");

		WebElement adultroom = driver.findElement(By.xpath("//select[@name='adult_room']"));
		Select select4 = new Select(adultroom);
		select4.selectByValue("2");

		WebElement children = driver.findElement(By.xpath("//select[@name='child_room']"));
		Select select5 = new Select(children);
		select5.selectByValue("2");

		WebElement search = driver.findElement(By.xpath("//input[@type='submit']"));
		search.click();

		WebElement radiobtn = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
		radiobtn.click();

		WebElement btnclick = driver.findElement(By.xpath("//input[@name='continue']"));
		btnclick.click();

		WebElement name = driver.findElement(By.xpath("//input[@name='first_name']"));
		name.sendKeys("santhosh");

		WebElement lastname = driver.findElement(By.xpath("//input[@name='last_name']"));
		lastname.sendKeys("kumar");

		WebElement address = driver.findElement(By.xpath("//textarea[@name='address']"));
		address.sendKeys("566,west street muthupillai mandapam kumabkonam");

		WebElement creditcard = driver.findElement(By.xpath("//input[@name='cc_num']"));
		creditcard.sendKeys("9879 8098 3932 3234");

		WebElement cardtype = driver.findElement(By.xpath("//select[@name='cc_type']"));
		Select select6 = new Select(cardtype);
		select6.selectByValue("VISA");

		WebElement selectmonth = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		Select select7 = new Select(selectmonth);
		select7.selectByValue("5");

		WebElement selectyear = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		Select select8 = new Select(selectyear);
		select8.selectByValue("2024");

		WebElement cvv = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
		cvv.sendKeys("898");

		WebElement booknow = driver.findElement(By.xpath("(//input[@type='button'])[1]"));
		booknow.click();Thread.sleep(6000);

		WebElement ordernum = driver.findElement(By.id("order_no"));
		String text = ordernum.getAttribute("value");
		System.out.println(text);

	}

}
