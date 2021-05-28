package com.testMG.client;


import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.testMG.model.Employe;

public class CallRestService {
	
	public CallRestService() {};
	
	public static Employe[] callRestService() {
		
	    RestTemplate restTemplate = new RestTemplate();
	    
	    ResponseEntity<Employe[]> response = restTemplate.getForEntity("http://masglobaltestapi.azurewebsites.net/api/Employees", Employe[].class);
	    
	    Employe[] employees = response.getBody();
	    
	    return employees; 
	}
}
