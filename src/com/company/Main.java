package com.company;

public class Main
    {
        public static void main(String[] args)
        {
            String day = "Wednesday";
            int date = 8;
            int month = 9;
            int year = 2021;
            printAmerican(day, date, month, year);
            printEuropean(day, date, month, year);
        }
        public static void printAmerican(String day, int date, int month, int year)
        {

            System.out.println("It is: " + day + ", " + month + ", " + date + ", " + year);
        }
        public static void printEuropean(String day, int date, int month, int year)
        {
            System.out.println("It is: " + day + ", " + date + ", " + month + ", " + year);
        }
    }