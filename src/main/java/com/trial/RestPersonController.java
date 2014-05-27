package com.trial;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/restapp")
public class RestPersonController {
	
	PersonServiceImpl personService;
	
	@Autowired
	public void setPersonService(PersonServiceImpl personService) {
		this.personService = personService;
	}
	
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET, headers="Accept=application/json")
    public String index() {
		String ret1 = personService.getAllRecords().toString();
		System.out.println(ret1);
        return "Greetings from Spring Boot! from ganesh ghag spring rest app<p>"+ret1;
    }
	
	
	@RequestMapping(value = "/persons", method = RequestMethod.GET, headers="Accept=application/json")
    public List<Person> getAllPersons() {
		ArrayList<Person> persons = new ArrayList<Person>();
		persons.add(new Person());
		persons.add(new Person());
		persons.add(new Person());
		persons.add(new Person());
		persons.add(new Person());
		persons.add(new Person());
		persons.add(new Person());
		
        return persons;
    }
	
	
	@RequestMapping(value = "/person/{personId}", method = RequestMethod.GET, headers="Accept=application/json")
    public Person getPerson(@PathVariable String personId) {
		
		System.out.println("from inside getPerson with "+personId);
		
		return new Person();
    }
	
	@RequestMapping(value = "/person", method = RequestMethod.PUT, headers="Accept=application/json")
    public Person updatePerson(@RequestBody Person person) {
		
		System.out.println("from inside updatePerson with "+person);
		
		return new Person();
    }
	
	@RequestMapping(value = "/person", method = RequestMethod.DELETE, headers="Accept=application/json")
    public Person deletePerson(@RequestBody Person person) {
		
		System.out.println("from inside deletePerson with "+person);
		return new Person();
    }

	@RequestMapping(value = "/person", method = RequestMethod.POST, headers="Accept=application/json")
    public Person addPerson(@RequestBody Person person) {
		
		System.out.println("from inside addPerson with "+person);
		return new Person();
    }

	//http://www.infoq.com/articles/springmvc_jsx-rs
	@RequestMapping(value = "/personsQuery", method = RequestMethod.GET, headers="Accept=application/json")
    public Person personsQuery(@RequestParam String firstName) {
		
		System.out.println("from inside personsQuery with "+firstName);
		return new Person();
    }

}
