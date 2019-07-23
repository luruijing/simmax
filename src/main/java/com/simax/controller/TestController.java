package com.simax.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.simax.bean.Person;
import com.simax.service.TestService;

/**
 * @author XDeng
 * @param <E>
 * @date 2019年7月23日上午8:29:29
 */
/**@RestController 相当于：Controller+ResponseBody 不跳转页面*/

@Controller
public class TestController {
	
	@Autowired
	private TestService testService;

	@RequestMapping("test")
	@ResponseBody
	public String test(){
		return "我的测试：test";
	}
	

	/**请求地址: localhost:8080/person/show?name=zhang&age=23 请求方式是get*/
	/**@RequestParam("name")绑定请求地址中的name到参数name中    ModelMap map 存放返回内容*/
	@RequestMapping(value = "show",method = RequestMethod.GET)  
    private String show(@RequestParam("name")String name,@RequestParam("age")int age,ModelMap map){   
        Person person = new Person();
        person.setName(name);
        person.setAge(age);
        map.addAttribute("person",person);
        return "test";    /**返回的是显示数据的html的文件名*/
    }
	
	@RequestMapping("queryTest")
	@ResponseBody
	public String queryTest(){
		List<Map<String, Object>> list = testService.queryTest();
		for (Map<String, Object> map : list) {
			System.out.println(map.entrySet());
		}	
		return "success";
	}
	
}
