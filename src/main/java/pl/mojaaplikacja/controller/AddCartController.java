package pl.mojaaplikacja.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import pl.mojaaplikacja.component.ShoppingCart;

@Controller
public class AddCartController {

	private ShoppingCart shoppingCart;

	@Autowired
	public AddCartController(ShoppingCart shoppingCart) {
		super();
		this.shoppingCart = shoppingCart;
	}
	
	@PostMapping("/add")
	public String addProduct(@RequestParam(name="product") String product) {
		shoppingCart.addProduct(product);
		return "index";
	}
	
}	
	