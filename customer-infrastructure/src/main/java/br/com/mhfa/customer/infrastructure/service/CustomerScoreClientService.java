package br.com.mhfa.customer.infrastructure.service;

import br.com.mhfa.customer.domain.service.CustomerScoreService;
import br.com.mhfa.customer.infrastructure.service.client.CustomerScoreClient;
import br.com.mhfa.customer.infrastructure.service.client.request.CustomerScoreRequest;
import br.com.mhfa.customer.infrastructure.service.client.response.CustomerScoreResponse;
import br.com.mhfa.customer.infrastructure.service.client.response.CustomerScoreStatusEnum;

public class CustomerScoreClientService implements CustomerScoreService {

    private CustomerScoreClient customerScoreClient;

    public CustomerScoreClientService(CustomerScoreClient customerScoreClient) {
        this.customerScoreClient = customerScoreClient;
    }

    @Override
    public Boolean isApproved(String cpf) {
        CustomerScoreResponse response = this.customerScoreClient.queryScore(new CustomerScoreRequest(cpf));
        if(response.getStatus() == CustomerScoreStatusEnum.APPROVED) {
            return true;
        } else {
            return false;
        }
    }
}
