package no.hvl.dat100.javel.oppgave1;

import no.hvl.dat100.javel.oppgave2.MonthlyPower;

public class DayMain {

    public static void main(String[] args) {

        // test data
        double[] powerusage_day = DayPowerData.powerusage_day;

        double[] powerprices_day = DayPowerData.powerprices_day;

        System.out.println("==============");
        System.out.println("OPPGAVE 1");
        System.out.println("==============");
        System.out.println();

        /*
        TODO

         Write code that tests the methods you implement in the DailyPower class
         Remember to teste the methods as you implement them
         Remember to also to check that you get the expected results
         */

        System.out.println("==========Print power prices=====================");
        DailyPower.printPowerPrices(powerprices_day);
        System.out.println();

        System.out.println("==========Print power usage======================");
        DailyPower.printPowerUsage(powerusage_day);
        System.out.println();

        System.out.println("==========Compute power usage====================");
        System.out.println(DailyPower.computePowerUsage(powerusage_day));
        System.out.println();

        System.out.println("==========Compute spot prices====================");
        System.out.println(DailyPower.computeSpotPrice(powerusage_day, powerprices_day));
        System.out.println();

        System.out.println("========== e) Strømpris med strømstøtte ==========");
        System.out.println(DailyPower.getSupport(powerusage_day[8], powerprices_day[8]));
        System.out.println();

        System.out.println("========== f) Strømpris med strømstøtte (full dag)");
        System.out.printf("%s,- i strøm støtte %n", DailyPower.computePowerSupport(powerusage_day, powerprices_day));
        System.out.println();

        System.out.println("========== g) Norgespris =========================");
        System.out.printf("%s,- i norges pris %n", DailyPower.computeNorgesPrice(powerusage_day));
        System.out.println();

        System.out.println("========== h) Størst strømforbruk ================");
        System.out.printf("Størst strømforbruk er %s kWh %n", DailyPower.findPeakUsage(powerusage_day));
        System.out.println();

        System.out.println("========== i) Gjennomsnitt strømforbruk ==========");
        System.out.printf("Gjennomsnitt strømforbruk er %s kWh %n", DailyPower.findAvgPower(powerusage_day));
        System.out.println();
    }
}
