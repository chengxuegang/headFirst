package com.decorator.decorator;

import com.decorator.component.Beverage;

/**
 * Created by Administrator on 2018/10/15.
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",这是摩卡";
    }

    @Override
    public double cost() {
        return beverage.cost()+0.20;
    }
}
