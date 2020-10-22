package com.design.pattern_2.win;

import com.design.pattern_2.abst.TextArea;

public class WinTextArea implements TextArea {
    @Override
    public String getText() {
        return "윈도우 텍스트 에어리어";
    }
}
