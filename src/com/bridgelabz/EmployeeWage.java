package com.bridgelabz;
public class EmployeeWage {

    static final int IS_FULL_TIME = 1, IS_PART_TIME = 2, WAGEPERHR = 20, WORKINGDAYS = 20;
    static final int MAX_HRS_IN_MONTH = 100;

    public void computeWage(String company,int wagePerHr,int maxHrsPerMonth,int workingDays)
    {

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
            System.out.println("Day:" + totalWorkingDays + " Employee present Hrs " + empHrs);
        }
        monthlywage = totalEmpHrs * WAGEPERHR;
        System.out.println("Total employee wage of: "+company+ "is:" + monthlywage);
    }

    public static void main(String[] args) {

        System.out.println("*** Welcome to Employee wage computation ***");
                EmployeeWage emp = new EmployeeWage();
                emp.computeWage("Delhivery",20, 90,19);
                emp.computeWage("KingsLanding",20,100, 20 );
                emp.computeWage("MumbaiIndians", 20,95,17);


        }

    }
