package com.vti.lesson1.Lesson2;

/** 07/11/2023
 *
 */
public class Lesson2 {

    public static void main(String[] args) {
        //ôn lại kiến thức về toán tử trong java
        // 1. Toán tử quan hệ

        int x = 2;
        int y = 2;
        //1.1. Toán tử 1 =
        System.out.println(x != y);
        // 1.2 Toán tử <=

        x = 10;
        y = 10;
        System.out.println(x <= y);

        //1.3. chia lấy phần dư
       // tong2so();
        //hieu2so();
        tong2So();
        System.out.println(" Hieu 2 so: " + hieu2So());
        System.out.println("Tich 2 so: " + tich2So(3, 4));

        int z = hieu2So();
        System.out.println("z = " +z);

        int c = tich2So(4, 5);
        System.out.println("c = " + c);
        System.out.println(c);
        System.out.println("Tich 2 so: " + tich2So(5, 8));

    }

    public static void tong2So(){
        System.out.println("Tổng 2 số 2 và 3 là:" + (2+3));
    }
// hàm khai báo kiểu dữ liệu gì thì sẽ phải return về giá trị của kiểu dữ liệu đó
    public static int hieu2So () {
        return 10;
    }
    //Tham có tham số truyền vào (parameter)
    public static int tich2So(int a, int b) {
        return a * b;

    }
}
