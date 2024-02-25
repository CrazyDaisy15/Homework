public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    public double salaryPerMonth;

    public Employee(int id, String firstName, String lastName, double salaryPerMonth) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salaryPerMonth = salaryPerMonth;
    }

    public static String getName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }
    public static double getAnnualSalary(double salaryPerMonth) {
        return salaryPerMonth * 12;
    }
    public double raiseSalary(double salaryPerMonth, double percentage) {
        double raiseAmount = salaryPerMonth * percentage / 100;
        this.salaryPerMonth += raiseAmount;
        return this.salaryPerMonth;
    }
    @Override
    public String toString() {
        return "Employee ID: " + id + "\n" + "Name: " + getName(this.firstName, this.lastName) + "\n" +
                "Salary per month: " + salaryPerMonth + "\n" + "Annual salary: " + getAnnualSalary(this.salaryPerMonth);
    }
    }
