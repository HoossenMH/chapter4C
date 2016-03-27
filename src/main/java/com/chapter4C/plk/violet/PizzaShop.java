package com.chapter4C.plk.violet;

/**
 * Created by Toshiba on 2016/03/27.
 */
public class PizzaShop  extends SmallBusiness {

    private String name;
    private String regNum;
    private double loanAmount;

    public PizzaShop()
    {}

    public PizzaShop(String nm, String regNum, double amount)
    {
        name = nm;
        this.regNum = regNum;
        loanAmount = amount;
    }

    public String getName()
    {
        return name;
    }

    public String getRegNum()
    {
        return regNum;
    }

    public double getLoanAmount()
    {
        return loanAmount;
    }

    @Override
    public double interest()
    {
        return loanAmount * 0.05;
    }

}