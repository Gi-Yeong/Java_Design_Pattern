package com.design.pattern.concrte;

import com.design.pattern.framework.Item;

public class MpPotion implements Item {
    @Override
    public void use() {
        System.out.println("마력 회복");
    }
}
