package com.designModel.strategyModel.behavior.behaviorImpl;

import com.designModel.strategyModel.behavior.FlyBehavior;

/**
 * 将行为封装到具体类，与客户端实现分离
 */
public class FlyWithNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("can not fly!");
    }
}
