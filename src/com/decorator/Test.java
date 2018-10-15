package com.decorator;

import com.decorator.component.Beverage;
import com.decorator.component.Espresso;
import com.decorator.component.HouseBlend;
import com.decorator.decorator.Mocha;
import com.decorator.decorator.Soy;
import com.decorator.decorator.Whip;

/**
 * Created by Administrator on 2018/10/15.
 */
public class Test {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()+",金额："
                + beverage.cost());

        Beverage beverage1  = new HouseBlend();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
//        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription()+",金额："
                + beverage1.cost());
    }
}
