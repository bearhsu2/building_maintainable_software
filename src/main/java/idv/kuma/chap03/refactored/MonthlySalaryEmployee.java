package idv.kuma.chap03.refactored;

public class MonthlySalaryEmployee extends Employee{

    double monthlySalary;
    int months;
    String address;

    public MonthlySalaryEmployee(double monthlySalary, int months, String address) {
        this.monthlySalary = monthlySalary;
        this.months = months;
        this.address = address;
    }

    public void calculateAndSend(){

        sendEmail(monthlySalary * months, address);

    }
}
