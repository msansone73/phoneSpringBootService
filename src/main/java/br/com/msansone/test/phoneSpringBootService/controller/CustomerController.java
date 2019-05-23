package br.com.msansone.test.phoneSpringBootService.controller;

import br.com.msansone.test.phoneSpringBootService.dto.CustomerDTO;
import br.com.msansone.test.phoneSpringBootService.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Phones")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @CrossOrigin
    @GetMapping("/")
    public List<CustomerDTO> getAllCustomer(){
        return  customerService.ListAllCustomer();
    }
    
    @CrossOrigin
    @GetMapping("/country/{country}")
    public List<CustomerDTO> getAllCustomerByCountry(@PathVariable String country){
        return  customerService.ListAllCustomerByCountry(country);
    }

}
