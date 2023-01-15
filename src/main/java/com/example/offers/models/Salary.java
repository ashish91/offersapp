package com.example.offers.models;

public class Salary {
  private final Integer value;

  public Salary(Integer value) {
    this.value = value;
  }

  public Integer getValueInLakhs() {
    return value/100000;
  }
}
