package com.decorator.component;

/**
 * Created by Administrator on 2018/10/14.
 * 饮料 基类
   A:抽象类和抽象方法必须用abstract关键字修饰
   B:抽象类中不一定有抽象方法,但是有抽象方法的类必须定义为抽象类
   C:抽象类不能实例化。因为它不是具体的。
     抽象类有构造方法，但是不能实例化?构造方法的作用是什么呢?
     用于子类访问父类数据的初始化
   D:抽象的子类
     a:如果不想重写抽象方法，该子类是一个抽象类。
     b:重写所有的抽象方法，这个时候子类是一个具体的类。
 */
public abstract class Beverage {
    public String description = " 未知的饮品";

    public String getDescription(){
        return description;
    }

    public abstract  double cost();
}
