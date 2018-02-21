package com.bravedroid.srp.after.solution2;

public class EmployeeFacade {
    PayCalculator payCalculator;
    HourReporter hourReporter;
    EmployeeSaver employeeSaver;

    public EmployeeFacade() {
        payCalculator = new PayCalculator();
        hourReporter = new HourReporter();
        employeeSaver = new EmployeeSaver();
    }

    public void payCalculator(EmployeeData employeeData) {
        payCalculator.calculatePay(employeeData);
    }

    public void hourReporter(EmployeeData employeeData) {
        hourReporter.reportHours(employeeData);
    }

    public void saveEmployee(EmployeeData employeeData) {
        employeeSaver.saveEmployee(employeeData);
    }
}
