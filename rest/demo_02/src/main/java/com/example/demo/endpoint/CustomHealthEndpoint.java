package com.example.demo.endpoint;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id="custom")
public class CustomHealthEndpoint {

	Map<String,Object> details=new HashMap<>();
	
	@ReadOperation
	public CustomHealth health() {
		details.put("healthStatus", "Up and running");
		CustomHealth health=new CustomHealth();
		health.setHealthDetails(details);
		return health;
	}
	
	@ReadOperation
	public String customEndpointByName(@Selector String name) {
		return (String)details.get(name);
	}
	
	@WriteOperation
	public void writeEndpoint(@Selector String name,@Selector String value) {
		details.put(name, value);
	}
}
