package model;

import service.IWorkable;

public class Tester extends Employee implements IWorkable {
    private int bugsDetectedCount;

    public Tester( String name, int age, double basicSalary, Device device,int bugsDetectedCount) {
        super(name,age,basicSalary,device);
        this.bugsDetectedCount = bugsDetectedCount;
    }

    public int getBugsDetectedCount() {
        return bugsDetectedCount;
    }

    public void setBugsDetectedCount(int bugsDetectedCount) {
        this.bugsDetectedCount = bugsDetectedCount;
    }

    @Override
    public void work() {
        System.out.println("Working on Tester");
    }

    @Override
    public double calculateSalary() {
        return basicSalary +BASE_SALARY_RATE*bugsDetectedCount;
    }

    @Override
    public String toString() {
        return super.toString() + "BugsDetectedCount=" + bugsDetectedCount + " \n";
    }
}
