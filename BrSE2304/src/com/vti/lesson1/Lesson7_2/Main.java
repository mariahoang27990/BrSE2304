package com.vti.lesson1.Lesson7_2;

import java.util.Scanner;

/**
 * 18/11/2023
 */

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("Luong Son Doong");
        p1.setAddress("Viet Nam");
        p1.setAge(35);

        System.out.println("Tên của bạn là: " + p1.getName() + ". Địa chỉ của bạn là: " + p1.getAddress() + ".Tuổi của bạn là: " + p1.getAge());
    Scanner scan = new Scanner(System.in);
        System.out.println("Nhập tên của bạn: ");
        String ten = scan.nextLine();
        p1.setName(ten);

        System.out.println("Nhập địa chỉ của bạn: ");
        String diachi = scan.nextLine();
        p1.setAddress(diachi);

        System.out.println("Nhập tuổi của bạn: ");
        int tuoi = scan.nextInt();
        p1.setAge(tuoi);

        System.out.println("Tên của bạn là: " + p1.getName() + ".Địa chỉ của bạn là: "
        + p1.getAddress() + ".Tuổi của bạn là: " + p1.getAge());
        scan.close();


    }
}
