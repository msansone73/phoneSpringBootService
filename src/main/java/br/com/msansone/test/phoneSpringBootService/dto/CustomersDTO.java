package br.com.msansone.test.phoneSpringBootService.dto;

import br.com.msansone.test.phoneSpringBootService.dao.Customer;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Component
public class CustomersDTO {

    private Iterable<Customer> customers;

    public  List<CustomerDTO> listaDTOs(Iterable<Customer> customers){

        return StreamSupport.stream(customers.spliterator(), false)
                .map(c-> new CustomerDTO(c))
                .collect(Collectors.toList());
    }

    public  List<CustomerDTO> listaDTOsByCountry(Iterable<Customer> customers, String country){

        return StreamSupport.stream(customers.spliterator(), false)
                .map(c-> new CustomerDTO(c))
                .filter(c -> c.getCountry().equals(country))
                .collect(Collectors.toList());
    }

}
