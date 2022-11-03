package com.bridgelabz;
public class EmployeeWage {

    static final int IS_FULL_TIME = 1, IS_PART_TIME = 2, WAGEPERHR = 20, WORKINGDAYS = 20;
    static final int MAX_HRS_IN_MONTH = 100;

    public void computeWage() {
        System.out.println("*** Welcome to Employee wage computation ***");
        //variables
        int monthlywage = 0, totalEmpHrs = 0;
        int empHrs = 0, totalWorkingDays = 0;

        //Computation
        while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < WORKINGDAYS) {
            totalWorkingDays++;
            int empCheck = (int) (Math.random() * 3);

            switch (empCheck) {
                case IS_FULL_TIME:
                    // System.out.println("Employee is Present full time");
                    empHrs = 8;
                    break;
                case IS_PART_TIME:
                    //System.out.println("Employee is Present Part time");
                    empHrs = 4;
                    break;
                default:
                    //System.out.println("Employee is Absent");
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day:" + totalWorkingDays + " Employee Hrs " + empHrs);
        }
        monthlywage = totalEmpHrs * WAGEPERHR;
        System.out.println("Total employee wage is: " + monthlywage);
    }

    public static void main(String[] args) {
                EmployeeWage emp = new EmployeeWage();
                emp.computeWage();


        }

    }
