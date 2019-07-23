package com.simax.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author XDeng
 * @param <E>
 * @date 2019年7月23日上午10:48:35
 */
@Controller
public class CommoController {

	@RequestMapping("/")
	public String index(){
		return "index";
	}
	
	
}
