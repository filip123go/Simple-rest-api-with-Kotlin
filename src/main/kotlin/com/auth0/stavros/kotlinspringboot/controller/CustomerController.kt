package com.auth0.stavros.kotlinspringboot.controller

import com.auth0.stavros.kotlinspringboot.model.Customer
import com.auth0.stavros.kotlinspringboot.repository.CustomerRepo
import org.springframework.data.repository.CrudRepository
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/customers") //all endpoints in the class have the /customers prefix.
class CustomerController(val repository: CustomerRepo) {

	@GetMapping
	fun findAll(): MutableIterable<Customer> = repository.findAll()

	@PostMapping // accepts a JSON version of customer and deserialize it to Customer class automatically.
	fun addCustomer(@RequestBody customer: Customer): Customer = repository.save(customer)

	@PutMapping("/{id}")
	fun updateCustomer(@PathVariable id: Long, @RequestBody customer: Customer) {
		assert(customer.id == id) // if (customer.id == id)
		repository.save(customer)
	}

	@DeleteMapping("/{id}")
	fun removeCustomer(@PathVariable id: Long) = repository.delete(id)

	@GetMapping("/{id}")
	fun getCustomerById(@PathVariable id: Long): Customer = repository.findOne(id)
}
