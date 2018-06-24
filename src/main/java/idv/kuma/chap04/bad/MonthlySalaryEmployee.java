package idv.kuma.chap04.bad;

public class MonthlySalaryEmployee {

    double monthlySalary;
    int months;
    String address;

    public MonthlySalaryEmployee(double monthlySalary, int months, String address) {
        this.monthlySalary = monthlySalary;
        this.months = months;
        this.address = address;
    }

    public void calculateAndSend(){

        double salary = monthlySalary * months;

        EmailSender sender = new EmailSender();
        System.out.println("sending email...");
        sender.send(salary, address);
        System.out.println("Done.");

    }
}
