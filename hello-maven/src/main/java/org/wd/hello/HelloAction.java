package org.wd.hello;

import org.apache.commons.httpclient.HttpClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloAction {
	@RequestMapping("hello/{wd}")
	@ResponseBody
	public String hello(@PathVariable("wd") String wd) {

	
		
		return "Hello " + wd;
	}
}
