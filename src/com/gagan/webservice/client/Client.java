package com.gagan.webservice.client;

import com.gagan.webservice.Greeting;
import com.gagan.webservice.GreetingImplService;

public class Client {
	
	public static void main(String[] args){
		 
			GreetingImplService service = new GreetingImplService();
			Greeting greeting = service.getGreetingImplPort();			
			System.out.println(greeting.sayHello("Gagan"));
			
		}
}
