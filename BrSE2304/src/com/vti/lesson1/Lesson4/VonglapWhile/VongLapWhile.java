package com.vti.lesson1.Lesson4.VonglapWhile;

public class VongLapWhile {
    public static void main(String[] args) {
        //cấu trúc
        /*
        while ([điều kiện thực hiện vòng lặp]) {
        //các câu lệnh cần thực hiện
        }
         */
        // vòng lặp while luôn kiểm tra điều kiện trước rồi mới thực hiện câu lệnh trong dấu {}
        //test: in ra các số từ 1 đến 10
        int k = 1;
        while (k <= 10) {
            System.out.println(k);
            k = k + 1;
            // k++ tương đương với k = k + 1
        }
       int count = 194;
        boolean flag = true;
        int dem = 1;
        while (flag) {
            System.out.println("Lần thứ " + dem + "thuc hien: ");
            if (count % 3 == 0) {
                flag = false;
            }
            count --;
            dem++;
        }
    }
}
