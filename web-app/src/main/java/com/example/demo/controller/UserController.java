package com.example.demo.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class UserController {

	@GetMapping("/user/list")
	public String displayList(Model model) {

		model.addAttribute("id", 100);
		model.addAttribute("name", "サンプル太郎");
		model.addAttribute("address", "東京都新宿区1-2-3");
		model.addAttribute("phone", "090-1234-1234");
		model.addAttribute("updateDate", LocalDateTime.now());
		model.addAttribute("createDate", "2024/05/15 12:00:00");

		return "user/list";
	}

	@GetMapping("/user/view/{id}")
	public String displayView(@PathVariable Long id, Model model) {

		model.addAttribute("id", id);
		model.addAttribute("name", "サンプル太郎");
		model.addAttribute("address", "東京都新宿区1-2-3");
		model.addAttribute("phone", "090-1234-1234");
		model.addAttribute("updateDate", LocalDateTime.now());
		model.addAttribute("createDate", "2024/05/15 12:00:00");
		
		return "user/view";
	}
}
