package com.desiginModel.strategyModel;

import com.designModel.strategyModel.MallardDuck;
import org.junit.Test;

/**
 * Created by uwayxs on 2017/5/11.
 */
public class StrategyModelTest {
    @Test
    public void test(){
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.quack();
        mallardDuck.fly();
    }
}
