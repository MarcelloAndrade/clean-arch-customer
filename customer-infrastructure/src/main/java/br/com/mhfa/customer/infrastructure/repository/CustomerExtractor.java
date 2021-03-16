package br.com.mhfa.customer.infrastructure.repository;

import br.com.mhfa.customer.domain.Customer;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

public class CustomerExtractor implements ResultSetExtractor<Set<Customer>> {

    @Override
    public Set<Customer> extractData(ResultSet resultSet) throws SQLException, DataAccessException {
        Set<Customer> customers = new HashSet<>();

        while (resultSet.next()) {
            customers.add(mapCustomer(resultSet));
        }
        return customers;
    }

    private Customer mapCustomer(ResultSet resultSet) throws SQLException {
        return new Customer(
                resultSet.getString("id"),
                resultSet.getString("name"),
                resultSet.getTimestamp("birth_date").toLocalDateTime().toLocalDate(),
                resultSet.getString("cpf")
        );
    }
}
