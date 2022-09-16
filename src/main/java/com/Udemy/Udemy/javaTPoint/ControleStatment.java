package com.Udemy.Udemy.javaTPoint;

public class ControleStatment {

    public void isElse() {

        int x = 10;
        int y = 12;
        if (y > x) {

            System.out.println("x is bigger they");
        } else {
            System.out.println("y is bigger");
        }
    }

    public void terNaryOperater() {
        int x = 10;
        int y = 20;
        String outPut = (x > y) ? "X is bigger " : "Y is bigger";
        System.out.println(outPut);

    }

}
