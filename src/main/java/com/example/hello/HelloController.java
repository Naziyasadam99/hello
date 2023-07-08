package com.example.hello;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {
	RestTemplate rest = new RestTemplate();
	@GetMapping(value="getHiviaHello")
	public String getHello()
	{
		String url="http://localhost:8080/getHi";//another port url//
		ResponseEntity<String> response = rest.exchange(url,HttpMethod.GET,null,String.class);//urlvalue,getmapping,header,return classname//
		String val = response.getBody();//getbody()method used to getreponseEntityString to String;
		return val;
	}
	
	
	

}
