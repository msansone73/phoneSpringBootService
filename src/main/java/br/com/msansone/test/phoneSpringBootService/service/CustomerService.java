package br.com.msansone.test.phoneSpringBootService.service;

import br.com.msansone.test.phoneSpringBootService.dao.Customer;

public interface CustomerService {

    Iterable<Customer> ListAllCustumer();
}
