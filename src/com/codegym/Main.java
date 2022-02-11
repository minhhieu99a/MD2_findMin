package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int size;
        int[] array ;
        Scanner scanner =new Scanner(System.in);
            System.out.print("Enter a size:");
            size = scanner.nextInt();
        array= new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element " + (i + 1) + " : ");
            array[i]=scanner.nextInt();
        }
        System.out.print("Property list: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+",");
        }
        int min=array[0];
        int index =1;
        for (int i = 1; i < array.length; i++) {
            if (array[i]<min){
                min=array[i];
                index=i+1;
            }
        }
        System.out.println("The largest property value in the list is " + min + " ,at position " + index );
    }
}
