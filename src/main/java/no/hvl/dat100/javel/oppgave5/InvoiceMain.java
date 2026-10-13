package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave1.DailyPower;
import no.hvl.dat100.javel.oppgave2.MonthlyPower;
import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;
import no.hvl.dat100.javel.oppgave2.MonthPowerData;
import no.hvl.dat100.javel.oppgave4.Customers;

public class InvoiceMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 5");
        System.out.println("==============");
        System.out.println();

        Customers customers = new Customers(3);
        customers.addCustomer(
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

        System.out.println("===== A) =====");
        Invoice invoice_a = new Invoice(
                customers.getCustomer(1001),
                "March",
                CustomerPowerUsageData.usage_month_customer1,
                MonthPowerData.powerprices_month);
        System.out.printf("Success %n");
        System.out.println("==============");
        System.out.println();

        Invoice invoice_b = new Invoice(
                customers.getCustomer(1002),
                "March",
                CustomerPowerUsageData.usage_month_customer2,
                MonthPowerData.powerprices_month);

        Invoice invoice_c = new Invoice(
                customers.getCustomer(1003),
                "March",
                CustomerPowerUsageData.usage_month_customer3,
                MonthPowerData.powerprices_month);

        System.out.println("===== B) =====");
        invoice_a.computeAmount();
        invoice_b.computeAmount();
        invoice_c.computeAmount();
        System.out.printf("Success %n");
        System.out.println("==============");
        System.out.println();

        System.out.println("===== C) =====");
        invoice_a.printInvoice();
        System.out.println("==============");
        System.out.println();

        System.out.println("===== D) =====");
        Invoice[] invoices = new Invoice[3];
        invoices[0] = invoice_a;
        invoices[1] = invoice_b;
        invoices[2] = invoice_c;
        Invoices.processInvoices(invoices);
        System.out.println("==============");
    }
}
