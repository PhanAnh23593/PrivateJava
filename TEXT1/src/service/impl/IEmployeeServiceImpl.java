package service.impl;

import model.Developer;
import model.Device;
import model.Employee;
import model.Tester;
import service.IEmployeeService;

import java.util.ArrayList;

public class IEmployeeServiceImpl implements IEmployeeService {
    private static ArrayList<Employee> employees = new ArrayList<>();

    static{
        employees.add(new Tester("Anh",19,10000.0,new Device("Laptop"),5));
        employees.add(new Tester("Qua",14,1.0,new Device("Laptop"),1));

        employees.add(new Developer("Vy",20,1000.0,new Device("Laptop"),5));
        employees.add(new Developer("Hoang",20,10.0,new Device("Laptop"),6));
        employees.add(new Developer("Toan",20,100.0,new Device("Laptop"),7));
    }


    @Override
    public ArrayList<Employee> getEmployees(){
        return employees;
    }


    @Override
    public Employee getEmployeeByID(String id){
        for(Employee e:employees){
            if(e.getId().equals(id)){
                return e;
            }
        }
        return null;
    }


    @Override
    public ArrayList<Employee> getEmployeeByName(String name){
        ArrayList<Employee> employee = new ArrayList<>();
        for(Employee e : employees){
            if(e.getName().equalsIgnoreCase(name)){
                employee.add(e);
            }
        }
        return employee;
    };

}
