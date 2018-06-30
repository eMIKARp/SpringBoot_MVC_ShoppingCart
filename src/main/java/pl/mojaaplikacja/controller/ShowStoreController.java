package pl.mojaaplikacja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShowStoreController {

	@GetMapping("/")
	public String showStore() {
		return "index";
	}
}
