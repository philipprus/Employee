package telran.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import telran.dto.Employee;
import telran.dto.EmployeeApiConstants;
import telran.dto.EmployeeReturnCode;
import telran.model.IEmployee;

import java.util.HashMap;
import java.util.List;

@SpringBootApplication
@RestController
@ComponentScan({"telran.model"})

public class EmployeeServiceAppl {
    @Autowired
    IEmployee employees;

    @PostMapping(value = EmployeeApiConstants.ADD)
    EmployeeReturnCode addEmployee(@RequestBody Employee employeeModel){
        return employees.addEmployee(employeeModel);
    }



    @GetMapping(value = EmployeeApiConstants.REMOVE)
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
