package com.mysite.sbb1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	
	@GetMapping("/sbb")
	@ResponseBody
	public String index() {
		return "Hello World";
	}
	
	@GetMapping("/")
	public String root() {
//		TODO : 로그인 랜딩페이지로 변경 
		return "redirect:/question/list";
	}

}
