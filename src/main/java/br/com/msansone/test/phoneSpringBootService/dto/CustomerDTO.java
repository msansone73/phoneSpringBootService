package br.com.msansone.test.phoneSpringBootService.dto;

import br.com.msansone.test.phoneSpringBootService.business.CountryBusiness;
import br.com.msansone.test.phoneSpringBootService.dao.Customer;

public class CustomerDTO extends Customer {


    private String country;

    public CustomerDTO(Customer customer) {
        this.internalSettings(customer);
    }

    public String getCountry() {

        CountryBusiness countryBusiness = new CountryBusiness();
        return countryBusiness.findCountry(this.getPhone());
    }

    private void internalSettings(Customer customer) {
        this.setId(customer.getId());
        this.setName(customer.getName());
        this.setPhone(customer.getPhone());
    }

}
