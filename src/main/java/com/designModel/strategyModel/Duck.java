package com.designModel.strategyModel;

/**
 * Created by uwayxs on 2017/5/11.
 */

import com.designModel.strategyModel.behavior.FlyBehavior;
import com.designModel.strategyModel.behavior.QuackingBehavior;

/**
 * 超类：鸭子
 *
 */
public abstract class Duck {

    //使用组合 而不是继承  针对接口变成，运行是动态赋予对象
    protected FlyBehavior flyBehavior;
    protected QuackingBehavior quackingBehavior;

    public Duck() {
    }

    public void quack(){
        quackingBehavior.quack();
    }
    public void fly(){
        flyBehavior.fly();
    }
    //所有鸭子都会游泳
    public void swim(){
        System.out.println("游泳");
    }
    //鸭子的外观不相同
    public abstract void display();
}
