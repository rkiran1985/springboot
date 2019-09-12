package com.example.cts.cg.SpringBootFirstApplicationDataBase;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl {
	@Autowired
	IProductRepo irepo;
	
	public List<Product> showAll(){
		return irepo.findAll();
	}

}
