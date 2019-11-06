package com.example.Hello;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/HelloController")
public class HelloController {
	
	HelloValue hV=new HelloValue();
	
	@RequestMapping("/getData")
	public Map<String,String> getData()
	{
		//Map<String,String> Mymap= new HashMap<String,String>();
		//Mymap.putAll(hV.Value());
		
		return hV.Value();
	}

}
