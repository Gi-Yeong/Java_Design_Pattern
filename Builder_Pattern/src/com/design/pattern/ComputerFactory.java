package com.design.pattern;

public class ComputerFactory {

    private BluePrint bluePrint;

    public void setBlueprint(BluePrint blueprint) {
        this.bluePrint = blueprint;
    }

    public void make() {
        bluePrint.setCpu();
        bluePrint.setRam();
        bluePrint.setStorage();
    }

    public Computer getComputer() {
        return bluePrint.getComputer();
    }
}
