package com.design.pattern;

import com.design.pattern.connection.AbstGameConnectHelper;
import com.design.pattern.connection.DefaultGameConnectionHelper;

public class Main {

    public static void main(String[] args) {
        AbstGameConnectHelper helper = new DefaultGameConnectionHelper();
        
        helper.requestConnection("아이디 암호 등 접속 정보");
    }
}