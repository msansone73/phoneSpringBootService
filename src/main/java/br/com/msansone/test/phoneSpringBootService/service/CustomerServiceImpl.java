package br.com.msansone.test.phoneSpringBootService.service;

import br.com.msansone.test.phoneSpringBootService.dao.Customer;
import br.com.msansone.test.phoneSpringBootService.dto.CustomerDTO;
import br.com.msansone.test.phoneSpringBootService.dto.CustomerDTOUtil;
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
    CustomerDTOUtil customersDTO;


    @Override
    public List<CustomerDTO> ListAllCustomer() throws CustomerException{

        try{
            Iterable<Customer> saida=customerRepository.findAll();
            return customersDTO.listDTOs(saida);

        } catch (Exception ex){
            throw new CustomerException();
        }
    }

    @Override
    public List<CustomerDTO> ListAllCustomerByCountry(String country) throws CustomerException {
        try{
            Iterable<Customer> saida=customerRepository.findAll();
            return customersDTO.listDTOsByCountry(saida,country);

        } catch (Exception ex){
            throw new CustomerException();
        }
    }

    @Override
    public List<CustomerDTO> ListCustomerByName(String name) throws CustomerException {
        try{
            Iterable<Customer> saida=customerRepository.findAll();
            return customersDTO.listDTOsByName(saida,name);

        } catch (Exception ex){
            throw new CustomerException();
        }
    }

    @Override
    public List<CustomerDTO> ListCustomerByPhone(String phone) throws CustomerException {
        try{
            Iterable<Customer> saida=customerRepository.findAll();
            return customersDTO.listDTOsByPhone(saida,phone);

        } catch (Exception ex){
            throw new CustomerException();
        }
    }

    @Override
    public List<CustomerDTO> ListCustomerByValid(Boolean valid) throws CustomerException {
        try{
            Iterable<Customer> saida=customerRepository.findAll();
            return customersDTO.listDTOsByValidate(saida,valid);

        } catch (Exception ex){
            throw new CustomerException();
        }
    }
}
