package telran.model;

import org.springframework.stereotype.Service;
import telran.dto.Employee;
import telran.dto.EmployeeReturnCode;

import java.util.HashMap;
import java.util.List;


public interface IEmployee {

    EmployeeReturnCode addEmployee(Employee employee);
    EmployeeReturnCode removeEmployee(int id);
    HashMap<Integer,Employee> getAll();
    Employee getEmployee(int id);

}
