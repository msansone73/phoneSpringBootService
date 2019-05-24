package br.com.msansone.test.phoneSpringBootService.dto;

import br.com.msansone.test.phoneSpringBootService.dao.Customer;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Component
public class CustomerDTOUtil {

    private Iterable<Customer> customers;

    public  List<CustomerDTO> listDTOs(Iterable<Customer> customers){

        return StreamSupport.stream(customers.spliterator(), false)
                .map(c-> new CustomerDTO(c))
                .collect(Collectors.toList());
    }

    public  List<CustomerDTO> listDTOsByCountry(Iterable<Customer> customers, String country){

        return StreamSupport.stream(customers.spliterator(), false)
                .map(c-> new CustomerDTO(c))
                .filter(c -> c.getCountry().toUpperCase().contains(country.toUpperCase()))
                .collect(Collectors.toList());
    }

    public  List<CustomerDTO> listDTOsByPhone(Iterable<Customer> customers, String phone){

        return StreamSupport.stream(customers.spliterator(), false)
                .map(c-> new CustomerDTO(c))
                .filter(c -> c.getPhone().toUpperCase().contains(phone.toUpperCase()))
                .collect(Collectors.toList());
    }

    public  List<CustomerDTO> listDTOsByName(Iterable<Customer> customers, String name){

        return StreamSupport.stream(customers.spliterator(), false)
                .map(c-> new CustomerDTO(c))
                .filter(c -> c.getName().toUpperCase().contains(name.toUpperCase()))
                .collect(Collectors.toList());
    }

    public  List<CustomerDTO> listDTOsByValidate(Iterable<Customer> customers, boolean validate){

        return StreamSupport.stream(customers.spliterator(), false)
                .map(c-> new CustomerDTO(c))
                .filter(c -> validate ?
                        c.getCountry().equals(""):
                        c.getCountry().length()>0)
                .collect(Collectors.toList());
    }



}
