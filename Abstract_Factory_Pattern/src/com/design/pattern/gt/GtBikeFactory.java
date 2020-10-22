package com.design.pattern.gt;

import com.design.pattern.abst.BikeFactory;
import com.design.pattern.abst.Body;
import com.design.pattern.abst.Wheel;

public class GtBikeFactory implements BikeFactory {
    @Override
    public Body createBody() {
        return new GtBody();
    }

    @Override
    public Wheel createWheel() {
        return new GtWheel();
    }
}
