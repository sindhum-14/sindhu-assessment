package com.example.service.springbootrewards.rewards;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.service.springbootrewards.model.Customer;

public class RewardsControllerTest {

	@MockBean
	private RewardsService rewardsServiceMock;
	
	@Test
	public void testFindCustomerAll() {
		 List<Customer> customerList = rewardsServiceMock.getCustomerAll();
		 assertNotNull(customerList);
	}

	@Test
	public void testGetCustomer() {
		Customer customer = rewardsServiceMock.getCustomerById(1);
		assertNotNull(customer);
	}

}
