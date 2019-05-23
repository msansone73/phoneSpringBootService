package br.com.msansone.test.phoneSpringBootService.service;

import br.com.msansone.test.phoneSpringBootService.dao.Customer;
import br.com.msansone.test.phoneSpringBootService.dto.CustomerDTO;
import br.com.msansone.test.phoneSpringBootService.dto.CustomersDTO;
import br.com.msansone.test.phoneSpringBootService.exceptions.CustomerException;
import br.com.msansone.test.phoneSpringBootService.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CustomersDTO customersDTO;


    @Override
    public List<CustomerDTO> ListAllCustomer() throws CustomerException{

        try{
            Iterable<Customer> saida=customerRepository.findAll();
            return customersDTO.listaDTOs(saida);

        } catch (Exception ex){
            throw new CustomerException();
        }
    }

    @Override
    public List<CustomerDTO> ListAllCustomerByCountry(String country) throws CustomerException {
        try{
            Iterable<Customer> saida=customerRepository.findAll();
            return customersDTO.listaDTOsByCountry(saida,country);

        } catch (Exception ex){
            throw new CustomerException();
        }
    }
}
