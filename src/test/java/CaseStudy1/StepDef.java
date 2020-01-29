package CaseStudy1;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef
{
     public static WebDriver driver;     
	
@Given("^user open TestMeApp$")
public void OpenTestMeApp()
{
	System.getProperty("webdriver.chrome.driver", "C:\\Webdrivers\\chromedriver_win32.exe");
	
	driver.get("http://10.232.237.143:443/TestMeApp/RegisterUser.htm");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
}

@When("^user click signup$")
public void Sign_up()
{
	driver.findElement(By.xpath("//a[$href='login']")).click();
}


@And("^enter User Name as \"([^\"]*)\"$")
public void User_Name(String uname)
{
	driver.findElement(By.name("userName")).sendKeys(uname);
}

@And("^enter First Name as \"([^\"]*)\"$")
public void first_Name(String fname)
{
	driver.findElement(By.name("firstName")).sendKeys(fname);
}
@And("^enter Last Name as \"([^\"]*)\"$")
public void lastName(String lname)
{
	driver.findElement(By.name("lastName")).sendKeys(lname);
}

@And("^enter User Password as \"([^\"]*)\"$")
public void password(String pass)
{
	driver.findElement(By.id("password")).sendKeys(pass);
}

@And("^enter User Confirm_Password as \"([^\"]*)\"$")
public void confirm_password(String cpass)
{
	driver.findElement(By.id("confirmpassword")).sendKeys(cpass);
}

@And("^enter Gender as \"([^\"]*)\"$")
public void gender(String gender)
{
	if ( gender.equalsIgnoreCase("male"))
	{
		driver.findElement(By.xpath("//input[@value='Male']")).click();
	}
	else if (gender.equalsIgnoreCase("female"))
	{
		driver.findElement(By.xpath("//input[@value='Female']")).click();
	}
}


@And("^enter Email as \"([^\"]*)\"$")
public void Email(String email )
{
	driver.findElement(By.name("EmailAddress")).sendKeys(email);
}

@And("^enter Mobile Number as \"([^\"]*)\"$")
public void Mobile_Number(String mnum)
{
	driver.findElement(By.name("mobileNumber")).sendKeys(mnum);
}

@And("^enter DOB as \"([^\"]*)\"$")
public void DOB(String dob)
{
	driver.findElement(By.name("dateofBirth")).sendKeys(dob);
}


@And("^enter Address as \"([^\"]*)\"$")
public void Address(String add)
{
	driver.findElement(By.name("address")).sendKeys(add);
}

@And("^enter Security answer as \"([^\"]*)\"$")
public void Security_Question(String Security)
{
	driver.findElement(By.name("securityQuestion")).sendKeys(Security);
}

@And("^enter Answer as \"([^\"]*)\"$")
public void Answer(String Ans)
{
	driver.findElement(By.name("answer")).sendKeys(Ans);
}

@Then("^user click Register$")
public void Register(String reg)
{
	
	driver.findElement(By.name("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]")).sendKeys(reg);
	
	
	System.out.println("Register sucessful");
}
}










