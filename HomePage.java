import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	WebDriver driver;
	WebElement textInput;
	WebElement submit;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		textInput = driver.findElement(By.xpath("//div[text()='What's on your mind?']"));
		submit = driver.findElement(By.xpath("//button[@type='submit' and @data-testid='react-composer-post-button']"));
	}

	public void addFoto(){
		textInput.click();
		WebElement photic = driver.findElement(By.xpath(".//*[@name='composer_photo']")); // ���� ��� ��������� ���� ������ ����
		WebElement uploadPhoto = driver.findElement(By.xpath(".//*[@name='composer_photo' and @data-testid = 'media-attachment-add-photo']"));// ���������� ����������� ������ ������! �� ������
		uploadPhoto.sendKeys("D://photo.jpg"); // ����� ���� ����� �� D: � ����� �����������

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {e.printStackTrace();}

		submit.click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {e.printStackTrace();}
		
		List<WebElement> trs = driver.findElements(By.xpath("//img[@alt='Olia Gorgia's photo.']")); // ������� ��� ���������� �� ������� �����
		WebElement foto = trs.get(1); // foto - ��������� �����
		foto.findElement(arg0)..
	}


}
