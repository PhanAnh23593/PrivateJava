package model;

import service.IDebuggable;

public class Developer extends Employee implements IDebuggable {
    private int overtimeHours;

    public Developer(String name, int age, double basicSalary, Device device, int overtimeHours ) {
        super( name, age, basicSalary, device);
        this.overtimeHours = overtimeHours;
    }

    public int getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    @Override
    public void fixBug(){
        System.out.println("Fixing Bug");
    }

    @Override
    public double calculateSalary() {
        return basicSalary + overtimeHours*BASE_SALARY_RATE;
    }

    @Override
    public String toString() {
        return super.toString()+" Overtime Hours: "+overtimeHours + " \n";
    }
}
