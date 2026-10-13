package no.hvl.dat100.javel.oppgave3;

import no.hvl.dat100.javel.oppgave4.Customers;

public class CustomerMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 3");
        System.out.println("==============");
        System.out.println();

        Customer kunde_1 = new Customer("Båb kåre baconost", "baabkaare@yahoo.com", 101, PowerAgreementType.NORGESPRICE);

        System.out.println(kunde_1);
    }
}
