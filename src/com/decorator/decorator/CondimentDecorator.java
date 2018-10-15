package com.decorator.decorator;

import com.decorator.component.Beverage;

/**
 * Created by Administrator on 2018/10/14.
 *  所有的调料装饰者必须重新实现 getDescription();
 */
public abstract  class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
