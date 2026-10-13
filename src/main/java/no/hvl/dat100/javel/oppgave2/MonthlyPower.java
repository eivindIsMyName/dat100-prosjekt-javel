package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DailyPower;

public class MonthlyPower {

    // a) print power usage for a month
    public static void print_PowerUsage(double[][] usage) {

        // TODO
        for (int i = 0; i < usage.length; i++){
            int dayCount = i+1;
            System.out.print("Day " + dayCount + ": ");
            for (int j = 0; j < usage[i].length; j++){
                System.out.print(usage[i][j] + " kWh ");
            }
            System.out.println();
        }
    }

    // b) print power prices for a month
    public static void print_PowerPrices(double[][] prices) {

        // TODO
        for (int i = 0; i < prices.length; i++){
            int dayCount = i+1;
            System.out.print("Day " + dayCount + ": ");
            for (int j = 0; j < prices[i].length; j++){
                System.out.print(prices[i][j] + " Kr ");
            }
            System.out.println();
        }

    }

    // c) compute total power usage for a month
    public static double computePowerUsage(double[][] usage) {

        double sum = 0;

        // TODO
        for (double[] doubles : usage) {
            for (double aDouble : doubles) {
                sum += aDouble;
            }
        }

        return sum;
    }

    // d) determine whether a given threshold in powerusage for the month has been exceeded
    public static boolean exceedThreshold(double[][] powerusage, double threshold) {

        boolean exceeded = false;
        double usage = 0;

        // TODO
        int i = 0;
        int j = 0;

        while (true) {

            if (usage > threshold){
                exceeded = true;
                break;
            }

            if (j < powerusage[i].length) {
                usage += powerusage[i][j];
                j++;
            }else{
                j = 0;
                i++;
                if(i == powerusage.length){
                    break;
                }
            }
        }
        return exceeded;
    }

    // e) compute spot price
    public static double computeSpotPrice(double[][] usage, double[][] prices) {

        double price = 0;

        // TODO
        for (int i = 0; i < prices.length; i++){
            for (int j = 0; j < prices[i].length; j++){
                price += (usage[i][j] * prices[i][j]);
            }
        }

        return price;
    }

    // f) power support for the month
    public static double computePowerSupport(double[][] usage, double[][] prices) {

        double support = 0;

        // TODO
        for (int i = 0; i < usage.length; i++){
            support += DailyPower.computePowerSupport(usage[i], prices[i]);
        }

        return support;
    }

    // g) Norgesprice for the month
    public static double computeNorgesPrice(double[][] usage) {

        double price = 0;

        // TODO
        for (double[] days: usage){
            price += DailyPower.computeNorgesPrice(days);
        }

        return price;
    }
}
