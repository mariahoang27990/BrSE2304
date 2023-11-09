package com.vti.lesson1.Lesson3;

import java.util.Scanner;

/** 09/11/2023
 *
 */
public class Lesson3 {
    // Tên hằng số thì viết hoa tất cả các chữ cái, các từ cách nhau bởi dấu_
    //Khai báo hằng số
    public static final int THANG_CUA_NAM = 12;
    public static final String MEMBER = "Nguyễn Anh Dũng";

    public static void main(String[] args) {
        //I. Chuỗi và Hằng số
        String str = "Xin chào các bạn";
        System.out.println(str);
        //1.1. Ghép chuỗi
        String str2 = "Các bạn có khoẻ không? " + "Mình tên là Thu Huyền" + "Mình hôm nay rất buồn ngủ";
        System.out.println(str2);
        //1.2. Ghép chuỗi với 2 biến str và str2;
        System.out.println(str + str2);
        // Hằng số
        System.out.println("1 năm có bao nhiêu tháng? " + THANG_CUA_NAM);
        System.out.println( "Tên của thành viên là: " + MEMBER);

        //III. Đọc dữ liệu từ bàn phím sử dụng scanf
        Scanner scan = new Scanner (System.in); // cấu trúc tiêu chuẩn khi cần nhập thông tin
        System.out.println( "Nhập 1 số bất kỳ");
        scan.nextInt();


        Scanner scan2 = new Scanner (System.in);
        System.out.println("Nhập tên của anh chị");
        scan2.nextLine();

        //Gán gía trị nhập vào biến
        System.out.println("Nhập 1 số nguyên dương");
        int nguyenDuong = scan.nextInt();

        System.out.println("Số bạn vừa nhập là: " + nguyenDuong);

        scan.close();
        scan2.close();







    }
}
