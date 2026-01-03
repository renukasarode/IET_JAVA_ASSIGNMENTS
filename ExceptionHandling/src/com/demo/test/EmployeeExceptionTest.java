package com.demo.test;

import com.demo.exception.NegativeSalaryException;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImple;

public class EmployeeExceptionTest {

	public static void main(String[] args) {
		EmployeeService ser = new EmployeeServiceImple();
         try {
			ser.acceptData();
		} catch (NegativeSalaryException e) {
			System.out.println(e.getMessage());
		}
	}

}
