package com.design.pattern_2.win;

import com.design.pattern_2.abst.Button;
import com.design.pattern_2.abst.GuiFac;
import com.design.pattern_2.abst.TextArea;

public class WinGuiFactory implements GuiFac {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public TextArea createTextArea() {
        return new WinTextArea();
    }
}
