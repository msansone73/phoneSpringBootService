package br.com.msansone.test.phoneSpringBootService.controller;


import br.com.msansone.test.phoneSpringBootService.dao.Customer;
import br.com.msansone.test.phoneSpringBootService.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Phones")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/")
    public Iterable<Customer> getAllCustomer(){
        return  customerService.ListAllCustumer();
    }

}
