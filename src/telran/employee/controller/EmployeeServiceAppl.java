package telran.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import telran.employee.dto.Employee;
import telran.employee.dto.EmployeeApiConstants;
import telran.employee.dto.EmployeeReturnCode;
import telran.employee.model.IEmployee;

import java.util.HashMap;


@SpringBootApplication
@RestController
@CrossOrigin
@ComponentScan({"telran.employee.model"})

public class EmployeeServiceAppl {
    @Autowired
    IEmployee employees;

    @PostMapping(value = EmployeeApiConstants.ADD)
    EmployeeReturnCode addEmployee(@RequestBody Employee employeeModel){
        return employees.addEmployee(employeeModel);
    }



    @DeleteMapping(value = EmployeeApiConstants.REMOVE)
    EmployeeReturnCode removeEmployee(@RequestBody int id){
        return employees.removeEmployee(id);
    }

    @GetMapping(value = EmployeeApiConstants.GET)
    Employee getEmployee(@RequestBody int id){
        return employees.getEmployee(id);
    }

    @GetMapping(value = EmployeeApiConstants.GETALL)
    HashMap<Integer, Employee> getAll(){
        return employees.getAll();
    }

    public static void main(String[] args) {
        SpringApplication.run(EmployeeServiceAppl.class, args);
    }

}
