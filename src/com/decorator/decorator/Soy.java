package com.decorator.decorator;

import com.decorator.component.Beverage;

/**
 * Created by Administrator on 2018/10/15.
 */
public class Soy extends CondimentDecorator {
    Beverage beverage;
    public Soy(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription()+" ,酱油";
    }

    @Override
    public double cost() {
        return beverage.cost()+0.34;
    }
}
