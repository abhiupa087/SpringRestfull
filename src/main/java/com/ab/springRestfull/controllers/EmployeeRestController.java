package com.ab.springRestfull.controllers;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ab.springRestfull.entity.Employee;
import com.ab.springRestfull.repository.EmployeeRepository;


@RestController
public class EmployeeRestController {

	@Autowired
	EmployeeRepository empRepo;
	
	/*@Autowired
	EmployeeHibernateDao empHibernateDao;*/

	/*@RequestMapping(value = "/fetch", method = RequestMethod.GET)
	public ResponseEntity<ArrayList<Employee>> getEmployees(Model model) {
		ArrayList<Employee> employees=(ArrayList<Employee>) empHibernateDao.fetchingEmployeeDetails();
		return new ResponseEntity<ArrayList<Employee>>(employees,HttpStatus.OK);
	}*/
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public ResponseEntity<String> addEmployee(@ModelAttribute Employee employee){
		empRepo.save(employee);
		return new ResponseEntity<String>("Record added!",HttpStatus.OK);
	}
	
	@RequestMapping(value="/findOne", method=RequestMethod.GET)
	public ResponseEntity<Employee> getOneEmployee(@RequestParam("id") int id){
		Employee employee=empRepo.findOne(id);
		return new ResponseEntity<Employee>(employee,HttpStatus.OK);
	}
	
	@RequestMapping(value="/test", method=RequestMethod.PUT)
	public void test(HttpServletResponse response,@RequestBody Employee employee){
		System.out.println("hello");
		response.setStatus(404);
	}
}
