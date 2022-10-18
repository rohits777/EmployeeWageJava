package com.bridgelabz;
public class EmployeeWage {

    static final int IS_FULL_TIME = 1, IS_PART_TIME = 2, WAGEPERHR = 20, WORKINGDAYS = 20;

    public static void main(String[] args) {
        System.out.println("*** Welcome to Employee wage computation ***");

        int monthlywage = 0,dailywage;
        int empHrs = 0;
        for (int i = 1; i <= WORKINGDAYS; i++) {
            int empCheck = (int) (Math.random() * 3);

            switch (empCheck) {
                case IS_FULL_TIME:
                    System.out.println("Employee is Present full time");
                    empHrs = 8;
                    break;
                case IS_PART_TIME:
                    System.out.println("Employee is Present Part time");
                    empHrs = 4;
                    break;
                default:
                    System.out.println("Employee is Absent");
                    empHrs = 0;
            }

            dailywage = WAGEPERHR * empHrs;
            monthlywage = dailywage * WORKINGDAYS;
        }

        System.out.println("Monthly wage of Employee is:" +monthlywage);
    }
    }
