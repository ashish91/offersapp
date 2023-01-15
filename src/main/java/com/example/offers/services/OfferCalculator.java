package com.example.offers.services;

import com.example.offers.models.Salary;

public class OfferCalculator {
  private final Salary salary;
	private final Integer creditCards;
	private final Integer loans;

  private static final int MAX_SALARY_CONTRIBUTION = 40;
  private static final int MAX_CREDIT_CARD_CONTRIBUTION = 20;
  private static final int MAX_LOAN_DEDUCTION = 10;

  public OfferCalculator(Integer salary, Integer creditCards, Integer loans) {
    this.salary = new Salary(salary);
    this.creditCards = creditCards;
    this.loans = loans;
	}

  public Integer generateOffer() {
    int percent = 0;
    percent += offerContributionBySalary();
    percent += offerContributionByCreditCard();
    percent -= offerDeductionByLoan();

    return percent;
  }

  private Integer offerContributionBySalary() {
    int salary_in_lakhs = salary.getValueInLakhs();
    return Math.min(salary_in_lakhs, MAX_SALARY_CONTRIBUTION);
  }

  private Integer offerContributionByCreditCard() {
    int offer_by_credit_cards = creditCards*5;
    return Math.min(offer_by_credit_cards, MAX_CREDIT_CARD_CONTRIBUTION);
  }

  private Integer offerDeductionByLoan() {
    int deduct_by_loans = loans*2;
    return Math.min(deduct_by_loans, MAX_LOAN_DEDUCTION);
  }
}
