package com.design.pattern_2.win;

import com.design.pattern_2.abst.Button;

public class WinButton implements Button {
    @Override
    public void Click() {
        System.out.println("윈도우 버튼 클릭");
    }
}
