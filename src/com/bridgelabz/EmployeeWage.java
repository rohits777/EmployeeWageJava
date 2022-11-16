package com.bridgelabz;
public class EmployeeWage {

    public static final int IS_FULL_TIME = 1, IS_PART_TIME = 2;
      private final String company;
      private final int wagePerHr;
      private final int workingDays;
      private final int maxHrsPerMonth;
      private int monthlyWage;
    public  EmployeeWage(String company,int wagePerHr,int maxHrsPerMonth,int workingDays) {
        this.company = company;
        this.wagePerHr = wagePerHr;
        this.workingDays = workingDays;
        this.maxHrsPerMonth = maxHrsPerMonth;


    }
    private int computeWage(){
        //variables
            int totalEmpHrs = 0;
            int empHrs = 0, totalWorkingDays = 0;
        //Computation
        while (totalEmpHrs <= maxHrsPerMonth && totalWorkingDays < workingDays) {
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
      return totalEmpHrs * wagePerHr;
      //  return "Total employee wage of: "+company+" is:" + monthlywage;

    }
    public static void main(String[] args) {

        System.out.println("*** Welcome to Employee wage computation ***");
        System.out.println("------------------------------------------------------------");
                EmployeeWage deldivery = new EmployeeWage("Delhivery",20, 90,19);
                EmployeeWage kings= new EmployeeWage("KingsLanding",20,100, 20);
                EmployeeWage mumbaiindians= new EmployeeWage("MumbaiIndians", 20,95,17);

        System.out.println("Total employee wage for company" +deldivery.company+ " is:-" +deldivery.computeWage());
        System.out.println("Total employee wage for company" +kings.company+ " is:-" +kings.computeWage());
        System.out.println("Total employee wage for company" +mumbaiindians.company+ "is:- " +mumbaiindians.computeWage());

    }

    }
