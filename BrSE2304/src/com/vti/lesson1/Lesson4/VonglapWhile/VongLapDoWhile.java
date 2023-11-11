package com.vti.lesson1.Lesson4.VonglapWhile;

/**
 * 11/11/2023
 */
public class VongLapDoWhile {
    public static void main(String[] args) {
        // Cấu trúc
        /*
        do{
        // câu lệnh cần thực hiện
        } while ([điều kiện thực hiện])
         */
        int i = 0;
        do {
            System.out.println(i);
            i = i + 1;
        }while ( i < 10);
        // vòng lặp do while sẽ thực hiện lệnh trước rồi mới so sánh điều kiện
    }
}
