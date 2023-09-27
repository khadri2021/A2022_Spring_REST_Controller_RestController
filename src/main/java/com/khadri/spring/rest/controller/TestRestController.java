package com.khadri.spring.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.khadri.spring.rest.entity.Order;

@RestController
@RequestMapping("rest/order")
public class TestRestController {

	@GetMapping(value="/find")
	public Order getOrder() {
		Order order = new Order();
		order.setId(100);
		order.setName("Idly");
		return order;
	}

}
