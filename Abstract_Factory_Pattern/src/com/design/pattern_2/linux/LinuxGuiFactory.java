package com.design.pattern_2.linux;

import com.design.pattern_2.abst.Button;
import com.design.pattern_2.abst.GuiFac;
import com.design.pattern_2.abst.TextArea;

public class LinuxGuiFactory implements GuiFac {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public TextArea createTextArea() {
        return new LinuxTextArea();
    }
}
