package com.design.pattern_2.max;

import com.design.pattern_2.abst.Button;

public class MacButton implements Button {

    @Override
    public void Click() {
        System.out.println("Mac Button Click");
    }
}
