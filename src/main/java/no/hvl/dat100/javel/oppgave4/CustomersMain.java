package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave1.DailyPower;
import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

public class CustomersMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 4");
        System.out.println("==============");
        System.out.println();

        System.out.println("===== A) =====");
        Customers customers = new Customers(7);
        System.out.printf("Expected size is 7. %nCurrent size is: %s %n", customers.length);
        System.out.println("==============");

        System.out.println("===== D) =====");
        boolean added_customer = customers.addCustomer(
                new Customer(
                        "Alice Smith",
                        "alice@example.com",
                        1001,
                        PowerAgreementType.SPOTPRICE));
        customers.addCustomer(
                new Customer(
                        "Bob Johnson",
                        "bob@example.com",
                        1002,
                        PowerAgreementType.NORGESPRICE));
        customers.addCustomer(
                new Customer(
                        "Charlie Rose",
                        "charlie@example.com",
                        1003,
                        PowerAgreementType.POWERSUPPORT));
        customers.addCustomer(
                new Customer(
                        "Diana Prince",
                        "diana@example.com",
                        1004,
                        PowerAgreementType.NORGESPRICE));customers.addCustomer(
                new Customer(
                        "Ethan Hunt",
                        "ethan@example.com",
                        1005,
                        PowerAgreementType.POWERSUPPORT));
        System.out.printf("Expected result is true. %nCurrent result is: %s %n", added_customer);
        System.out.println("==============");

        System.out.println("===== B) =====");
        int count = customers.countNonNull();
        System.out.printf("Expected count is 5. %nCurrent size is: %s %n", count);
        System.out.println("==============");

        System.out.println("===== C) =====");
        Customer cc = customers.getCustomer(1005);
        System.out.printf("Expected customer is Ethan Hunt. %nCustomer is: %s %n", cc.getName());
        System.out.println("==============");

        System.out.println("===== E) =====");
        Customer ce = customers.removeCustomer(1003);
        System.out.printf("Expected customer to be deleted Charlie Rose. %nCustomer deleted is: %s and Count is: %s %n", ce.getName(), customers.countNonNull());
        System.out.println("==============");

        System.out.println("===== F) =====");
        Customer[] customers_f = customers.getCustomers();
        System.out.printf("Expected customers: Alice Smith, Bob Johnson, Diana Prince and Ethan Hunt %nCustomers found: ");
        for (Customer customer_f : customers_f){
            if (customer_f == null) continue;
            System.out.printf("%s, ", customer_f.getName());
        }
        System.out.println();
        System.out.println("==============");
    }
}
