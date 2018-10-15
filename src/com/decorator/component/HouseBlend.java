package com.decorator.component;

/**
 * Created by Administrator on 2018/10/15.
 */
public class HouseBlend extends Beverage {
    public HouseBlend(){
        description="这是一个红配咖啡";
    }
    @Override
    public double cost() {
        return .89;
    }
}
