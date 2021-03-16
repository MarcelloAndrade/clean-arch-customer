package br.com.mhfa.customer.application.request;

import br.com.mhfa.customer.domain.Customer;

import java.time.LocalDate;
import java.util.UUID;

public class CreateCustomerRequest {

    private String name;
    //@DateTimeFormat(iso = DateTimeFormat.ISO.DATE, pattern = "dd-MM-yyyy")
    private LocalDate birthDate;
    private String cpf;

    public CreateCustomerRequest(String name, LocalDate birthDate, String cpf) {
        this.name = name;
        this.birthDate = birthDate;
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Customer toDomain() {
        return new Customer(UUID.randomUUID().toString(), this.name, this.birthDate, this.cpf);
    }

}
