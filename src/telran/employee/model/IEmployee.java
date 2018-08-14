package telran.employee.model;

import telran.employee.dto.Employee;
import telran.employee.dto.EmployeeReturnCode;

import java.util.HashMap;


public interface IEmployee {

    EmployeeReturnCode addEmployee(Employee employee);
    EmployeeReturnCode removeEmployee(int id);
    HashMap<Integer,Employee> getAll();
    Employee getEmployee(int id);

}
