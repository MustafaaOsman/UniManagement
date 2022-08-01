package com.gmail.umarosman77.unimanagement.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "employee")
@Data
public class EmployeeEntity {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "surname")
	private String surname;
}
