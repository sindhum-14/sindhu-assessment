package com.example.service.springbootrewards.rewards;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.service.springbootrewards.model.MyTransaction;

@SpringBootTest
public class RewardsServiceTest {

	@MockBean
	private CustomerRepository mockCustomerRepository;
	
	@Autowired
	private RewardsServiceMock rewardsService;
	
	
	@Test
	public void testGetCustomerAll() {
		List<MyTransaction> myTransactionList= rewardsService.getAll();
		assertNotNull(myTransactionList);
	}

	@Test
	public void testGetCustomerById() {
		MyTransaction myTransaction = rewardsService.getAll().get(0);
		assertNotNull(myTransaction);
	}

}
