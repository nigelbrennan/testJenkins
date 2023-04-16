package com.ait.microservices;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HelloService {
	
	@RequestMapping("/")
	public String index() {
		return "Hello World 2023...";
	}
	
	@RequestMapping("/abc")
	public String index2() {
		return "Hello World 2023...abc";
	}
	
	@RequestMapping("/sayHello/{firstName}/{lastName}")
	public String helloWorldPathParam(@PathVariable String firstName, @PathVariable String lastName) {
		return "Hello World with name: "+firstName+ " "+lastName;
	}
	
	@RequestMapping("/someperson")
	public Person getPerson() {
		return new Person("Joe", "Bloggs",20);
	}
	
	@PostMapping("/someperson")
	public String postPerson(@RequestBody Person person) {
		return person.getFirstName()+" "+person.getLastName()+" "+person.getAge();
	}
	
	@RequestMapping("/somepersonentity")
	public ResponseEntity<Person> getPersonEntity() {
		return new ResponseEntity<>(new Person("Joe", "Bloggs",20),HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/notallowed")
	public String operationForbidden() {
         throw new ForbiddenException();
	}
	

}
