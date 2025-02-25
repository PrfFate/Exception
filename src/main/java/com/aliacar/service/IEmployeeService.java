package com.aliacar.service;

import com.aliacar.dto.DtoEmployee;


public interface IEmployeeService {

    public DtoEmployee findEmployeeById(Long id);
}
