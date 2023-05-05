package com.employee;


public class Emppay {
    public static void main(String[] args) {
        Emp e = new Emp("Anuja", "23", "Female", 25000.00);
        e.calculateSalary();
        e.display();
    }
}


   /* Write a Java program to perform employee payroll processing using packages.
   In the java file, Emp.java creates a package employee and creates a class Emp.
   Declare the variables name,empid, category, bpay, hra, da, npay, pf, grosspay, incometax, and
   allowance. Calculate the values in methods. Create another java file Emppay.java.
   Create an object e to call the methods to perform and print values.

    Test Data:
        Pass name as ANU, id as 23, category as Female and bpay as 12000.
    */