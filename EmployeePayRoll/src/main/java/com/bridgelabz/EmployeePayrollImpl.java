package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollImpl {
    public enum IOService {
        CONSOLE_IO, FILE_IO, REST_IO
    }

    ;

    private List<EmployeePayrollData> employeePayrollDataList;


    public EmployeePayrollImpl(List<EmployeePayrollData> employeePayrollList) {
        this.employeePayrollDataList = employeePayrollList;
    }


    public EmployeePayrollImpl() {
        this.employeePayrollDataList = new ArrayList<>();
    }

    /**
     * This method is used to count the entries.
     */
    public static long countEntries(IOService fileIO) {
        if (fileIO.equals(IOService.FILE_IO)) {
            return new EmployeePayrollFileIOService().countEntries();
        }
        return 0;
    }

    /*
     Purpose: Method to take employee details from console.
     *  and add those details to List.
     */
    public void readData() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter employee ID ");
        int id = sc.nextInt();
        System.out.println("Enter Employee name ");
        String name = sc.next();
        System.out.println("Enter Employee salary ");
        double salary = sc.nextDouble();

        employeePayrollDataList.add(new EmployeePayrollData(id, name, salary));
    }

    /**
     * This method is used to write the employee payroll data.
     */
    public void writeData(IOService fileIO) {
        if (fileIO.equals(IOService.CONSOLE_IO)) {
            System.out.println(employeePayrollDataList);
        } else if (fileIO.equals(IOService.FILE_IO)) {
            new EmployeePayrollFileIOService().writeDataToFile(employeePayrollDataList);
        }
    }

}