package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class facebook_Main_page { // этот "класс-страница" представляет паттерн Page Object.
// паттерн Page Object работает по принципу: для каждой страницы web-приложения создается такой класс-страница.
// В нем мы достанем все ЭУ, необходимые нам для тестирования.
// Конкретно этот класс отвечает за главную стр facebook.
	
	public static final String url = "http://www.facebook.com"; // url этой страницы
	public static final String title = "Добро пожаловать на Фейсбук - заходите, регистрируйтесь и находите друзей."; // заголовок этой страницы
	WebDriver driver;
	
	public facebook_Main_page(WebDriver driver){
		this.driver = driver; }
	
	 
	                                // методы авторизации:
	
    public void setTextEmailField(String next_email){  // работаем с ЭУ(раньше мы это делали прямо в @тесте, отвыкай от этого)
		
    	      // следующие три строки не имеют отношения к коду - я просто парсил таблу в html:
    //	List<WebElement> trs = driver.findElements(By.xpath("//table[@role='presentation']//tr")); // кинул в trs таблу со строками
    //	WebElement tr_1 = trs.get(1); // достал первую строку таблы
    //	tr_1.findElement(By.className("html7magic")).findElements(By.xpath("/label[text()='Эл. адрес или телефон']")); // достал яйчейку 1 и достал из нее тег label c текстом 'Эл. адрес или телефон'
    	
    	WebElement emailTextbox = driver.findElement(By.xpath("//*[@id='email']")); // нашли текстбокс
		emailTextbox.clear(); // очистим почтовый текстбокс от старых данных
		emailTextbox.sendKeys(next_email); // ввели в него очередную почту
		Assert.assertEquals(emailTextbox.getAttribute("value"), next_email); // проверяем его value
	     // даже если у тега нет атрибута value, пусть это тебя не смущает, он учитывается и срабатывает.
	}

	public void setTextPasswordField(String passwordValue){  
		WebElement passTextbox = driver.findElement(By.xpath("//*[@id='pass']")); // нашли текстбокс
		passTextbox.clear(); // очистим текстбокс от старых данных
		passTextbox.sendKeys(passwordValue); // вводим значение
		Assert.assertEquals(passTextbox.getAttribute("value"), passwordValue); // проверяем текстбокс.value;
	     // даже если у тега нет атрибута value, пусть это тебя не смущает, он учитывается и срабатывает.
	}
		
	public WebElement loginSubmit(){
		WebElement submitButton = driver.findElement(By.xpath("//*[@value='Вход']"));
		return submitButton;
	}

	                                // методы регистрации:
	
    public void setText_FirstNameField(String firstname){
		WebElement firstName = driver.findElement(By.xpath("//*[@name='firstname']"));
		firstName.clear(); // очистим текстбокс от старых данных
		firstName.sendKeys(firstname); 
		Assert.assertEquals(firstName.getAttribute("value"), firstname);
	}
	
	public void setText_LastNameField(String lastname){
		WebElement lastName = driver.findElement(By.xpath("//*[@name='lastname']"));
		lastName.clear(); // очистим текстбокс от старых данных
		lastName.sendKeys(lastname); 
		Assert.assertEquals(lastName.getAttribute("value"), lastname);
	}
	
	public void setText_EmailMobileField(String emailOrMobile){
		WebElement EM = driver.findElement(By.xpath("//*[@name='reg_email__']"));
		EM.clear(); // очистим текстбокс от старых данных
		EM.sendKeys(emailOrMobile); 
		Assert.assertEquals(EM.getAttribute("value"), emailOrMobile);
	}
	
	public void setText_ReenterEmailMobileField(String reenterEmailOrMobile){
		WebElement EM = driver.findElement(By.xpath("//*[@name='reg_email_confirmation__']"));
		EM.clear(); // очистим текстбокс от старых данных
		EM.sendKeys(reenterEmailOrMobile); 
		Assert.assertEquals(EM.getAttribute("value"), reenterEmailOrMobile);
	}
	
	public void setText_PasswordField(String password){
		WebElement passw = driver.findElement(By.xpath("//*[@name='reg_passwd__']"));
		passw.clear(); // очистим текстбокс от старых данных
		passw.sendKeys(password); 
		Assert.assertEquals(passw.getAttribute("value"), password);
	}
	                                	
    public void setText_day(String value){
    	WebElement selectDay = driver.findElement(By.xpath("//select[@id='day']"));
    	Select select = new Select(selectDay);  // класс Select для работы с DropDownList ами
        select.selectByValue(value); // выбрали значение value из выпадающего списка.
    }
    
    public void setText_month(String value){
    	WebElement selectMonth = driver.findElement(By.xpath("//select[@id='month']"));
    	Select select = new Select(selectMonth);  // класс Select для работы с DropDownList ами
        select.selectByValue(value);
    }
    
    public void setText_year(String value){
    	WebElement selectYear = driver.findElement(By.xpath("//select[@id='year']"));
    	Select select = new Select(selectYear);  // класс Select для работы с DropDownList ами
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
    	WebElement submit = driver.findElement(By.xpath("//button[text()='Регистрация']"));
    	submit.click();
    }
}


