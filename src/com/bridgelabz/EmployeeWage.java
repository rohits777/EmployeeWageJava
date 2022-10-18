package com.bridgelabz;
public class EmployeeWage {

    static final int IS_FULL_TIME=1;
    static final int IS_PART_TIME=2;
    static final int WAGEPERHR=20;
    public static void main(String[] args) {
        System.out.println("*** Welcome to Employee wage computation ***");


        int empHrs=0;
        int empCheck=(int)(Math.random()*3);

        switch(empCheck)
        {
            case IS_FULL_TIME:
                System.out.println("Employee is Present full time");
                empHrs=8;
                break;
            case IS_PART_TIME:
                System.out.println("Employee is Present Part time");
                empHrs=4;
                break;
            default:
                System.out.println("Employee is Absent");
                empHrs=0;
        }

        int wage= WAGEPERHR * empHrs;
        System.out.println("Daily wage of Employee is:" +wage);
    }
}