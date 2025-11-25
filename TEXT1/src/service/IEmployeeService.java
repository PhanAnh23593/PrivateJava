package service;

import model.Employee;

import java.util.ArrayList;
import java.util.List;

public interface IEmployeeService {
    ArrayList<Employee> getEmployees();
    Employee getEmployeeByID(String id);
    ArrayList<Employee> getEmployeeByName(String name);
}
