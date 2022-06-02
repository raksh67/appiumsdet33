package appium_generic_utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
public Properties pb;
	public void getPropertyFile() throws IOException{
		FileInputStream fis = new FileInputStream(ConstantPath.Propertiespath);
		 pb =new Properties();
		pb.load(fis);
	}
		
		public String fetchDataPropertyFile(String key) {
		
			String value=pb.getProperty(key);
			return value;
		}

	}