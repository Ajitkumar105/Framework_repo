package pac1;

import org.testng.annotations.Test;

public class ContactTest {
	@Test
	public void createContactTest()
	{   
		String URL=System.getProperty("url");
		String BROWESER=System.getProperty("browser");
		String USERNAME=System.getProperty("username");
		String PASSWORD=System.getProperty("password");
		System.out.println(URL);
		System.out.println(BROWESER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		System.out.println("execute createContactTes");
	}
	
    @Test
	public void modifycreateContactTest()
	{
		System.out.println("execute modifycreateContactTes");
	}
    

    @Test
	public void deletecreateContactTest()
	{
		System.out.println("execute deletecreateContactTes");
	}


}
