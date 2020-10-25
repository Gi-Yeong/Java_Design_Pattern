package com.design.pattern_2;

public class Application {

    public static void main(String[] args) {
        Attack attack = new Attack(100);

        Armor armor1 = new Armor(10); // 갑옷
        Armor armor2 = new Armor(15); // 투구

        armor1.setNextDefense(armor2);

        // 첫번 째 공격
        armor1.defense(attack);

        System.out.println(attack.getAmount());
        
        Defense defense = attack1 -> {
            int amount = attack1.getAmount();
            attack1.setAmount(amount - 50);
        };

        // 추가 착용
        armor2.setNextDefense(defense);

        // 두번 째 공격
        attack.setAmount(100);
        armor1.defense(attack);

        System.out.println(attack.getAmount());
    }
}
