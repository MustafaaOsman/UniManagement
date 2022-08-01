package com.gmail.umarosman77.unimanagement.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class EmployeePojo {

	private Long id;
	private String name;
	private String surname;
}
