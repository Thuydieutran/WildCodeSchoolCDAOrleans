package org.wcs_cda.worms;

import java.io.*;
import java.util.*;

public class Config {
	private Properties prop;
	
	// Singleton design pattern
	private static final String CONFIG_FILENAME = "src/resources/app.config";
	private static Config config = null;
	
	public static void loadConfig() throws IOException {
		config = new Config();
	}

	public static boolean isDebug() {
		return config.prop.getProperty("app.debug").equals("1");
	}
	
	public Config() throws IOException {
		prop = new Properties();

		try (FileInputStream fis = new FileInputStream(CONFIG_FILENAME)) {
		    prop.load(fis);
		} catch (FileNotFoundException ex) {
		    throw ex;
		} catch (IOException ex) {
		    throw ex;
		}
	}
}
