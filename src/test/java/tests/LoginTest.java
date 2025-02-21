package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

public class LoginTest {

    String url="https://uatauth.adistec.com/auth/realms/Adistec/protocol/openid-connect/auth?client_id=vendorcenter-frontend&redirect_uri=https%3A%2F%2Fuatvendorcenter.adistec.com%2Finvoices&state=6cb65a4a-3855-433d-9f16-e83a964541c9&response_mode=fragment&response_type=code&scope=openid&nonce=373137bb-261e-4c7a-869e-511b332ac876";
	WebDriver driver;
	
	@Before
	public void setUp() {
		driver = new ChromeDriver();
		driver.get(url);
		//driver.manage().deleteAllCookies();
		driver.manage().window().maximize();		
	}
	
	@Test
	public void iniciarSesion() {
		
		LoginPage login = new LoginPage(driver);
		login.ingresarCredenciales("baguirre@adistecvendor.com","Protones17.");
		
	}

    @After
	public void tearDown() {
		//driver.close();
	}
    
}
