package com.design.pattern;

public class Main {

    public static void main(String[] args) {
        PrintMorseCode code = new PrintMorseCode(new SoundMorseCodeFunction());

        code.g().a().r().a().m();

    }
}
