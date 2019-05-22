package br.com.msansone.test.phoneSpringBootService.service;

import br.com.msansone.test.phoneSpringBootService.dao.Customer;
import br.com.msansone.test.phoneSpringBootService.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Iterable<Customer> ListAllCustumer() {
        Iterable<Customer> saida=customerRepository.findAll();
        return saida;
    }
}
