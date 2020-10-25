package com.design.pattern;

public class Application {

    public static void main(String[] args) {

        Button button = new Button();

        button.setOnClickListener((button1) -> System.out.println(button + " is Clicked"));
        button.onClick();
    }
}
