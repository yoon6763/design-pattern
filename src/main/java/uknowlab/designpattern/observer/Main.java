package uknowlab.designpattern.observer;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        Customer customer = new Customer(company);

        customer.sendMail("안녕하세요");
    }
}
