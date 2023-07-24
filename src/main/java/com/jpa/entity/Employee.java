package com.jpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Table(name="oracletest")
@Data
@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	@Column(name="eid")
	private Integer id;
	@Column(name="ename",length = 30)
	private String name;
	@Column(name="email",length = 30)
	private String email;

}
