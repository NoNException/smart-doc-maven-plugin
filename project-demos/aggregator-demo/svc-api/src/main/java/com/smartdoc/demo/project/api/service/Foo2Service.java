package com.smartdoc.demo.project.api.service;


import com.smartdoc.demo.project.api.pojo.FooPojo;

/**
 * Foo2Service 测试服务
 * @author zongzi
 */
public interface Foo2Service {

	/**
	 * 测试查找fooPojo
 	 * @param fooPojo foo pojo object
	 * @return FooPojo
	 */
	FooPojo findFooInFoo2(FooPojo fooPojo);

	/**
	 * Add One Foo Pojo
	 * @param fooPojo foo pojo object
	 */
	void addFooPojoInFoo2(FooPojo fooPojo);


}
