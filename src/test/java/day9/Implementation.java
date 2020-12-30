package day9;

import day8.EncapExamp;

public class Implementation {
    public static void main(String[] args) {
        EncapExamp ec =new EncapExamp();
        ec.setCardName("Aravind");
        ec.setCvv(323);
        ec.setExp(2020);
        System.out.println("Card number"+ec.getCardName());
        System.out.println("Card cvv"+ec.getCvv());
        System.out.println("Card Exp"+ec.getExp());
        System.out.println("Card Name"+ec.getName());
    }
}
