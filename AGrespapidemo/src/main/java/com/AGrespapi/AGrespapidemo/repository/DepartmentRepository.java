package com.AGrespapi.AGrespapidemo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.AGrespapi.AGrespapidemo.model.Department;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, Integer>{

}
