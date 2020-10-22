package com.design.pattern.concrete;

import com.design.pattern.abst.AbstAdding;
import com.design.pattern.abst.IBeverage;

public class Milk extends AbstAdding {

    public Milk(IBeverage material) {
        super(material);
    }

    @Override
    public int getTotalPrice() {
        return super.getTotalPrice() + 50;
    }
}
