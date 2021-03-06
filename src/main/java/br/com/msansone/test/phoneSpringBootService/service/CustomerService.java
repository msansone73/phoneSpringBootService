package br.com.msansone.test.phoneSpringBootService.service;

import br.com.msansone.test.phoneSpringBootService.dto.CustomerDTO;
import br.com.msansone.test.phoneSpringBootService.exceptions.CustomerException;

import java.util.List;

public interface CustomerService {


    List<CustomerDTO> ListAllCustomer() throws CustomerException;
    List<CustomerDTO> ListAllCustomerByCountry(String country) throws CustomerException;
    List<CustomerDTO> ListCustomerByName(String name) throws CustomerException;
    List<CustomerDTO> ListCustomerByPhone(String phone) throws CustomerException;
    List<CustomerDTO> ListCustomerByValid(Boolean valid) throws CustomerException;

}
