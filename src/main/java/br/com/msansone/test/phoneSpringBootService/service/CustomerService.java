package br.com.msansone.test.phoneSpringBootService.service;

import br.com.msansone.test.phoneSpringBootService.dto.CustomerDTO;
import br.com.msansone.test.phoneSpringBootService.exceptions.CustomerException;

import java.util.List;

public interface CustomerService {


    List<CustomerDTO> ListAllCustumer() throws CustomerException;
}
