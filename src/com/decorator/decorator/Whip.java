package com.decorator.decorator;

import com.decorator.component.Beverage;

/**
 * Created by Administrator on 2018/10/15.
 */
public class Whip extends  CondimentDecorator {
    Beverage beverage;
    public Whip(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ",起泡";
    }

    @Override
    public double cost() {
        return beverage.cost() + 1.30;
    }
}
