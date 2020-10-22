package com.design.pattern_2;

import com.design.pattern_2.abst.Button;
import com.design.pattern_2.abst.GuiFac;
import com.design.pattern_2.abst.TextArea;
import com.design.pattern_2.concrete.FactoryInstance;

public class Main {

    public static void main(String[] args) {
        GuiFac factory = FactoryInstance.getGuiFac("Mac");
        Button button = factory.createButton();
        TextArea textArea = factory.createTextArea();

        button.Click();
        System.out.println(textArea.getText());

    }
}
