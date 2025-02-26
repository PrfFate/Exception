package com.aliacar.controller;

import com.aliacar.dto.DtoEmployee;
import com.aliacar.model.RootEntity;


public interface IEmployeeController {

    public RootEntity<DtoEmployee> findEmployeeById(Long id);

}
