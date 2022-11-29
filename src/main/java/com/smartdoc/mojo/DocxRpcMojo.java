package com.smartdoc.mojo;

import com.power.doc.builder.DocxApiDocBuilder;
import com.power.doc.builder.rpc.RpcDocxBuilder;
import com.power.doc.model.ApiConfig;
import com.smartdoc.constant.MojoConstants;
import com.thoughtworks.qdox.JavaProjectBuilder;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Execute;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.ResolutionScope;


/**
 * Create doc's in .docx file
 * @author zongzi
 */
@Execute(phase = LifecyclePhase.COMPILE)
@Mojo(name = MojoConstants.DOCX_RPC_MOJO, requiresDependencyResolution = ResolutionScope.COMPILE)
public class DocxRpcMojo extends BaseDocsGeneratorMojo{
	@Override
	public void executeMojo(ApiConfig apiConfig, JavaProjectBuilder javaProjectBuilder) throws MojoExecutionException, MojoFailureException {
		try {
			new RpcDocxBuilder(javaProjectBuilder,apiConfig).buildApiDoc();
		} catch (Exception e) {
			getLog().error(e);
		}
	}
}
