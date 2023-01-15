package com.example.offers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.offers.models.Offer;

@RestController
public class OffersController {

	// private static final String template = "Hello, %s!";
	// private final AtomicLong counter = new AtomicLong();

	@GetMapping("/get_offer")
	public Offer getOffer(@RequestParam(name = "salaryPerYear") Integer salary, @RequestParam Integer creditCards, @RequestParam Integer loans) {
    Offer offer = new Offer(salary, creditCards, loans);
    return offer;
	}
}
