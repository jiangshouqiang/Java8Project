package com.gr.jiang.interfacetest.impl;

import com.gr.jiang.interfacetest.Defaulable;
import com.gr.jiang.interfacetest.DefaulableFactory;
import com.gr.jiang.interfacetest.OverridableImpl;

import java.util.Arrays;
import java.util.List;

/**
 * Created by jiang on 2017/10/13.
 */
public class TestMain {
    public static void main(String [] args){
        TestInterface testInterface = new TestInterface();
        testInterface.test();
        System.out.println(testInterface.notRequest());

        Defaulable defaulable = DefaulableFactory.create(TestInterface::new);
        defaulable.test();
        System.out.println(defaulable.notRequest());

        defaulable = DefaulableFactory.create(OverridableImpl::new);
        defaulable.test();
        System.out.println(defaulable.notRequest());

        final Car car = Car.create(Car::new);
        final List<Car> cars = Arrays.asList(car);

        cars.forEach(Car::collide);

        cars.forEach(Car::repair);

        final Car police = Car.create(Car::new);
        cars.forEach(police::follow);
    }
}
