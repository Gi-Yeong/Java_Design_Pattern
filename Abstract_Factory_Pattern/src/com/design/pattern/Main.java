package com.design.pattern;

import com.design.pattern.abst.BikeFactory;
import com.design.pattern.abst.Body;
import com.design.pattern.abst.Wheel;
import com.design.pattern.gt.GtBikeFactory;
import com.design.pattern.sam.SamFactory;

public class Main {

    public static void main(String[] args) {
//        BikeFactory factory = new SamFactory();
        BikeFactory factory = new GtBikeFactory();
        Body body = factory.createBody();
        Wheel wheel = factory.createWheel();

        System.out.println(body.getClass());
        System.out.println(wheel.getClass());

    }
}
