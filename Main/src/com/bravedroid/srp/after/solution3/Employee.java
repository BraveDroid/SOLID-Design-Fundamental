package com.bravedroid.srp.after.solution3;
//actor 3 COO Team, save the employee and delegate the actor1 and the actor2 to do things
public class Employee {
    //data structure
    private EmployeeData employeeData;
    //actor 1 CFO Team
    private PayCalculator payCalculator;
    //actor 2 CTO Team
    private HourReporter hourReporter;


    public Employee(EmployeeData employeeData, HourReporter hourReporter, PayCalculator payCalculator) {
        this.employeeData = employeeData;
        this.hourReporter = hourReporter;
        this.payCalculator = payCalculator;
    }

    public void payCalculator( ) {
        //delegate the payCalculator
        payCalculator.calculatePay(this);
    }

    public void hourReporter() {
        //delegate the hourReporter
        hourReporter.reportHours(this);
    }

    public void save() {
        // save employeeData
    }

    private static class EmployeeData {
    }
}
