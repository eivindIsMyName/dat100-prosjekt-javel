package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;

public class Customers {

    private Customer[] Customers;
    public int length;

    // a) Complete constructor
    public Customers(int size) {
        this.Customers = new Customer[size];
        this.length = size;
    }

    // b) count number of non-null references
    public int countNonNull() {
        int count = 0;

        for (Customer customer : Customers){
            if (customer != null){
                count++;
            }
        }

        return count;
    }

    // c) return reference to customer with given id (if exists)
    public Customer getCustomer(int customer_id) {

        boolean funnet = false;
        Customer c = null;

        for (Customer customer : Customers){
            if (customer.getCostumerId() == customer_id){
                c = customer;
                break;
            }
        }

        return c;
    }

    // d) add a customer to the reference table
    public boolean addCustomer(Customer c) {

        boolean inserted = false;

        for (int i = 0; i < Customers.length; i++){
             if (Customers[i] == null){
                 Customers[i] = c;
                 inserted = true;
                 break;
             }
        }

        return inserted;
    }

    // e) remove customer with given id from reference table
    public Customer removeCustomer(int customer_id) {

        boolean deleted = false;
        Customer c = null;

        for (int i = 0; i < Customers.length; i++){
            if (Customers[i].getCostumerId() == customer_id){
                c = Customers[i];
                Customers[i] = null;
                deleted = true;
                break;
            }
        }

        return c;
    }

    // f) return reference table with all customers
    public Customer[] getCustomers() {

        Customer[] customers = null;

        customers = Customers;

        return customers;
    }
}