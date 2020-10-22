package com.design.pattern_2.concrete;

import com.design.pattern_2.abst.GuiFac;
import com.design.pattern_2.linux.LinuxGuiFactory;
import com.design.pattern_2.max.MacGuiFactory;
import com.design.pattern_2.win.WinGuiFactory;

public class FactoryInstance {

    public static GuiFac getGuiFac(String type) {
        switch (type) {
            case "Mac":
                return new MacGuiFactory();
            case "Win":
                return new WinGuiFactory();
            case "Linux":
                return new LinuxGuiFactory();
            default:
                throw new IllegalStateException();
        }
    }
}

