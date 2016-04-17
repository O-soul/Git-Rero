package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class facebook_Main_page { // ���� "�����-��������" ������������ ������� Page Object.
// ������� Page Object �������� �� ��������: ��� ������ �������� web-���������� ��������� ����� �����-��������.
// � ��� �� �������� ��� ��, ����������� ��� ��� ������������.
// ��������� ���� ����� �������� �� ������� ��� facebook.
	
	public static final String url = "http://www.facebook.com"; // url ���� ��������
	public static final String title = "����� ���������� �� ������� - ��������, ��������������� � �������� ������."; // ��������� ���� ��������
	WebDriver driver;
	
	public facebook_Main_page(WebDriver driver){
		this.driver = driver; }
	
	 
	                                // ������ �����������:
	
    public void setTextEmailField(String next_email){  // �������� � ��(������ �� ��� ������ ����� � @�����, ������� �� �����)
		
    	      // ��������� ��� ������ �� ����� ��������� � ���� - � ������ ������ ����� � html:
    //	List<WebElement> trs = driver.findElements(By.xpath("//table[@role='presentation']//tr")); // ����� � trs ����� �� ��������
    //	WebElement tr_1 = trs.get(1); // ������ ������ ������ �����
    //	tr_1.findElement(By.className("html7magic")).findElements(By.xpath("/label[text()='��. ����� ��� �������']")); // ������ ������� 1 � ������ �� ��� ��� label c ������� '��. ����� ��� �������'
    	
    	WebElement emailTextbox = driver.findElement(By.xpath("//*[@id='email']")); // ����� ���������
		emailTextbox.clear(); // ������� �������� ��������� �� ������ ������
		emailTextbox.sendKeys(next_email); // ����� � ���� ��������� �����
		Assert.assertEquals(emailTextbox.getAttribute("value"), next_email); // ��������� ��� value
	     // ���� ���� � ���� ��� �������� value, ����� ��� ���� �� �������, �� ����������� � �����������.
	}

	public void setTextPasswordField(String passwordValue){  
		WebElement passTextbox = driver.findElement(By.xpath("//*[@id='pass']")); // ����� ���������
		passTextbox.clear(); // ������� ��������� �� ������ ������
		passTextbox.sendKeys(passwordValue); // ������ ��������
		Assert.assertEquals(passTextbox.getAttribute("value"), passwordValue); // ��������� ���������.value;
	     // ���� ���� � ���� ��� �������� value, ����� ��� ���� �� �������, �� ����������� � �����������.
	}
		
	public WebElement loginSubmit(){
		WebElement submitButton = driver.findElement(By.xpath("//*[@value='����']"));
		return submitButton;
	}

	                                // ������ �����������:
	
    public void setText_FirstNameField(String firstname){
		WebElement firstName = driver.findElement(By.xpath("//*[@name='firstname']"));
		firstName.clear(); // ������� ��������� �� ������ ������
		firstName.sendKeys(firstname); 
		Assert.assertEquals(firstName.getAttribute("value"), firstname);
	}
	
	public void setText_LastNameField(String lastname){
		WebElement lastName = driver.findElement(By.xpath("//*[@name='lastname']"));
		lastName.clear(); // ������� ��������� �� ������ ������
		lastName.sendKeys(lastname); 
		Assert.assertEquals(lastName.getAttribute("value"), lastname);
	}
	
	public void setText_EmailMobileField(String emailOrMobile){
		WebElement EM = driver.findElement(By.xpath("//*[@name='reg_email__']"));
		EM.clear(); // ������� ��������� �� ������ ������
		EM.sendKeys(emailOrMobile); 
		Assert.assertEquals(EM.getAttribute("value"), emailOrMobile);
	}
	
	public void setText_ReenterEmailMobileField(String reenterEmailOrMobile){
		WebElement EM = driver.findElement(By.xpath("//*[@name='reg_email_confirmation__']"));
		EM.clear(); // ������� ��������� �� ������ ������
		EM.sendKeys(reenterEmailOrMobile); 
		Assert.assertEquals(EM.getAttribute("value"), reenterEmailOrMobile);
	}
	
	public void setText_PasswordField(String password){
		WebElement passw = driver.findElement(By.xpath("//*[@name='reg_passwd__']"));
		passw.clear(); // ������� ��������� �� ������ ������
		passw.sendKeys(password); 
		Assert.assertEquals(passw.getAttribute("value"), password);
	}
	                                	
    public void setText_day(String value){
    	WebElement selectDay = driver.findElement(By.xpath("//select[@id='day']"));
    	Select select = new Select(selectDay);  // ����� Select ��� ������ � DropDownList ���
        select.selectByValue(value); // ������� �������� value �� ����������� ������.
    }
    
    public void setText_month(String value){
    	WebElement selectMonth = driver.findElement(By.xpath("//select[@id='month']"));
    	Select select = new Select(selectMonth);  // ����� Select ��� ������ � DropDownList ���
        select.selectByValue(value);
    }
    
    public void setText_year(String value){
    	WebElement selectYear = driver.findElement(By.xpath("//select[@id='year']"));
    	Select select = new Select(selectYear);  // ����� Select ��� ������ � DropDownList ���
        select.selectByValue(value);
    }
			
    public void setText_sex(String sex){
    	if(sex == "man")
    	 { 
            WebElement man = driver.findElement(By.xpath("//*[@id='u_0_f' and @value='2']"));
    	    man.click();
    	 }
    	else 
    	 { 
            WebElement woman = driver.findElement(By.xpath("//*[@id='u_0_e' and @value='1']"));
            woman.click();
     	 }
    	  
    }
    
	public void reg_submit(){
    	WebElement submit = driver.findElement(By.xpath("//button[text()='�����������']"));
    	submit.click();
    }
}


