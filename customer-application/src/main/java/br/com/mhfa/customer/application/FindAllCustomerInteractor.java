package br.com.mhfa.customer.application;

import br.com.mhfa.customer.application.response.CustomerResponse;
import br.com.mhfa.customer.application.response.PageResponse;
import br.com.mhfa.customer.domain.PageRequest;

public interface FindAllCustomerInteractor {

    PageResponse<CustomerResponse> execute(PageRequest pageRequest);
    
}
