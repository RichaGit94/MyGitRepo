package com.example.Hello;

import java.util.HashMap;
import java.util.Map;

public class HelloValue {
	public String name="n",id="i",city="c";
	public Map<String,String> Value()
	{
		Map<String,String> map= new HashMap<String,String>();
		map.put(name,"Richa");
		map.put(id, "167193");
		map.put(city, "Pune");
		return map;
	}

}
