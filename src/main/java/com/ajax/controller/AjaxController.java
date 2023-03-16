package com.ajax.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ajax.dto.AjaxDTO;
import com.ajax.dto.MovieDTO;
import com.ajax.service.MovieService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class AjaxController {
	
	private final MovieService movieService;

	@GetMapping("/ex01")
	public String ex01() {

		System.out.println("AajaxController ex01 요청 성공");

		return "index"; // index.html 에 작성된 내용이 그대로 출력됨
	}

	@PostMapping("/ex02")
	@ResponseBody
	public String ex02() {

		System.out.println("AajaxController ex01 요청 성공");

		return "안녕하세요"; // index.html 에 작성된 내용이 그대로 출력됨
	}

	@GetMapping("/ex03") // ajax에서 param1, parm2를 넘겨준다.
	public @ResponseBody String ex03(@RequestParam("param1") String param1, @RequestParam("param2") String param2) {

		System.out.println("AajaxController ex03 요청 성공");
		System.out.println(param1 + param2);

		return "ex03 처리 완료"; // index.html 에 작성된 내용이 그대로 출력됨
	}

	@PostMapping("/ex04") // ajax에서 param1, parm2를 넘겨준다.
	public @ResponseBody String ex04(@RequestParam("param1") String param1, @RequestParam("param2") String param2) {

		System.out.println("AajaxController ex04 요청 성공");
		System.out.println(param1 + param2);

		return "ex04 처리 완료"; // index.html 에 작성된 내용이 그대로 출력됨
	}

	@GetMapping("/ex05") // ajax에서 param1, parm2를 넘겨준다.
							// @ModelAttribute : 클라이언트에세 넘긴 파라미터를 DTO에 저장(생략)
	public @ResponseBody AjaxDTO ex05(@ModelAttribute AjaxDTO ajaxDTO) {

		System.out.println("AajaxController ex05 요청 성공");
		System.out.println(ajaxDTO.getParam1() + ajaxDTO.getParam2());

		return ajaxDTO; // index.html 에 작성된 내용이 그대로 출력됨
	}

	@PostMapping("/ex06") // ajax에서 param1, parm2를 넘겨준다.
							// @ModelAttribute : 클라이언트에세 넘긴 파라미터를 DTO에 저장(생략)
	public @ResponseBody AjaxDTO ex06(@ModelAttribute AjaxDTO ajaxDTO) {

		System.out.println("AajaxController ex06 요청 성공");
		System.out.println(ajaxDTO.getParam1() + ajaxDTO.getParam2());

		// BackEnd DB의 로직을 처리후 DB의 레코드 하나를 DTO 객체에 저장후 리턴

		return ajaxDTO; // index.html 에 작성된 내용이 그대로 출력됨
	}

	@PostMapping("/ex07") // ajax에서 param1, parm2를 넘겨준다.
							// @RequestBody : 클라이언트에세 넘긴 파라미터를 DTO에 저장
							// 리턴을 DTO 객체를 return
	public @ResponseBody AjaxDTO ex07(@RequestBody AjaxDTO ajaxDTO, Model model) {

		System.out.println("AajaxController ex06 요청 성공");
		System.out.println(ajaxDTO.getParam1() + ajaxDTO.getParam2());

		model.addAttribute("ex07", ajaxDTO);

		return ajaxDTO; // index.html 에 작성된 내용이 그대로 출력됨
	}

	@PostMapping("/ex08") // ajax에서 param1, parm2를 넘겨준다.
	// @RequestBody : 클라이언트에세 넘긴 파라미터를 DTO에 저장
	// 리턴을 DTO 객체를 return
	public @ResponseBody List<AjaxDTO> ex08(@RequestBody AjaxDTO ajaxDTO,Model model) {

		System.out.println("AajaxController ex06 요청 성공");
		System.out.println("ajaxDTO : "+ajaxDTO);
			
		// BackEnd DB의 로직을 처리후 DB의 레코드 하나를 DTO 객체에 저장후 리턴
		List<AjaxDTO> dtoList = new ArrayList<>();
		dtoList.add(ajaxDTO);
		dtoList.add(new AjaxDTO("data1","data2"));
		dtoList.add(new AjaxDTO("data1","data2"));
		
		model.addAttribute("ex08", dtoList);

		return dtoList; // index.html 에 작성된 내용이 그대로 출력됨
	}
	@PostMapping("/ex09") // ajax에서 param1, parm2를 넘겨준다.
	// @RequestBody : 클라이언트에세 넘긴 파라미터를 DTO에 저장
	// 리턴을 ResponsEntity 객체를 return
	//@ ResponseBody : 리턴되는 값이 String, Data(DTO), List<dto> <==data만 전송
	public ResponseEntity ex09(@RequestBody AjaxDTO ajaxDTO) {

		System.out.println("AajaxController ex06 요청 성공");
		System.out.println("ajaxDTO : "+ajaxDTO);
			
		// BackEnd DB의 로직을 처리후 DB의 레코드 하나를 DTO 객체에 저장후 리턴

		return new ResponseEntity<>(ajaxDTO,HttpStatus.OK); // index.html 에 작성된 내용이 그대로 출력됨
		//return new ResponseEntity<>(ajaxDTO,HttpStatus.NOT_FOUND);
	}
	
	@PostMapping("/ex10") // ajax에서 param1, parm2를 넘겨준다.
	// @RequestBody : 클라이언트에세 넘긴 파라미터를 DTO에 저장
	// 리턴을 ResponsEntity 객체를 return
	//@ ResponseBody : 리턴되는 값이 String, Data(DTO), List<dto> <==data만 전송
	public ResponseEntity ex10(@RequestBody AjaxDTO ajaxDTO) {

		System.out.println("AajaxController ex06 요청 성공");
		System.out.println("ajaxDTO : "+ajaxDTO);
			
		// BackEnd DB의 로직을 처리후 DB의 레코드 하나를 DTO 객체에 저장후 리턴
		List<AjaxDTO> dtoList = new ArrayList<>();
		dtoList.add(ajaxDTO);
		dtoList.add(new AjaxDTO("data1","data2"));
		dtoList.add(new AjaxDTO("data1","data2"));
		return new ResponseEntity<>(dtoList,HttpStatus.OK); 
		//return new ResponseEntity<>(dtoList,HttpStatus.NOT_FOUND); // index.html 에 작성된 내용이 그대로 출력됨
	}
	
	@PostMapping("/a")
	public ResponseEntity ajaxlab(@RequestBody AjaxDTO ajaxDTO) {
		
		System.out.println("AajaxController 요청 성공");
		System.out.println("ajaxDTO : "+ajaxDTO);
		
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@PostMapping("/movie/put") 
	public @ResponseBody String lab2(@RequestBody MovieDTO movieDTO) {
		System.out.println("AjaxController ex07 요청 성공");
		System.out.println("ajaxDTO : " + movieDTO);

//BackEnd DB의 로직을 처리후 DB의 레코드 하나를 DTO 객체에 저장후 리턴 

		
		String str = movieService.movieInsert(movieDTO); 
		
		return str;
	}
	

}
