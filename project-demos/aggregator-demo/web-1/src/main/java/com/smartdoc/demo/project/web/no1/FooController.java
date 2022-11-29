package com.smartdoc.demo.project.web.no1;

import com.smartdoc.demo.project.api.constants.ResponseMessage;
import com.smartdoc.demo.project.api.pojo.FooPojo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author zongzi
 */
@RestController
@RequestMapping("/foo")
public class FooController {

	/**
	 * 通过ID搜索
	 * @param fooId foo's id
	 * @return foo pojo
	 */
	@GetMapping("/id/{fooId}")
	public ResponseMessage<FooPojo> findByFooId(@PathVariable("fooId") Integer fooId) {
		return ResponseMessage.success(null);

	}

	/**
	 * 通过ID 删除Foo
	 * @param fooId food Id
	 * @return Response Success
	 */
	@DeleteMapping("/delete/{fooId}")
	public ResponseMessage<Void> deleteByFooId(@PathVariable("fooId") Integer fooId) {
		return ResponseMessage.success(null);

	}
}
