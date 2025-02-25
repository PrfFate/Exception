package com.aliacar.controller;

import com.aliacar.dto.DtoEmployee;


public interface IEmployeeController {

    public DtoEmployee findEmployeeById(Long id);

}
