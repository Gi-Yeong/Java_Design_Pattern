package com.design.pattern.sam;

import com.design.pattern.abst.BikeFactory;
import com.design.pattern.abst.Body;
import com.design.pattern.abst.Wheel;

public class SamFactory implements BikeFactory {

    @Override
    public Body createBody() {
        return new SamBody();
    }

    @Override
    public Wheel createWheel() {
        return new SamWheel();
    }
}
