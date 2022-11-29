package com.smartdoc.demo.project.service.no1;

import com.smartdoc.demo.project.api.pojo.FooPojo;
import com.smartdoc.demo.project.api.service.Foo2Service;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * Foo2Service 's implements
 * @author zongzi
 */
@DubboService
public class Foo2ServiceImpl implements Foo2Service {

	@Override
	public FooPojo findFooInFoo2(FooPojo fooPojo) {
		return null;
	}

	@Override
	public void addFooPojoInFoo2(FooPojo fooPojo) {

	}
}
