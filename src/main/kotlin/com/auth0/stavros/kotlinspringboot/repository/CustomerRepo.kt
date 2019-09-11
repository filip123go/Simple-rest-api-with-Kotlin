package com.auth0.stavros.kotlinspringboot.repository

import com.auth0.stavros.kotlinspringboot.model.Customer
import org.springframework.data.repository.CrudRepository

interface CustomerRepo: CrudRepository<Customer, Long>
