package Utility;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReusableMethod {

	public static void ReadFiles(String filePath) throws FileNotFoundException, IOException {
		File file = new File(filePath);

		//FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));

		/*
		 * available() method of BufferedInputStream returns 0 when there are no more
		 * bytes present in the file to be read
		 */
		while (bis.available() > 0) {
			System.out.print((char) bis.read());
		}
	}
	
	public static String getProperty(String key) throws IOException {
		
		
		 // String env = System.getProperty("xyz");
		 
		 
		/*
		 * File file = new File( System.getProperty("user.dir") +
		 * "\\src\\main\\resources\\TestNGPROD.properties");
		 */
		
		File file = new File(
				System.getProperty("user.dir") + "\\src\\main\\resources\\TestNG_Prod.properties");
		FileInputStream fileInput = new FileInputStream(file);

		Properties pro = new Properties();
		pro.load(fileInput);
		String val = pro.getProperty(key);
		return val;

	}

	
}
