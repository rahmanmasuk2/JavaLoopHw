package com.loophw.qa;

import java.sql.SQLOutput;

public class WhileLoopHw {

    public static void main(String []args){
        int k = 25;
        while (k>15){
           // System.out.println(k);
            k--;
        }
       // myLoopprint();
       // myLoopdo();
        myLoopnature();

    }
    public static void whileloop(){
        int l = 3;
        while (l<7){
            System.out.println(l);
            l++;
        }
    }
    public static void myLoopprint (){
        for (int m = 1; m <=10; m ++){
            System.out.println(m);

        }
    }
    public static void myLoopdo(){
        int k = 1;
        do {
            System.out.println(k);
            k++;
        }
        while (k <= 10);
    }
    public static void myLoopnature(){
        int sum = 0;
        for (int k = 1; k <= 10; k++){
            sum = sum + k;
            System.out.println(sum);

        }
    }


}
