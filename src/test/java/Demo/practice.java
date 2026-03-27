package Demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class practice {
	@Test
	public void readData() throws IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/OrangeHrm_CommomData/commonData.propreties");
		Properties prop=new Properties();
		prop.load(fis);
		
		String URL=prop.getProperty("url");
		String browser=prop.getProperty("browser");
		String ValidUsername=prop.getProperty("username");
		String ValidPassword=prop.getProperty("password");
		System.out.println("The default url for testing is: "+URL);
		System.out.println("The default browser for testing is: "+browser);
		System.out.println("The default username for testing is: "+ValidUsername);
		System.out.println("The default password for testing is: "+ValidPassword);
		
		//write
		FileOutputStream fos=new FileOutputStream("./src/test/resources/OrangeHrm_CommomData/write.properties");
		prop.setProperty("CandidateName","Thomas" );
		prop.store(fos, null);
	}

	
	

}
