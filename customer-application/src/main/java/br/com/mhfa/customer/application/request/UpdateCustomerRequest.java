package br.com.mhfa.customer.application.request;

public class UpdateCustomerRequest {

    private String name;

    public UpdateCustomerRequest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
