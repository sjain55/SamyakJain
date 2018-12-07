package Utils;

import java.io.FileReader;
import java.util.Properties;

public class ExcelUtil {
	static Properties prop;
	FileReader fr;
	static {
		prop = new Properties();
	}


	public String getProperty(String property){
		String result=null;
		try {
			fr = new FileReader("E:\\Eclipse-Photon\\test\\config.properties");
			prop.load(fr);
			result = prop.getProperty(property);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
