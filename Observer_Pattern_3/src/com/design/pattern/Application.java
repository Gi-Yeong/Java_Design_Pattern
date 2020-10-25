package com.design.pattern;

public class Application {

    public static void main(String[] args) {
        // 1. 제네릭
        // 2. 델리게이트
        // 3. 내부에 옵저버를 넣는다

        Button button = new Button();
        button.addObserver(new Observable.Observer<String>() {
            @Override
            public void update(Observable<String> o, String arg) {
                System.out.println(o + " is clicked!!");
            }
        });

        button.onClick();
        button.onClick();
        button.onClick();
    }
}
