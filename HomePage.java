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
		WebElement photic = driver.findElement(By.xpath(".//*[@name='composer_photo']")); // клац шоб появилось куда залить фото
		WebElement uploadPhoto = driver.findElement(By.xpath(".//*[@name='composer_photo' and @data-testid = 'media-attachment-add-photo']"));// появляется динамически только сейчас! не раньше
		uploadPhoto.sendKeys("D://photo.jpg"); // введи путь фотки на D: и фотка загрузиться

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {e.printStackTrace();}

		submit.click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {e.printStackTrace();}
		
		List<WebElement> trs = driver.findElements(By.xpath("//img[@alt='Olia Gorgia's photo.']")); // дергаем все загруженые на фейсбук фотки
		WebElement foto = trs.get(1); // foto - последняя фотка
		foto.findElement(arg0)..
	}


}
