package com.szyska.employeeAPI.data.employee;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.szyska.employeeAPI.data.user.User;

@RestController
@RequestMapping
public class EmployeeController {
	
	@Autowired
	EmployeeRepository employeeRepo;
	
	@GetMapping(path="/getAllEmployees", produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<Employee> getAllEmployees() {
		return employeeRepo.findAll();
	}
	
	@GetMapping(path = "/getEmpById/{id}",produces = {MediaType.APPLICATION_JSON_VALUE})
	public Optional<Employee> getEmployeeById(@PathVariable Integer id) {		
		return employeeRepo.findById(id);
	}
	
	@GetMapping(path = "/test/{id}")
	public Optional<Employee> getEmployeeByIdSecureTest(@PathVariable Integer id) {	
		
		System.out.println("---------------- Authentication -----------------");
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		System.out.println("username " + auth.getPrincipal());
		System.out.println("password: " + auth.getCredentials());
		System.out.println("authorities: " + auth.getAuthorities());
		System.out.println("details: " + auth.getDetails());		
		return employeeRepo.findById(id);
	}

	@PostMapping(path="/addEmployee",consumes=MediaType.APPLICATION_JSON_VALUE)
	public void addEmployeeToDatabase(@RequestBody Employee employee) {
		System.out.println(employee);
		try {
			this.employeeRepo.save(employee);
		}catch(Exception e){
			 
		}
	}
	
}
