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
public class TestAllInOneDocxRpcMojo extends BaseMojoTest {
	@Override
	protected Properties setUserProperties() {
		return null;
	}

	@Override
	protected String mavenProjectDir() {
		return "project-demos/aggregator-demo/dubbo-svc-1";
	}


	/**
	 * test docx mojo's running
	 */
	@Test
	public void testDocxMojoRunning() throws Exception {
		Mojo runnableMojo = findRunnableMojo(MojoConstants.RPC_HTML_MOJO);
		runnableMojo.execute();
		runnableMojo = findRunnableMojo(MojoConstants.DOCX_RPC_MOJO);
		runnableMojo.execute();
	}
}
