package com.to;

public class Employee {
    private  int employeeID;
    private String employeeName;
    public Employee(){
        System.out.println("Default Construct  called");

    }
    public Employee (int employeeID, String employeeName){
        super();
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        System.out.println("param Const called");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", employeeName='" + employeeName + '\'' +
                '}';
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        System.out.println("Setting Employee ID called");
        this.employeeID = employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        System.out.println("Setting Employee Name called");
        this.employeeName = employeeName;
    }
}
