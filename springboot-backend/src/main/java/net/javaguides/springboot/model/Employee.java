package net.javaguides.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data   //Lombok library reduces boilerplate. It has getters, setters, constructors on it.
@Entity   //Specifies that the class is an Entity
@Table(name="employees")  //Specifies the table in the database with wich this entity is mapped
public class Employee {
	
	@Id //specifies the primary key of the entity
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="first_name", nullable = false)
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="email")
	private String email;

}
