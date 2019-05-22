package br.com.msansone.test.phoneSpringBootService.dto;

import br.com.msansone.test.phoneSpringBootService.dao.Customer;
import br.com.msansone.test.phoneSpringBootService.enums.PhoneType;

public class CustomerDTO extends Customer {

    private String country;

    public CustomerDTO(Customer customer) {
        this.setId(customer.getId());
        this.setName(customer.getName());
        this.setPhone(customer.getPhone());
    }

    public String getCountry() {
        return this.findCountry(this.getPhone());
    }

    private String findCountry(String phone) {
        if (phone.matches(PhoneType.Cameroon.toString())) {return PhoneType.Cameroon.name();}
        if (phone.matches(PhoneType.Ethiopia.toString())) {return PhoneType.Ethiopia.name();}
        if (phone.matches(PhoneType.Morocco.toString())) {return PhoneType.Morocco.name();}
        if (phone.matches(PhoneType.Mozambique.toString())) {return PhoneType.Mozambique.name();}
        if (phone.matches(PhoneType.Uganda.toString())) {return PhoneType.Uganda.name();}
        return "";
    }

}
