package com.design.pattern_2;

public class Main {

    public static void main(String[] args) {
        Computer computer = ComputerBuilder
                .start()
                .setCpu("i9")
                .setRam("32G")
                .setStorage("1TB SSD")
                .build();

        System.out.println(computer);
    }
}
