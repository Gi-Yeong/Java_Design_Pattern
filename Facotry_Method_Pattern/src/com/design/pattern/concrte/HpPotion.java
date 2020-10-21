package com.design.pattern.concrte;

import com.design.pattern.framework.Item;

public class HpPotion implements Item {

    @Override
    public void use() {
        System.out.println("체력 회복!");
    }
}
