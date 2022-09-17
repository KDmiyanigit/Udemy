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

    public void ifElseIfElse() {
        int x = 10;
        int y = 20;
        int xx = 20;
        int yy = 20;
        if (x > y) {
            System.out.println("X is bigger then y");
        } else if (y > xx) {
            System.out.println("y is bigger then xx");

        } else {
            System.out.println("done");
        }

    }

    public void nestedIf() {
        int a = 18, weight = 50;

        if (a > 18) {
            if (weight > 55) {
                System.out.println("eligible");
            } else {
                System.out.println("no eligible");
            }
        } else {
            System.out.println("not-eligible");
        }

    }
    public void swichStatment(){
        int a = 15;
        switch (a){
            case 10:
                System.out.println("this is b you chose");
                break;


            case 15 :
                System.out.println("Damn you chose a");
                break;

            case 20 :
                System.out.println("not available c");
                break;
        }
    }

    /**
     *
     */
    public void doWhile(){
        int a = 10;
        do {
            System.out.printf("it prints at least once",a);
            a++;
        }while (a<9);
    }
}
