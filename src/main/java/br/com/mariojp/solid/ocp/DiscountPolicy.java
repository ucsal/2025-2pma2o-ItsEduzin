package br.com.mariojp.solid.ocp;

public interface DiscountPolicy {
    double apply(double amount);

    DiscountPolicy NO_DISCOUNT = amount -> amount; 
    
}
