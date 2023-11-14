package com.vti.lesson1.Lesson5;

/**
 * 14/11/2023
 */
public class BreakCondition {
    public static void main(String[] args) {
        // Câu lệnh break
        // Tác dụng: Để kết thúc vòng lặp
        for (int i = 0; i < 10; i++){
            System.out.println(i);
            break;
            //Break: nhảy ra khỏi khối lệnh, tác dụng dừng vòng lặp
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if ( i== 6) {
                break;
            }
        }
    }
}
