package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeePayrollMain {

    public static void main(String[] args) {
        ArrayList<EmployeePayRollData> employeePayrollDataList = new ArrayList<>();
        EmployeePayRollImpl employeePayrollImpl = new EmployeePayRollImpl(employeePayrollDataList);
        Scanner consoleInputReader = new Scanner(System.in);
        employeePayrollImpl.readEmployeePayrollData(consoleInputReader);
        employeePayrollImpl.writeEmployeePayrollData();
    }
}
