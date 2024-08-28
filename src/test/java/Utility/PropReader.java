package Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropReader {
	
	public String ReadPropertyData(String propToBeRead) throws IOException
	{
		Properties prop = new Properties(); // Created object of proprties
		
		// Give the path of current project for any user
		// But we want path of properties file not project so add + "path of config"
		String pathOfConfig = System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties";
		
		// FileInputStream use to give the path. 
		FileInputStream fis = new FileInputStream(pathOfConfig);
		prop.load(fis);
		
		String Value = prop.getProperty("propToBeRead");  // To read the data from config file 
	
		System.out.println(Value);
		
		return Value;
	}
	
}
