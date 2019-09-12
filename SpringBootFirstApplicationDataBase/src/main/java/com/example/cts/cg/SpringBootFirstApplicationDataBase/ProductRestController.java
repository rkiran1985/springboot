package com.example.cts.cg.SpringBootFirstApplicationDataBase;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductRestController {
	@Autowired
	ProductServiceImpl service;
	@RequestMapping(value="/all",method=RequestMethod.GET)
	public List<Product> showAll(){
		System.out.println("in controller");
		return service.showAll();
		
	}

}
