package br.com.msansone.test.phoneSpringBootService.repository;

import br.com.msansone.test.phoneSpringBootService.dao.Customer;
import org.springframework.data.repository.CrudRepository;


public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
