package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController {

	@RequestMapping(value="/sample")
	public String sample(Model model) {
		model.addAttribute("name", "개트롤 ");
		return "sample2";
	}



}
