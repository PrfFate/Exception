package com.aliacar.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.aliacar.dto.DtoEmployee;
import com.aliacar.service.IEmployeeService;
import com.aliacar.starter.ExceptionApplication;

@SpringBootTest(classes = {ExceptionApplication.class})
class ExceptionApplicationTests {

	@Autowired
	private IEmployeeService employeeService;

	@BeforeEach
	private void beforeEach(){
		System.out.println("beforeach calisti");
	}

	
	@Test
	public void testFindEmployeeById(){
		DtoEmployee employee= employeeService.findEmployeeById(2L);
		//assertNotNull(5); Gelen değer Null mı
		//assertEquals(2, employee.getId()); Gelen değer beklenen değere eşit mi
		if(employee!=null){
			System.out.println("İsim : "+employee.getName());
		}
	}

	@AfterEach
	private void AfterEach(){
		System.out.println("aftereach calisti");
	}


}
