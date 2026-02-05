package day10.practice;

public class EmployeeWageSystem {
    // Constants
    public static final int FULL_TIME_EMPLOYEE = 1;
    public static final int PART_TIME_EMPLOYEE = 2;

    // =============================
    // Inner Class: EmpWageBuilder
    // =============================
    static class EmpWageBuilder {

        private String companyName;
        private int wagePerHour;
        private int maxWorkingDays;
        private int maxWorkingHours;
        private int totalWage;

        public EmpWageBuilder(String companyName, int wagePerHour,
                              int maxWorkingDays, int maxWorkingHours) {
            this.companyName = companyName;
            this.wagePerHour = wagePerHour;
            this.maxWorkingDays = maxWorkingDays;
            this.maxWorkingHours = maxWorkingHours;
        }

        public String getCompanyName() {
            return companyName;
        }

        public int getTotalWage() {
            return totalWage;
        }

        // UC1 – Check employee attendance
        public int isEmployeePresent() {
            return (int) (Math.random() * 3);
        }

        // UC2 – Calculate wage
        public int calculateWage(int workingHours) {
            return workingHours * wagePerHour;
        }

        // UC3–UC7 – Monthly wage with conditions
        public void calculateEmployeeWage() {

            int totalHours = 0;
            int totalDays = 0;

            while (totalDays < maxWorkingDays && totalHours < maxWorkingHours) {
                totalDays++;
                int empType = isEmployeePresent();
                int dailyHours = 0;

                switch (empType) {
                    case FULL_TIME_EMPLOYEE:
                        dailyHours = 8;
                        break;
                    case PART_TIME_EMPLOYEE:
                        dailyHours = 4;
                        break;
                    default:
                        dailyHours = 0;
                }

                totalHours += dailyHours;
            }
            totalWage = calculateWage(totalHours);
        }
    }

    // =============================
    // UC8 – Multiple companies
    // =============================
    static void calculateEmployeeWage(String companyName,
                                      int wagePerHour,
                                      int maxWorkingDays,
                                      int maxWorkingHours) {

        int totalWorkingHours = 0;
        int totalWorkingDays = 0;

        while (totalWorkingHours < maxWorkingHours &&
                totalWorkingDays < maxWorkingDays) {

            totalWorkingDays++;
            int empType = (int) (Math.random() * 3);
            int dailyHours = 0;

            if (empType == FULL_TIME_EMPLOYEE)
                dailyHours = 8;
            else if (empType == PART_TIME_EMPLOYEE)
                dailyHours = 4;

            totalWorkingHours += dailyHours;
        }

        int totalWage = totalWorkingHours * wagePerHour;
        System.out.println("Monthly Wage of " + companyName + " : " + totalWage);
    }

    // =============================
    // MAIN METHOD
    // =============================
    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        // UC10 – Using Builder Class
        EmpWageBuilder tcs = new EmpWageBuilder("TCS", 20, 20, 100);
        EmpWageBuilder zoho = new EmpWageBuilder("Zoho", 30, 22, 110);

        tcs.calculateEmployeeWage();
        zoho.calculateEmployeeWage();

        System.out.println("Total Wage of " + tcs.getCompanyName()
                + " : " + tcs.getTotalWage());

        System.out.println("Total Wage of " + zoho.getCompanyName()
                + " : " + zoho.getTotalWage());

        System.out.println("\n---- UC8 : Multiple Companies ----");
        calculateEmployeeWage("Infosys", 25, 20, 100);
        calculateEmployeeWage("Wipro", 22, 18, 90);
    }
}
