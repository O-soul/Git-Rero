package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class facebook_Login_page {

	WebDriver driver;
    
	public facebook_Login_page(WebDriver driver){
		this.driver = driver;
	}
	
	
	public boolean search_1(){ // такие методы ищут ОР на стр. Вернет true, если эл найден.
		try{
    	      driver.findElement(By.xpath("//a[text()='Зарегистрируйте аккаунт.']"));
		   }                                        // верхний xpath находит div, текст которого = "Эл. адрес или номер телефона, который вы указали, не соответствует ни одному аккаунту. ". И если xpath таки нашел этот div, значит он существует и значит ворнинг тоже существует! 
		catch(NoSuchElementException e) {return false;} // этот эксепшен сработает, если мы не найдем div c ворнингом, те п-ие почта и пароль введутся корректно.
		return true; // если эксепшен не сработает, знач мы нашли наш div и след-но мы на странице с ворнингом "Эл. адрес или номер телефона, который вы указали, не..."
	   }
	
	public boolean search_2(){
		try{
	    	  driver.findElement(By.xpath("//div[@id='content']//*[text()='Пожалуйста, подтвердите пароль']"));
		   }                                         
		catch(NoSuchElementException e) {return false;} 
		return true;
		}
    		            
	public boolean search_3(){
		try{
	    	  driver.findElement(By.xpath("//*[@id='globalContainer']//a[@href='/recover/initiate?lwv=120&lwc=1348092' and text()='Забыли пароль?']"));
		   }                                         
		catch(NoSuchElementException e) {return false;} 
		return true;
		}	
	
	
}
