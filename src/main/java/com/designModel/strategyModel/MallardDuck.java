package com.designModel.strategyModel;

import com.designModel.strategyModel.behavior.behaviorImpl.FlyWithNoWay;
import com.designModel.strategyModel.behavior.behaviorImpl.Squack;

/**
 * MallardDuck 会吱吱叫 不会飞
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehavior = new FlyWithNoWay();
        quackingBehavior = new Squack();
    }

    @Override
    public void display() {
        System.out.println("MallardDuck has a green head!");
    }
}
