package br.com.mhfa.customer.application;

import br.com.mhfa.customer.application.request.CreateCustomerRequest;
import br.com.mhfa.customer.application.response.CustomerResponse;

public interface DeleteCustomerInteractor {

    void execute(String id);
    
}
