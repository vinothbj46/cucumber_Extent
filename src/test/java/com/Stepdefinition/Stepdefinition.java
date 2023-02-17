package com.Stepdefinition;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.Runner.Runner_class;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinition {
	public static WebDriver driver = Runner_class.driver;
	
	@Given("^user Launching The Url Adactin Application$")
	public void user_Launching_The_Url_Adactin_Application() throws Throwable {
		driver.get("https://adactinhotelapp.com/");
	}

	@When("^user Enter The User Name In User Field$")
	public void user_Enter_The_User_Name_In_User_Field() throws Throwable {
		driver.findElement(By.id("username")).sendKeys("vinoth4620");
	}

	@When("^User  Enter The Password in password field$")
	public void user_Enter_The_Password_in_password_field() throws Throwable {
		driver.findElement(By.id("password")).sendKeys("9P84GR");
	}

	@Then("^User Click On Submit Button It Navigates To Search Hotel Page$")
	public void user_Click_On_Submit_Button_It_Navigates_To_Search_Hotel_Page() throws Throwable {
		 driver.findElement(By.id("login")).click();
	}

	@Given("^user Must Select Options$")
	public void user_Must_Select_Options() throws Throwable {
	    
	}

	@When("^user Select The Location  Field$")
	public void user_Select_The_Location_Field() throws Throwable {
		WebElement value = driver.findElement(By.id("location"));
		Select a = new Select(value);
		a.selectByIndex(5);
	}

	@When("^user Select The Hotels Field$")
	public void user_Select_The_Hotels_Field() throws Throwable {
		WebElement hotels = driver.findElement(By.id("hotels"));
		Select b = new Select(hotels);
		b.selectByIndex(3);
	}

	@When("^user Select The Room Type Field$")
	public void user_Select_The_Room_Type_Field() throws Throwable {
		WebElement room_type = driver.findElement(By.name("room_type"));
		Select c=new Select(room_type);
		c.selectByIndex(2);
	}

	@When("^user Select The Number Of Rooms Field$")
	public void user_Select_The_Number_Of_Rooms_Field() throws Throwable {
			WebElement room_nos = driver.findElement(By.name("room_nos"));
			Select d=new Select(room_nos);
			d.selectByIndex(2);
	}

	@When("^user Enter The Check In Date field And Clear Datepick_In Field$")
	public void user_Enter_The_Check_In_Date_field_And_Clear_Datepick_In_Field() throws Throwable {
		driver.findElement(By.xpath("//input[@id='datepick_in']")).clear();
	}

	@When("^user Enter The Datepick_In And Pass The Send Keys In Check In Date Filed$")
	public void user_Enter_The_Datepick_In_And_Pass_The_Send_Keys_In_Check_In_Date_Filed() throws Throwable {
		driver.findElement(By.xpath("//input[@id='datepick_in']")).sendKeys("09/01/2023");
	}

	@When("^user Enter The Check Out Date field And Clear Datepick_Out Field$")
	public void user_Enter_The_Check_Out_Date_field_And_Clear_Datepick_Out_Field() throws Throwable {
		driver.findElement(By.xpath("//input[@id='datepick_out']")).clear();
	}

	@When("^user Enter The Datepick_Out And Pass The Send Keys In Check Out Date Filed$")
	public void user_Enter_The_Datepick_Out_And_Pass_The_Send_Keys_In_Check_Out_Date_Filed() throws Throwable {
		driver.findElement(By.xpath("//input[@id='datepick_out']")).sendKeys("12/01/2023");
	}

	@When("^user Select The Adults per Room Field$")
	public void user_Select_The_Adults_per_Room_Field() throws Throwable {
		WebElement adultroom=driver.findElement(By.xpath("//select[@id='adult_room']"));
		Select c1=new Select(adultroom);
		c1.selectByIndex(2);
	}

	@When("^user Select The Children per Room Field$")
	public void user_Select_The_Children_per_Room_Field() throws Throwable {
		WebElement childroom = driver.findElement(By.xpath("//select[@id='child_room']"));
		Select g1=new Select(childroom);
		g1.selectByIndex(3);
	}

	@Then("^User Click On Search Button It Navigates To Select Hotel Page$")
	public void user_Click_On_Search_Button_It_Navigates_To_Select_Hotel_Page() throws Throwable {
		driver.findElement(By.xpath("//input[@class='reg_button']")).click();
	}

	@Given("^user Must Select The Page Options$")
	public void user_Must_Select_The_Page_Options() throws Throwable {
	    
	}

	@When("^user Click On Radio  Button$")
	public void user_Click_On_Radio_Button() throws Throwable {
		driver.findElement(By.xpath("//input[@id='radiobutton_0']")).click();
	}

	@Then("^user Click On Continue Button It Navigates To Book  Hotel Page$")
	public void user_Click_On_Continue_Button_It_Navigates_To_Book_Hotel_Page() throws Throwable {
		driver.findElement(By.xpath("//input[@id='continue']")).click();
	}

	@Given("^Enter The Options$")
	public void enter_The_Options() throws Throwable {
	    
	}

	@When("^user Enter The  First Name field$")
	public void user_Enter_The_First_Name_field() throws Throwable {
		driver.findElement(By.name("first_name")).sendKeys("vinoth");
	}

	@When("^user Enter The Last Name Field$")
	public void user_Enter_The_Last_Name_Field() throws Throwable {
		driver.findElement(By.name("last_name")).sendKeys("BJ");
	}

	@When("^user Enter The Billing Address Field$")
	public void user_Enter_The_Billing_Address_Field() throws Throwable {
		driver.findElement(By.className("txtarea")).sendKeys("vinoth,Tiruvannamalai.Tamilnadu");
	}
	 	
	@When("^user Enter The Credit Card No Filed$")
	public void user_Enter_The_Credit_Card_No_Filed() throws Throwable {
		driver.findElement(By.xpath("//input[@id='cc_num']")).sendKeys("1234567890123456");

	}

	@When("^user Select The Credit Card Type Field$")
	public void user_Select_The_Credit_Card_Type_Field() throws Throwable {
		WebElement ctype=driver.findElement(By.xpath("//select[@class='select_combobox']"));
		Select v1=new Select(ctype);
		v1.selectByIndex(3);
	}

	@When("^user Select Expiry Date Select  Field Of Month$")
	public void user_Select_Expiry_Date_Select_Field_Of_Month() throws Throwable {
		WebElement  edate1=driver.findElement(By.xpath("//select[@class='select_combobox2']"));
		Select v2=new Select(edate1);
		v2.selectByIndex(3);
	}

	@When("^user Select Expiry Date Select  Field Of  Year$")
	public void user_Select_Expiry_Date_Select_Field_Of_Year() throws Throwable {
		WebElement edate2=driver.findElement(By.xpath("//select[@class='select_combobox2'][2]"));
		Select v3=new Select(edate2)	;
		v3.selectByIndex(2);
	}

	@When("^user Enter The  CVV Number Field$")
	public void user_Enter_The_CVV_Number_Field() throws Throwable {
		driver.findElement(By.xpath("//input[@id='cc_cvv']")).sendKeys("465");
	}

	@Then("^user Click The Book Now Button$")
	public void user_Click_The_Book_Now_Button() throws Throwable {
		driver.findElement(By.xpath("//input[@class='reg_button']")).click();
		Thread.sleep(4000);
	}

	@Then("^user click On Logout Button And Exit the Application$")
	public void user_click_On_Logout_Button_And_Exit_the_Application() throws Throwable {
		WebElement sea = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[1]/td[2]/a[4]"));
		Actions ac=new Actions(driver);
		ac.contextClick(sea).build().perform();
		
		Robot ro=new Robot();
		ro.keyPress(KeyEvent.VK_DOWN);
		ro.keyRelease(KeyEvent.VK_DOWN);
		
		ro.keyPress(KeyEvent.VK_DOWN);
		ro.keyRelease(KeyEvent.VK_DOWN);
		
		ro.keyPress(KeyEvent.VK_ENTER);
		ro.keyRelease(KeyEvent.VK_ENTER);
		
		ac.click().build().perform();
	    	}

	@Then("^To Tack Screen Shot$")
	public void to_Tack_Screen_Shot() throws Throwable {
	    
	}


	
}