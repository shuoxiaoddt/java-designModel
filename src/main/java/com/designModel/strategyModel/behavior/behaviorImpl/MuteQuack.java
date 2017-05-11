package com.designModel.strategyModel.behavior.behaviorImpl;

import com.designModel.strategyModel.behavior.QuackingBehavior;

/**
 * Created by uwayxs on 2017/5/11.
 */
public class MuteQuack implements QuackingBehavior{
    public void quack() {
        System.out.println("can not quack!");
    }
}
