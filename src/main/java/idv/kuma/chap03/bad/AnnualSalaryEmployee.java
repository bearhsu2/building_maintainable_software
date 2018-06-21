package idv.kuma.chap03.bad;

public class AnnualSalaryEmployee {

    double annualSalary;
    int months;
    String address;

    public AnnualSalaryEmployee(double annualSalary, int months, String address) {
        this.annualSalary = annualSalary;
        this.months = months;
        this.address = address;
    }

    public void calculateAndSend(){

        double salary = annualSalary / 12 * months;

        EmailSender sender = new EmailSender();
        System.out.println("sending email...");
        sender.send(salary, address);
        System.out.println("Done.");


    }

}
