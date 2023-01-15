package com.example.offers.models;

import com.example.offers.services.OfferCalculator;

public class Offer {
	private final Integer salary;
	private final Integer creditCards;
	private final Integer loans;

	public Offer(Integer salary, Integer creditCards, Integer loans) {
    this.salary = salary;
    this.creditCards = creditCards;
    this.loans = loans;
	}

	public Integer getOffer() {
    OfferCalculator offerCalculator = new OfferCalculator(salary, creditCards, loans);
    return offerCalculator.generateOffer();
	}
}
