package com.smartdoc.demo.project.service.no1;

import com.smartdoc.demo.project.api.pojo.FooPojo;
import com.smartdoc.demo.project.api.service.FooService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class FooServiceImpl implements FooService {
	@Override
	public FooPojo findFoo(FooPojo fooPojo) {
		return null;
	}

	@Override
	public void addFooPojo(FooPojo fooPojo) {

	}
}
