package com.projetoentra21.AppFii.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DashboardController {
	
	@RequestMapping("/dashboard_inicial")
	public String dashboard_inicial()
	{
		return "dashboard_inicial";
	}

}
