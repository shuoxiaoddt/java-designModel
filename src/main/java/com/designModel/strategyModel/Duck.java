package com.designModel.strategyModel;

/**
 * Created by uwayxs on 2017/5/11.
 */

/**
 * 超类：鸭子
 *
 */
public abstract class Duck {
    //所有鸭子都会呱呱叫
    public void quack(){
        System.out.println("呱呱叫");
    }
    //所有鸭子都会游泳
    public void swim(){
        System.out.println("游泳");
    }
    //鸭子的外观不相同
    public abstract void display();
}
