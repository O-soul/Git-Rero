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
	
	
	public boolean search_1(){ // ����� ������ ���� �� �� ���. ������ true, ���� �� ������.
		try{
    	      driver.findElement(By.xpath("//a[text()='��������������� �������.']"));
		   }                                        // ������� xpath ������� div, ����� �������� = "��. ����� ��� ����� ��������, ������� �� �������, �� ������������� �� ������ ��������. ". � ���� xpath ���� ����� ���� div, ������ �� ���������� � ������ ������� ���� ����������! 
		catch(NoSuchElementException e) {return false;} // ���� �������� ���������, ���� �� �� ������ div c ���������, �� �-�� ����� � ������ �������� ���������.
		return true; // ���� �������� �� ���������, ���� �� ����� ��� div � ����-�� �� �� �������� � ��������� "��. ����� ��� ����� ��������, ������� �� �������, ��..."
	   }
	
	public boolean search_2(){
		try{
	    	  driver.findElement(By.xpath("//div[@id='content']//*[text()='����������, ����������� ������']"));
		   }                                         
		catch(NoSuchElementException e) {return false;} 
		return true;
		}
    		            
	public boolean search_3(){
		try{
	    	  driver.findElement(By.xpath("//*[@id='globalContainer']//a[@href='/recover/initiate?lwv=120&lwc=1348092' and text()='������ ������?']"));
		   }                                         
		catch(NoSuchElementException e) {return false;} 
		return true;
		}	
	
	
}
