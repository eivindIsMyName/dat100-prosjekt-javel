package no.hvl.dat100.javel.oppgave1;

public class DailyPower {

    // a) print power prices during a day
    public static void printPowerPrices(double[] prices) {

        // TODO
        for (double price: prices){
            System.out.printf("%.2f NOK", price);
        }
        System.out.println();
    }

    // b) print power usage during a day
    public static void printPowerUsage(double[] usage) {

        // TODO
        for (double power: usage){
            System.out.printf("%.2f kWh", power);
        }
        System.out.println();
    }

    // c) compute power usage for a single day
    public static double computePowerUsage(double[] usage) {

        double sum = 0;

        // TODO
        for (double use: usage){
            sum += use;
        }

        return sum;
    }

    // d) compute spot price for a single day
    public static double computeSpotPrice(double[] usage, double[] prices) {

        double price = 0;

        // TODO
        for (int i = 0; i < usage.length; i++){
            price += (usage[i] * prices[i]);
        }

        return Math.floor(price);
    }

    // e) compute power support for a given usage and price
    private static final double THRESHOLD = 0.9375;
    private static final double PERCENTAGE = 0.9;

    public static double getSupport(double usage, double price) {

        double support = 0;
        // TODO
        if (price > THRESHOLD){
            support = usage * PERCENTAGE;
        }

        return support;
    }

    // f) compute power support for a single day
    public static double computePowerSupport(double[] usage, double[] prices) {

        double support = 0;

        for (int i = 0; i < usage.length; i++){
            support += getSupport(usage[i], prices[i]);
        }

        return support;
    }

    private static final double NORGESPRIS_KWH = 0.5;

    // g) compute norges pris for a single day
    public static double computeNorgesPrice(double[] usage) {

        double price = 0;

        // TODO
        for (double power: usage){
            price += (NORGESPRIS_KWH * power);
        }

        return price;
    }

    // g) compute peak usage during a single day
    public static double findPeakUsage(double[] usage) {

        double temp_max = usage[0];

        for (int i = 1; i < usage.length; i++){
            if (temp_max < usage[i]){
                temp_max = usage[i];
            }
        }

        return temp_max;
    }

    public static double findAvgPower(double[] usage) {

        double average = 0;

        for (double power : usage){
            average += power;
        }

        return Math.floor(average) / usage.length;
    }
}