package br.com.msansone.test.phoneSpringBootService.service;

import br.com.msansone.test.phoneSpringBootService.dao.Customer;
import br.com.msansone.test.phoneSpringBootService.dto.CustomerDTO;

import java.util.List;

public interface CustomerService {

    List<CustomerDTO> ListAllCustumer();
}
