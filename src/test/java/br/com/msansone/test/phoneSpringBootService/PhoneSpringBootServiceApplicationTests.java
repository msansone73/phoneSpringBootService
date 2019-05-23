package br.com.msansone.test.phoneSpringBootService;

import br.com.msansone.test.phoneSpringBootService.dao.Customer;
import br.com.msansone.test.phoneSpringBootService.dto.CustomerDTO;
import br.com.msansone.test.phoneSpringBootService.repository.CustomerRepository;
import br.com.msansone.test.phoneSpringBootService.service.CustomerService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PhoneSpringBootServiceApplicationTests {

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	CustomerService customerService;

	@Test
	public void contextLoads() {
	}

	@Test
	public void dataBaseDataTestSucess(){
		Customer customer = customerRepository.findById((long) 1).get();
		Assert.assertEquals(customer.getName(),"Yosaf Karrouch");
	}

	@Test
	public void validateCountryTestSuccess(){

		List<CustomerDTO> customers = customerService.ListAllCustumer();
		CustomerDTO customer =customers.get(4);
		Assert.assertEquals(customer.getCountry(),"Morocco");

	}
}
