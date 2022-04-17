package com.profileservice.profile_service.service;



import model.Customer;

import java.util.List;

public interface CustomerService {


    Customer save(Customer customer);

    Customer fetchById(int profileId);

    List<Customer> fetchAllProfiles();
}
