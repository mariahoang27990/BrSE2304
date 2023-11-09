package com.vti.lesson1.Lesson1;

public class Lesson1 {
    public static void main(String[] args) {
        System.out.println("Hello World");

        // Toán tử cơ bản trong Java
        // + , - , * , / (Chia lấy phần nguyên), % (chia lấy phần dư)



        int a = 3;
        int b = 2;
        int c = a + b;
        int d = a - b;
        int e = a / b;
        int f = a % b;
        int g = a * b;
        System.out.println("Tổng 2 số là: " + c);
        System.out.println("Hiệu 2 số là: " + d);
        System.out.println("Thương 2 số là: " + e);
        System.out.println("Chia lấy phần dư 2 số là: " + f);
        System.out.println("Tích 2 số là: " + g);
        // Toán tử gán
        // Toán tử =

        int x1 = 654; //gán giá trị 654 cho biến x1

        // toán tử +=
        int x2 = 1;
        int x3 = 2;
        x2 += x3; // cộng 2 toán hạng rồi gán giá trị cho toán hạng bên trái
        //tương đương x2 = x2 + x3
        // + liên kết chuỗi (để viết thông tin trên cùng 1 hàng)
        System.out.println("x2 bằng bao nhiêu? " + x2);
//Các phép toán sau tương tự
        x2 -= x3;
        System.out.println("x2 bằng bao nhiêu? " + x2);
        x2 *= x3;
        System.out.println("x2 bằng bao nhiêu? " + x2);
        x2 /= x3;
        System.out.println("x2 bằng bao nhiêu? " + x2);
        x2 %= x3;
        System.out.println("x2 bằng bao nhiêu? " + x2);

        // Toán tử tiếp theo
        // Dịch trái: <<=
        // Dịch phải: >>=
        // phép and bit: &=
        // phép or loại trừ bit: ^=
        // phép or bit: |=

        // toán tử logic
        // so sánh bằng: ==
        int s = 5;
        int p = 4;

        boolean check = true;

        System.out.println("check bằng gì đây: " + check);

            System.out.println("s == p");

        }
        }

