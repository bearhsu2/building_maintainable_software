package idv.kuma.chap03.refactored;

public abstract class Employee {

    protected void sendEmail(double salary, String address) {
        EmailSender sender = new EmailSender();
        System.out.println("sending email...");
        sender.send(salary, address);
        System.out.println("Done.");
    }
}
