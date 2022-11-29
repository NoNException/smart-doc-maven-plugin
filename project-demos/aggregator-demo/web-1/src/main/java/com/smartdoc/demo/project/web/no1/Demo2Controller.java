package com.smartdoc.demo.project.web.no1;

import java.util.List;

import com.smartdoc.demo.project.api.constants.ResponseMessage;
import com.smartdoc.demo.project.api.pojo.FooPojo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * DemoController At torna.demo.torna.web.no1
 * @author zongzi
 */
@RestController
@RequestMapping("/demo2")
public class Demo2Controller {

	/**
	 * find foo pojos by foo string
	 * @param foo fooString
	 * @return List of foo pojos;
	 */
	@GetMapping("/list/{foo}")
	public ResponseMessage<List<FooPojo>> findFooPojos(@PathVariable("foo") String foo) {
		return ResponseMessage.success(null);
	}

	/**
	 * update foo pojo if success then you get a void ;
	 * @param fooPojo foo pojo object
	 * @return void object
	 */
	@GetMapping("/update/foo")
	public ResponseMessage<Void> updateFooPojos(@RequestParam FooPojo fooPojo) {
		return ResponseMessage.success(null);
	}

	@PostMapping("add")
	public ResponseMessage<FooPojo> insertNewFooPojo(@RequestBody FooPojo fooPojo) {
		return ResponseMessage.success(fooPojo);
	}


}
