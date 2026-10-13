package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave2.MonthlyPower;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

import java.util.Arrays;

public class Invoice {

    private Customer c; // customer associated with this invoice
    private String month; // month that the invoice covers
    private double[][] usage; // power usage this month (per day and per hour)
    private double[][] prices; // power prices for this month

    private double amount; // power price for this month


    public Invoice(Customer c, String month, double[][] usage, double[][] power_prices) {
        this.c = c;
        this.month = month;
        this.usage = usage;
        this.prices = power_prices;
        this.amount = 0;
    }

    public void computeAmount() {
        if (c.getAgrement() == PowerAgreementType.NORGESPRICE){
            amount = MonthlyPower.computeNorgesPrice(usage);
        } else if (c.getAgrement() == PowerAgreementType.POWERSUPPORT) {
            amount = MonthlyPower.computePowerSupport(usage, prices);
        } else {
            amount = MonthlyPower.computeSpotPrice(usage, prices);
        }
    }

    public void printInvoice() {
        System.out.printf("Customer number: %s %n",c.getCostumerId());
        System.out.printf("Name: ---------- %s %n", c.getName());
        System.out.printf("Email: --------- %s %n", c.getEmail());
        System.out.printf("Agreement: ----- %s %n",c.getAgrement());
        System.out.println();
        System.out.printf("Month: --------- %s %n", month);
        System.out.printf("Usage: --------- %.2f kWh %n", MonthlyPower.computePowerUsage(usage));
        System.out.printf("Amount: -------- %.2f nok %n", amount);
    }
}
