package com.aliacar.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aliacar.controller.IEmployeeController;
import com.aliacar.dto.DtoEmployee;

import com.aliacar.service.IEmployeeService;

@RestController
@RequestMapping("/rest/api/employee")
public class EmployeeControllerImpl implements IEmployeeController{

    @Autowired
    private IEmployeeService employeeService;

    @GetMapping("/list/{id}")
    @Override
    public DtoEmployee findEmployeeById(@PathVariable(value ="id")Long id) {
    return employeeService.findEmployeeById(id);
       
    }

}
