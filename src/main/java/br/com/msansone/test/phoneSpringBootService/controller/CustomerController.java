package br.com.msansone.test.phoneSpringBootService.controller;

import br.com.msansone.test.phoneSpringBootService.dto.CustomerDTO;
import br.com.msansone.test.phoneSpringBootService.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/phones")
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

    @CrossOrigin
    @GetMapping("/phone/{phone}")
    public List<CustomerDTO> getAllCustomerByPhone(@PathVariable String phone){
        return  customerService.ListCustomerByPhone(phone);
    }

    @CrossOrigin
    @GetMapping("/name/{name}")
    public List<CustomerDTO> getAllCustomerByName(@PathVariable String name){
        return  customerService.ListCustomerByName(name);
    }

    @CrossOrigin
    @GetMapping("/valid/{valid}")
    public List<CustomerDTO> getAllCustomerByValid(@PathVariable Boolean valid){
        return  customerService.ListCustomerByValid(valid);
    }


}
