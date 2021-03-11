package br.com.mhfa.customer.domain.repository;

import br.com.mhfa.customer.domain.Customer;
import br.com.mhfa.customer.domain.Page;
import br.com.mhfa.customer.domain.PageRequest;

import java.util.Optional;

public interface CustomerRepository {

    Customer create(Customer customer);

    Customer update(Customer customer);

    Optional<Customer> find(String id);

    Page<Customer> find(PageRequest page);

    void delete(Customer customer);
}
