package idv.kuma.chap03.refactored;

public class AnnualSalaryEmployee extends Employee{

    double annualSalary;
    int months;
    String address;

    public AnnualSalaryEmployee(double annualSalary, int months, String address) {
        this.annualSalary = annualSalary;
        this.months = months;
        this.address = address;
    }

    public void calculateAndSend(){
        sendEmail(annualSalary / 12 * months, address);
    }



}
