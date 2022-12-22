package com.study.springboot202210junil.repository;

import com.study.springboot202210junil.web.dto.EmployeeDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeRepository {
    public int saveEmployee(EmployeeDto employeeDto);
}
