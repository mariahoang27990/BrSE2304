package com.vti.lesson1.Lesson5;

import java.util.Scanner;

/**
 * 14/11/2023
 */
public class CauHoiTracNghiem {
    //Tạo câu hỏi trắc nghiệm và kiểm tra đáp án đúng
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            // VÒNG LẶP VÔ HẠN
            System.out.println("Cấu trúc toán tử điều kiện trong java là gì?");
            System.out.println("A.[biểu thức điều kiện] ? [giá trị đúng] : [giá trị sai]");
            System.out.println("B. [giá trị đúng] ? [biểu thức điều kiện] : [giá trị sai]");
            System.out.println("C. [giá trị sai] ? [biểu thức điều kiện] : [giá trị đúng]");
            System.out.println("D. Không có đáp án nào đúng");

            String phuongAnChon = scan.nextLine();
            if ("A".equals(phuongAnChon)) {
                System.out.println("Bạn trả lời đúng");
                break;
            } else if ("B".equals(phuongAnChon)) {
                System.out.println("Bạn trả lời sai");
                break;
            } else if ("C".equals(phuongAnChon)) {
                System.out.println("Bạn trả lời sai");
                break;
            } else if ("D".equals(phuongAnChon)){
                        System.out.println("Bạn trả lời sai");
                        break;
            }else {
                System.out.println("Vui lòng lựa chọn đáp án!");
            }
        }

    }
}
