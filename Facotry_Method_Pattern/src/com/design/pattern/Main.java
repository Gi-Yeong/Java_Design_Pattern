package com.design.pattern;

import com.design.pattern.concrte.HpCreator;
import com.design.pattern.concrte.MpCreator;
import com.design.pattern.framework.Item;
import com.design.pattern.framework.ItemCreator;

public class Main {

    public static void main(String[] args) {
        ItemCreator creator;
        Item item;

        creator = new HpCreator();
        item = creator.create();
        item.use();

        creator = new MpCreator();
        item = creator.create();
        item.use();
    }
}
