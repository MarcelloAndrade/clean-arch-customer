package br.com.mhfa.customer.application;

import br.com.mhfa.customer.application.request.UpdateCustomerRequest;
import br.com.mhfa.customer.application.response.CustomerResponse;

public interface UpdateCustomerInteractor {

    CustomerResponse execute(String id, UpdateCustomerRequest request);
    
}
