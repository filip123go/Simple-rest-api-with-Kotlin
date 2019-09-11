package com.auth0.stavros.kotlinspringboot.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Customer(
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	var id: Long = 0,
	var firstName: String = "",
	var lastName: String = ""
)
