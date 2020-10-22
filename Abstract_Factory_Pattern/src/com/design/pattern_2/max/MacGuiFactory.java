package com.design.pattern_2.max;

import com.design.pattern_2.abst.Button;
import com.design.pattern_2.abst.GuiFac;
import com.design.pattern_2.abst.TextArea;

public class MacGuiFactory implements GuiFac {

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public TextArea createTextArea() {
        return new MacTextArea();
    }
}
