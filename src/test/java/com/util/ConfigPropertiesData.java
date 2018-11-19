package com.util;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Properties;

public class ConfigPropertiesData {

	private static ConfigPropertiesData configPropData = null;

	File fileConfigData = null;
	Properties properties = null;
	String strFilePath = null;

	public HashMap<String, String> configMap = new HashMap<String, String>();

	private ConfigPropertiesData() {

		// this.logger = LoggerFactory.getLogger(ConfigPropertiesData.class);
		this.createConfigMap();
	}

	public static ConfigPropertiesData getConfigProperitesData() throws Exception {
		if (configPropData == null) {
			configPropData = new ConfigPropertiesData();
		}
		return configPropData;
	}

	public HashMap<String, String> getConfigMap() {
		return this.configMap;
	}

	public void setConfigMap(HashMap<String, String> dataSet) {
		this.configMap = dataSet;
	}

	/**
	 * Read Test.properties and create Config Map
	 */
	public void createConfigMap() {
		try {
			StringBuffer buffer = new StringBuffer();
			buffer.append("src/test/resources/environment/");
			// logger.debug("Entering createConfigMap ");
			configMap = new HashMap<String, String>();
			properties = new Properties();
			String jenkinsProp = System.getenv("TEST");
			properties.load(new FileInputStream("src/test/resources/Test.properties"));
			String envProperty;
			if (System.getProperty("environment") == null) {
				envProperty = properties.getProperty("ENV");
				System.setProperty("environment", properties.getProperty("ENV"));
			} else {
				envProperty = System.getProperty("environment");

			}
			System.out.println(" Environemnt ------------------------- " + envProperty);
			if (jenkinsProp == null)
				jenkinsProp = envProperty;

			buffer.append(jenkinsProp);
			buffer.append("/Test.properties");
			System.out.println("StrFilePath ========== " + buffer.toString());

			FileInputStream tempIOStream = new FileInputStream(new File(buffer.toString()));

			properties.load(tempIOStream);

			for (String key : properties.stringPropertyNames()) {
				configMap.put(key, properties.getProperty(key));
			}

			System.out.println("Loaded ENV Specific property - configMap = " + configMap);

			tempIOStream.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
