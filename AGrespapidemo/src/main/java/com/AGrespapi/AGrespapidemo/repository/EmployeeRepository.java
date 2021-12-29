package com.AGrespapi.AGrespapidemo.repository;




import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.AGrespapi.AGrespapidemo.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
