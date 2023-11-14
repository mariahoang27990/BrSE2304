package com.vti.lesson1.Lesson5;

import java.util.Scanner;

/**
 * 14/11/2023
 */
public class ContinueCondition {
    public static void main(String[] args) {
            // Câu lệnh continue dùng để tiếp tục vòng lặp  và bỏ qua các câu lệnh bên dưới nó.
        // Continue khá giống với break chỉ khác là continue sẽ tiếp tục vòng lặp.
        // Thường được sử dụng để check điều kiện nào để được tiếp tục vòng lặp hay không.
        // Continue cũng chỉ ảnh hưởng đến vòng lặp hiện tại của nó mà thôi.
//        for (int i = 0; i < 10; i++) {
//            if (i < 7) {
//                continue;
//            }
//            System.out.println(i);
//        }
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//            if ( i== 6) {
//                continue;
//            }
//        }
//            for ( int i = 0; i < 10; i++) {
//                System.out.println(" Giá trị i = " + i);
//                for (int j = 0; j < 11; j++) {
//                    System.out.println(" j = " + j);
//                    if ( j == 4) {
//                        break;
//                    }
//                }
//            }

//
//        for (int i = 0; i < 10; i++) {
//            System.out.println(" Giá trị i = " + i);
//            for (int j = 0; j < 11; j++) {
//                System.out.println(" j = " + j);
//                if (j < 9) {
//                    continue;
//
//                }
//                System.out.println("j = " + i);
//            }
//            System.out.println("Giá trị i = " + i);
//        }
        do {
            Scanner scan = new Scanner(System.in);
            int input = scan.nextInt();
            System.out.println("thông tin khách hàng");
            if (input == 100) {
                scan.close();
                break;
            }
            scan.close();
        } while (true);
        System.out.println(" Kết thúc chương trình");

    }
}

