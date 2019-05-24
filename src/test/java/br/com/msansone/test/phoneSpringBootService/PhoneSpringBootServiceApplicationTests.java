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
		Assert.assertEquals("Yosaf Karrouch",customer.getName());
	}

	@Test
	public void validateCountryTestSuccess(){

		List<CustomerDTO> customers = customerService.ListAllCustomer();
		CustomerDTO customer =customers.get(4);
		Assert.assertEquals("Morocco", customer.getCountry());
	}

	@Test
	public void validateNameTestSucess(){
		List<CustomerDTO> customers= customerService.ListCustomerByName("Ogwal");
		CustomerDTO customerDTO = customers.get(0);
		Assert.assertEquals("Ogwal David",customerDTO.getName());
	}

	@Test
	public void validatePhoneTestSucess(){
		List<CustomerDTO> customers= customerService.ListCustomerByPhone("(256) 714660221");
		CustomerDTO customerDTO = customers.get(0);
		Assert.assertEquals("Daniel Makori",customerDTO.getName());
		Assert.assertEquals("(256) 714660221",customerDTO.getPhone());
		Assert.assertEquals("Uganda",customerDTO.getCountry());
	}

	@Test
	public void validateCountryTestSucess(){
		List<CustomerDTO> customers= customerService.ListAllCustomerByCountry("Uganda");
		CustomerDTO customerDTO = customers.get(2);
		Assert.assertEquals(3,customers.size());
		Assert.assertEquals("Daniel Makori",customerDTO.getName());
		Assert.assertEquals("(256) 714660221",customerDTO.getPhone());
		Assert.assertEquals("Uganda",customerDTO.getCountry());
	}
}
