package com.ab.springRestfull.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.ab.springRestfull.entity.Employee;

@Component
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
