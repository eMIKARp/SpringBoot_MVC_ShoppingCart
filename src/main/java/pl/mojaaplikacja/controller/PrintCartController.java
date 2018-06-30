package pl.mojaaplikacja.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import pl.mojaaplikacja.component.ShoppingCart;

@Controller
public class PrintCartController {

	private ShoppingCart shoppingCart;

	@Autowired
	public PrintCartController(ShoppingCart shoppingCart) {
		this.shoppingCart = shoppingCart;
	}
	
	@GetMapping("/print")
	public String printProduct() {
		for (String product:shoppingCart.getProducts()) {
			System.out.println(product);
		}
		
		return "index";
	}
	
}
