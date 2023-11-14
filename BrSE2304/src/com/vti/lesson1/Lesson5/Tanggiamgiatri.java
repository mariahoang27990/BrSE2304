package com.vti.lesson1.Lesson5;

/**
 * 14/11/2023
 */
public class Tanggiamgiatri {
    public static void main(String[] args) {
        // i++ <=> i = i + 1;
        // ++i <=> i = i + 1;
        // Vậy nó khác nhau ra sao??
        int i = 0;
        i++;
        System.out.println("i++ giá trị của i là: " + i);

        ++i;
        System.out.println("++i giá trị của i là: " + i);
        System.out.println("=================");
        System.out.println("=================");

        i = 0;
        printValueI(i++);
        printValueI(i);
        System.out.println("=============");

        i = 0;
        printValueI(i++);
        printValueI(i);


        //Khái niệm:
        //i++ gán trước rồi cộng sau
        //++i: cộng trước rồi gán sau

    }

    public static void printValueI(int i) {
        System.out.println("Gía trị của i là: " + i);
    }
}

