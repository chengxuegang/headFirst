package com.decorator.component;

/**
 * Created by Administrator on 2018/10/15.
 * 压缩咖啡
 */
public class Espresso extends  Beverage {
    public Espresso(){
        description ="这是一个压缩咖啡";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
