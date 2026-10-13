package no.hvl.dat100.javel.oppgave3;

public class Customer {

    private String name;
    private String email;
    private int customer_id;
    private PowerAgreementType agrement;

    public Customer(String name, String email, int customer_id, PowerAgreementType agreement) {

        setName(name);
        setEmail(email);
        setCustomer_id(customer_id);
        setAgrement(agreement);
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public int getCostumerId(){
        return customer_id;
    }

    public void setCustomer_id(int customer_id){
        this.customer_id = customer_id;
    }

    public PowerAgreementType getAgrement(){
        return agrement;
    }

    public void setAgrement(PowerAgreementType agrement){
        this.agrement = agrement;
    }

    public String toString(){
        return String.format("Customer number: %s\nName:  %s\nEmail: %s\nAgreement: %s", customer_id, name, email, agrement);
    }
}
