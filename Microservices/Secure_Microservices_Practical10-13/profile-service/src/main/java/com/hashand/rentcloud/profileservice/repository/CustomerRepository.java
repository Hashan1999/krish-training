package com.hashand.rentcloud.profileservice.repository;

import com.hashan.rentacloud.commons.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
