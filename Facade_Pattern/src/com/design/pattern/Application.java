package com.design.pattern;

import com.design.pattern.system.Facade;

public class Application {

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.process();
    }
}
