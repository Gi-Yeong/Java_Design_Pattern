package com.design.pattern_2.linux;

import com.design.pattern_2.abst.Button;

public class LinuxButton implements Button {
    @Override
    public void Click() {
        System.out.println("리눅스 버튼 클릭");
    }
}
