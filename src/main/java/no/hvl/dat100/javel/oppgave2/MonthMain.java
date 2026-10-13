package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DayPowerData;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MonthMain {
    public static void main(String[] args) {

        // test data
        double[][] power_prices_month = MonthPowerData.powerprices_month;

        double[][] power_usage_month = MonthPowerData.powerusage_month;

        System.out.println("==============");
        System.out.println("OPPGAVE 2");
        System.out.println("==============");
        System.out.println();

        /*
        TODO

         Write code that tests the methods you implement in the MonthlyPower class
         Remember to teste the methods as you implement them
         Remember to also to check that you get the expected results
         */

        System.out.println("=============== A) Power usage Print ===============");
        MonthlyPower.print_PowerUsage(power_usage_month);
        System.out.println();

        System.out.println("================== B) Power price Print =======================");
        MonthlyPower.print_PowerPrices(power_prices_month);
        System.out.println();

        System.out.println("================== C) Compute power usage =======================");
        System.out.printf("%.2f kWh", MonthlyPower.computePowerUsage(power_usage_month));
        System.out.println();
        System.out.println();

        System.out.println("================== D) Exceed Threshold =======================");
        System.out.println(MonthlyPower.exceedThreshold(power_usage_month, 1000));
        System.out.println(MonthlyPower.exceedThreshold(power_usage_month, 500));
        System.out.println();

        System.out.println("================== E) Compute spot price =======================");
        System.out.printf("%.2f Nok", MonthlyPower.computeSpotPrice(power_usage_month, power_prices_month));
        System.out.println();
        System.out.println();

        System.out.println("================== F) Compute power support =======================");
        System.out.printf("%.2f Nok", MonthlyPower.computePowerSupport(power_usage_month, power_prices_month));
        System.out.println();
        System.out.println();

        System.out.println("================== G) Compute Norgespris =======================");
        System.out.printf("%.2f Nok",MonthlyPower.computeNorgesPrice(power_usage_month));
        System.out.println();
        System.out.println();

    }
}