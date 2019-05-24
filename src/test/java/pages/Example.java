package pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Example {

	public static void main(String[] args) throws IOException {
		
		Properties pro =new Properties();
		
		FileInputStream fip = new FileInputStream("C:\\D\\Automation\\GmailBDD\\resources\\gmailproperties.properties");
		pro.load(fip);
		System.out.println(pro.getProperty("url"));
		System.out.println(pro.getProperty("gdpath"));
	}
}
