package br.com.msansone.test.phoneSpringBootService.service;

import br.com.msansone.test.phoneSpringBootService.dao.Customer;
import br.com.msansone.test.phoneSpringBootService.dto.CustomerDTO;
import br.com.msansone.test.phoneSpringBootService.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public List<CustomerDTO> ListAllCustumer() {

        Iterable<Customer> saida=customerRepository.findAll();

        List<CustomerDTO> customers = StreamSupport.stream(saida.spliterator(), false)
                .map(c-> new CustomerDTO(c))
                .collect(Collectors.toList());

        return customers;
    }
}
