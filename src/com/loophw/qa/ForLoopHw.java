package com.loophw.qa;

public class ForLoopHw {

    public static void main (){

        for (int i =1;i<=5;i++){
            System.out.println(i);

        }

        for(int j = 10;j>1;j--){

            System.out.println(j);

            floop();
        }

    }

    public static void floop(){

        for(int k = 1;k<10;k++){

            System.out.println(k);
        }
    }

}
