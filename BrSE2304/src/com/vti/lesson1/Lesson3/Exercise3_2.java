package com.vti.lesson1.Lesson3;

public class Exercise3_2 {
    public static void main(String[] args) {
        //viết chương trình để in ra các số chẵn từ 1-10 và các số lẻ từ 11-20
        for (int i = 1; i <= 20; i++) {
            if (i <= 10) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            } else {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        }
            //
            for(int i = 1; i <= 10; i++) {
                if (i%2 == 0) {
                    System.out.println(i);
                }
            }
            for(int i = 11; i <= 20; i++) {
                if (i%2 != 0) {
                    System.out.println(i);
                }
            }
        }
    }

