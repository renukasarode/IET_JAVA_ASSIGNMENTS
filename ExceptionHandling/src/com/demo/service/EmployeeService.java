package com.demo.service;

import com.demo.exception.NegativeSalaryException;

public interface EmployeeService {

	void acceptData() throws NegativeSalaryException;

}
