package com.test.rest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.java.Log;



@RestController
@RequestMapping("/sample")
@Log
public class SampleController {
	

	@GetMapping(value="/getText", produces="text/plain; charset=utf-8")
	public String getText() {
		log.info("MIME TYPE: "+ MediaType.TEXT_PLAIN_VALUE);
		
		return "안녕하세요";
	}
	

	
}
