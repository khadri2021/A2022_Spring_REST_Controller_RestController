package com.khadri.spring.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.khadri.spring.rest.entity.Order;

@Controller
@RequestMapping("order")
public class TestController {

	@GetMapping(value = "/find")
	public @ResponseBody Order getOrder() {
		Order order = new Order();
		order.setId(100);
		order.setName("VADA");
		return order;
	}
}
