package com.vti.lesson1.Lesson3;

import java.util.Scanner;

/** 09/11/2023
practice exercise
 */
public class Exercise3 {
    public static void main(String[] args) {
        // Bài tập nhập 2 số nguyên dương từ bàn phím và in ra tổng 2 số đó
        Scanner scan = new Scanner(System.in);

        System.out.println("Nhập 2 số nguyên dương.");
        System.out.println("Nhập x = ");
        int x = scan.nextInt();
        System.out.println("Nhập y = ");
        int y = scan.nextInt();
        int tong = x + y;
        System.out.println("Tổng x + y = " + tong);

    }
}
