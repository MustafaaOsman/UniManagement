package com.gmail.umarosman77.unimanagement.consumer;

import com.gmail.umarosman77.unimanagement.entity.EmployeeEntity;
import com.gmail.umarosman77.unimanagement.pojo.EmployeePojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class EmployeeConsumer {

	@Autowired
	RestTemplate restTemplate;

	@GetMapping(path = "/employee/{id}")
	public @ResponseBody EmployeePojo getEmployee(@PathVariable(name = "id") Long id) {

		EmployeeEntity employeeEntity;// = employeeRepo.find(id);

		return new EmployeePojo();
	}
}
