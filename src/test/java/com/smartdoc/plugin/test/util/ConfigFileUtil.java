package com.smartdoc.plugin.test.util;


import java.io.File;
import java.io.IOException;
import java.util.Properties;

import com.google.gson.Gson;
import com.power.common.util.FileUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * util to create template file
 * @author zongzi
 */
public class ConfigFileUtil {
	private static final Logger log = LoggerFactory.getLogger(ConfigFileUtil.class);
	static Gson gson = new Gson();

	/**
	 * create template config file
	 * @param properties the properties waiting to be written into the config-file
	 * @return the template file path
	 */
	public static  String temporaryConfigFile(Properties properties) {
		try {
			File tempFile = File.createTempFile("smart-doc", ".json");
			FileUtil.nioWriteFile(gson.toJson(properties), tempFile.getAbsolutePath());
			return tempFile.getAbsolutePath();
		}
		catch (IOException e) {
			log.error("Error happened when create template test .json file");
		}
		return null;
	}


}
