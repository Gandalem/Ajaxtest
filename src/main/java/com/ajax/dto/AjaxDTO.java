package com.ajax.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor //모든 생성자
@NoArgsConstructor //기본생성자
public class AjaxDTO {
	
	private String param1;
	
	private String param2;
	
}
