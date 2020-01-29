package com.infix.array;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.SQLOutput;

public class ReverseArrayHw
{



    public static void main(String[] args)
    {
        int[]numbers = new int[10];
    int[]numbers = new java.util.Scanner(System.in);
    //inputing the value
    System.out.print ("Enter Numbers");
    for(int i = 0;i<10;i++)
    {
        numbers[i] = input.nextInt();
    }
    for(int i = 9;i>=0;i--)
    {
        System.out.println(numbers[i]);
    }

}
}
