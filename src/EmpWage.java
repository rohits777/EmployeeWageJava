class EmpWage {
    public static final int IS_FULL_TIME=1,IS_PART_TIME=2,WAGE_PER_HR=20,WORKING_DAYS=20;
    public static void main(String[] args) {
        System.out.println("***Welcome to employee wage computation Program***");
        int workingHrs=0,dailyWage,monthlyWage=0;
        for(int day=1;day<=WORKING_DAYS;day++)
        {
            int random=(int)Math.floor(Math.random()*10)%3;

            switch(random)
            {
                case IS_FULL_TIME:
                    System.out.println("Employee Is Present full time ");
                    workingHrs=8;
                    break;

                case IS_PART_TIME:
                    System.out.println("Employee Is present  part time .");
                    workingHrs=4;
                    break;

                default:
                    System.out.println("Employee Is Absent ");
            }

            dailyWage = WAGE_PER_HR*workingHrs;
            monthlyWage = dailyWage * WORKING_DAYS;
        }
        System.out.println(" Monthly wage of Employee is " +monthlyWage);

    }
}