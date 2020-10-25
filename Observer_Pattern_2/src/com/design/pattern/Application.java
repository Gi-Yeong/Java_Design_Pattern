package com.design.pattern;

public class Application {

    public static void main(String[] args) {
        Button button = new Button();
        button.addObserver((o, arg) -> System.out.println(o + " is clicked!!"));

        button.onClick();
        button.onClick();
        button.onClick();
    }
}
