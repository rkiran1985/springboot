package com.cts.polars.cg.LimitsServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class LimitsConfigurationController {

@Autowired LimitsServicesConfiguratnProperties lscp;
@GetMapping("/services")
public LimitsBeanConfiguration getLimits()
{
	//return new LimitsBeanConfiguration(9,99);
	return new LimitsBeanConfiguration(lscp.getMinimum(),lscp.getMinimum());
}
}
