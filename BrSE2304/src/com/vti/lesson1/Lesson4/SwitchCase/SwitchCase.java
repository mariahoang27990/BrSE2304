package com.vti.lesson1.Lesson4.SwitchCase;

import java.sql.SQLOutput;

/**
 * 11/11/2023
 */
public class SwitchCase {
    public static void main(String[] args) {
        int i = 1;
        switch (i) {
            case 1:
                System.out.println(" i = 1 ");
                break;
            case 2:
                System.out.println(" i = 2 ");
                break;
            case 3:
                System.out.println(" i = 3 ");
                break;
            default:
                System.out.println(" i là mặc định");
        }
        //các câu lệnh phía sau
        //System.out.println("Kết thúc chương trình");

        //
        int month = 17;
        switch (month) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
          break;
            case 10:
            case 11:
            case 12:
                System.out.println("Tháng vừa nhập là tháng trong 1 năm");
                break;
            default:
                System.out.println("Tháng chỉ được phép từ 1-12");


                //Switch case với String
                String ten = "ABCopo";
                switch (ten) {
                case "XYZ":
                    System.out.println("Tên là XYZ");
                    break;
                case "ABC":
                    System.out.println("Tên là ABC");
                    break;
                default:
                    System.out.println("tên không đúng với các trường hợp ABC và XYZ");
                    break;
            }
            System.out.println(" kết thuds việc kiểm tra tên");
        }

    }
}
