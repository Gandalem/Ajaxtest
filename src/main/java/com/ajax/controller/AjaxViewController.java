package com.ajax.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AjaxViewController {

	@GetMapping("/ajax-ex-01")
	public String ajaxEx01(){
		return"ajax-ex-01";
	}
	@GetMapping("/ajax-ex-02")
	public String ajaxEx02(){
		return"ajax-ex-02";
	}
	
	@GetMapping("/ajax-ex-03")
	public String ajaxEx03(){
		return"ajax-ex-03";
	}
	
	@GetMapping("/ajax-ex-04")
	public String ajaxEx04(){
		return"ajax-ex-04";
	}
	
	@GetMapping("/ajax-ex-05")
	public String ajaxEx05(){
		return"ajax-ex-05";
	}
	@GetMapping("/ajax-ex-06")
	public String ajaxEx06(){
		return"ajax-ex-06";
	}
	@GetMapping("/ajax-ex-07")
	public String ajaxEx07(){
		return"ajax-ex-07";
	}
	@GetMapping("/ajax-ex-08")
	public String ajaxEx08(){
		return"ajax-ex-08";
	}
	@GetMapping("/ajax-ex-09")
	public String ajaxEx09(){
		return"ajax-ex-09";
	}
	@GetMapping("/ajax-ex-10")
	public String ajaxEx10(){
		return"ajax-ex-10";
	}
	
	@GetMapping("/ajax-lab")
	public String ajaxlab() {
		return "Ajax_lab";
	}
	
	@GetMapping("/steam")
	public String steamapi() {
		return "steamAPITest";
	}
	@GetMapping("/ajax_lab2")
	public String api() {
		return "Ajax-lab2";
	}
	
	
}
