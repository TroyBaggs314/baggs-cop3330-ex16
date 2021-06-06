/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Troy Baggs
 */

package org.example;
import java.util.Scanner;
public class exercise16
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = sc.nextInt();
        System.out.println(conditional(age));
    }

    public static String conditional(int age)
    {
        return (age >= 18) ? "You are old enough to legally drive." : "You are not old enough to legally drive.";
    }
}
