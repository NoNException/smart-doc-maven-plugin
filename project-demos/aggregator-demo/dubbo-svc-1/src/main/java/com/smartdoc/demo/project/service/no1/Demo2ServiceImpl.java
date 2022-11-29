package com.smartdoc.demo.project.service.no1;

import java.util.List;

import com.smartdoc.demo.project.api.pojo.FooPojo;
import com.smartdoc.demo.project.api.service.Demo2Service;
import com.smartdoc.demo.project.api.service.DemoService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 *
 * Demo2Service服务实现类
 * @author zongzi
 */
@DubboService
public class Demo2ServiceImpl implements Demo2Service {


	@Override
	public FooPojo updateFooPojoInDemo2(FooPojo fooPojo) {
		return null;
	}

	@Override
	public List<FooPojo> findFooPojosInDemo2(String fooString) {
		return null;
	}
}
