package com.mindtree.springRestfull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ab.springRestfull.repository.EmployeeRepository;


/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ComponentScan(value="com.mindtree")
@TestPropertySource("classpath:/application.test.properties")
public class AppTest {
	
	@Autowired
	EmployeeRepository empRepo;
	
	@Test
	public void test(){
	 System.out.println("hello");
	}
}
