package selenium;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties prop;

	public ReadConfig() throws Exception {

		FileInputStream fis = new FileInputStream(".\\testData\\config2.properties");

		prop = new Properties();

		prop.load(fis);

	}

	public String getAppURL() {

		return prop.getProperty("appURL");

	}

	public String getBrowser() {

		return prop.getProperty("browser");

	}

}
