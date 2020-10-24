package com.design.pattern;

import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {
        ArrayList<Visitable> visitable = new ArrayList<>();

        visitable.add(new VisitableA(1));
        visitable.add(new VisitableA(2));
        visitable.add(new VisitableA(3));
        visitable.add(new VisitableA(4));
        visitable.add(new VisitableA(5));

        VisitorA visitor = new VisitorA();

//        int ageSum = 0;
        for (Visitable visit : visitable) {
            visit.accept(visitor);
//            ageSum += ((VisitableA) visit).getAge();
        }

        System.out.println("visitor = " + visitor.getAgeSum());
    }
}
