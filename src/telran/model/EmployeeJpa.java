package telran.model;

import org.springframework.stereotype.Service;
import telran.dto.Employee;
import telran.dto.EmployeeReturnCode;

import java.util.HashMap;

@Service
public class EmployeeJpa implements IEmployee {


    private static HashMap <Integer, Employee> employees = new HashMap<>();

    @Override
    public EmployeeReturnCode addEmployee(Employee employee) {
        if(employees.containsKey(employee.getId())){
            return EmployeeReturnCode.EMPLOYEE_EXISTS;
        }
       employees.put(employee.getId(), employee);
       return EmployeeReturnCode.OK;
    }

    @Override
    public EmployeeReturnCode removeEmployee(int id) {
       if(employees.containsKey(id)){
           employees.remove(id);
           return EmployeeReturnCode.REMOVE;
       }
       return EmployeeReturnCode.NO_EMPLOYEE;
    }

    @Override
    public HashMap<Integer,Employee> getAll() {
        return employees;
    }

    @Override
    public Employee getEmployee(int id) {
       Employee employee = employees.get(id);
       return employee;
    }

}
