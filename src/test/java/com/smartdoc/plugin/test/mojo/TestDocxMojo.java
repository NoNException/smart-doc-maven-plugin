package com.smartdoc.plugin.test.mojo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import java.util.function.Consumer;

import com.power.doc.model.ApiConfig;
import com.smartdoc.mojo.BaseDocsGeneratorMojo;
import com.smartdoc.plugin.test.BaseMojoTest;
import com.smartdoc.plugin.test.util.ConfigFileUtil;
import org.apache.maven.plugin.Mojo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static com.smartdoc.constant.MojoConstants.*;

/**
 * Test docx html mojo
 * @author zongzi
 */
@RunWith(Parameterized.class)
public class TestDocxMojo<T extends BaseDocsGeneratorMojo> extends BaseMojoTest {
	/**
	 * test maven project dir
	 */
	private final String mavenProjectDir;
	/**
	 * test properties whick can cover mojo's properties
	 */
	private final String testConfigFilePath;

	private String goal;

	public TestDocxMojo(String mavenProjectDir, String goal, Properties testProperties) {
		this.mavenProjectDir = mavenProjectDir;
		this.goal = goal;
		this.testConfigFilePath = ConfigFileUtil.temporaryConfigFile(testProperties);
	}

	@Override
	protected Properties setUserProperties() {
		return null;
	}

	@Override
	protected String mavenProjectDir() {
		return this.mavenProjectDir;
	}

	@Parameters
	public static List<Object[]> generateMojoRunningParams() {
		String htmlProjectPath = "project-demos/aggregator-demo/web-1";
		String rpcProjectPath = "project-demos/aggregator-demo/dubbo-svc-1";
		String exampleProjectPath = "/Users/zongzi/IdeaProjects/github-projects/smart-doc-example-cn";

		return Arrays.asList(
				// new Object[] {htmlProjectPath, DOCX_MOJO, allInOne(true)},
				// new Object[] {htmlProjectPath, DOCX_MOJO, allInOne(false)},
				// new Object[] {rpcProjectPath, DOCX_RPC_MOJO, allInOne(true)},
				// new Object[] {rpcProjectPath, DOCX_RPC_MOJO, allInOne(true).andThen(notCoverOld())
				// 		.andThen(clearDependency()).andThen(clearRpcConfigContent())},
				// new Object[] {rpcProjectPath, DOCX_RPC_MOJO, allInOne(false).andThen(notCoverOld())},
				new Object[] {exampleProjectPath, DOCX_RPC_MOJO, allInOne(true)},
				// new Object[] {exampleProjectPath, DOCX_MOJO, allInOne(false)},
				new Object[] {exampleProjectPath, DOCX_MOJO, allInOne(true)}
				// new Object[] {exampleProjectPath, DOCX_RPC_MOJO, allInOne(false)}

		);
	}

	public static Properties allInOne(boolean allInOne) {
		Properties properties = new Properties();
		properties.setProperty("allInOne", String.valueOf(allInOne));
		return properties;
	}

	/**
	 * test docx mojo's running
	 */
	@Test
	public void testDocxMojoRunning() throws Exception {
		Mojo runnableMojo = findRunnableMojo(this.goal);
		runnableMojo.execute();
	}

}
