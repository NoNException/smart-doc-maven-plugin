package com.smartdoc.plugin.test.mojo;

import java.util.Properties;

import com.smartdoc.constant.MojoConstants;
import com.smartdoc.plugin.test.BaseMojoTest;
import org.apache.maven.plugin.Mojo;
import org.junit.Test;

/**
 * Test docx html mojo
 * @author zongzi
 */
public class TestDocxHtmlMojo extends BaseMojoTest {
	@Override
	protected Properties setUserProperties() {
		return null;
	}

	@Override
	protected String mavenProjectDir() {
		return "project-demos/aggregator-demo/web-2";
	}


	/**
	 * test docx mojo's running
	 */
	@Test
	public void testDocxHtmlMojoRunning() throws Exception {
		Mojo runnableMojo = findRunnableMojo(MojoConstants.DOCX_MOJO);
		runnableMojo.execute();
	}
}
