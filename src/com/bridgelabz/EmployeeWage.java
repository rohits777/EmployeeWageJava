package com.bridgelabz;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("*** Welcome to Employee wage computation ***");

        int empHrs=0;
        int wagePerHr=20;
        int empCheck=(int)(Math.random()*2);
        if(empCheck==1){
            System.out.println("Employee is Present");
            empHrs=8;
        }
        else{
            System.out.println("Employee is Absent");
             empHrs=0;
        }
        int wage= wagePerHr * empHrs;
        System.out.println("Daily wage of Employee is:" +wage);
    }
}