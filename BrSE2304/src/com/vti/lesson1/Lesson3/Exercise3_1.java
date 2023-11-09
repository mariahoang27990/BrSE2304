package com.vti.lesson1.Lesson3;

import java.util.Scanner;

/**
 * 09/11/2023
 * Practice exercises
 */
public class Exercise3_1 {
    public static void main(String[] args) {
        //Bài tập về câu điều kiện
        // Viết chương trình nhập 1 số nguyên từ bàn phím, kiểm tra số đó và in ra màn hình số đó là âm, dương hay bằng 0


        System.out.println("Nhập một số nguyên từ bàn phím: ");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        System.out.println("Nhập x là: " + x);

            System.out.println("giá trị  của x là: " +  x);

            if (x > 0) {
                System.out.println("x là số dương");
            }
            if (x < 0) {
                System.out.println(" x là số âm");
            }
            if (x == 0) {
                System.out.println(" x = 0");
        }
            //if else lồng nhau
        if (x > 0) {
            System.out.println(" x là số dương");
        } else if (x < 0) {
            System.out.println(" x là số âm");
        }else {
            if (x == 0) {
                System.out.println("x = 0");
            }
            //if else lồng nhau sẽ tương đương với đoạn code sau
            if (x > 0) {
                System.out.println(" x là số dương");
            }else {
                if (x < 0) {
                    System.out.println("x là số âm");
                } else {
                    System.out.println("x = 0");
                }
            }

            // Toán tử điều kiện [Kiểu dữ liệu khai báo],[Tên biến], [Biểu thức logic] ?
            // [Kết quả của biểu thức đúng] : [Kết quả của biểu thức sai ]
            String kiemtra = (x > 10) ? "x lớn hơn 10" : "x nhỏ hơn 10";

            int z = 3;
            int y = (z > 5) ? 4 : 1;
            System.out.println(y);

                }
            }
        }

