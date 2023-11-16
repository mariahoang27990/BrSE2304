package com.vti.lesson1.Lesson5;

/**
 * 14/11/2023
 */
public class CacHamString {
    public static void main(String[] args) {
        String s1 = "Xin chào các bạn";
        String s2 = s1;
        // hàm equals để so sánh 2 chuỗi có giá trị bằng nhau hay không
        System.out.println(s2.equals(s1));

        String s3 = "XIN CHAO CAC BAN";
        // hàm equalsIgnoreCase so sánh 2 chuỗi không phân biệt chữ hoa, chữ thường
        System.out.println(s3.equalsIgnoreCase(s1));
        // hàm length trả ra độ dài chuỗi bao gồm cả dấu cách (space)
        System.out.println(" Độ dài chuỗi s1 là: " + s1.length());
        // hàm trim, xoá khoảng trắng đầu và cuối chuỗi
        String s4 = "   Hello World!  ";
        String s5 = s4.trim();
        System.out.println("Trước khi xoá khoảng trắng: " + s4);
        System.out.println("Sau khi xoá khoảng trắng: ==" + s5);

        // hàm contains, chứa chuỗi trong chuỗi
        String s6 = "Hôm nay là thứ 3 ngày 14/11/2023";
        String s7 = "14/11/2023";
        System.out.println("chuỗi số có chứa nội dung của s7 hay không: " + s6.contains(s7));

        //hàm index0f trả ra vị trí của chuỗi con (chuỗi cần so sánh) trong chuỗi cha (chuỗi bị so sánh)
        System.out.println("Vị trí chuỗi s7: " + s6.indexOf(s7));

        //hàm substring có 2 kiểu, để cắt 1 chuỗi bắt đầu từ vị trí nào của chuỗi ban đầu ( chuỗi bị cắt)
        System.out.println(s6.substring(0));
        System.out.println(s6.substring(5, 9)); // bắt đầu cắt chuỗi từ vị trí 5 đến trước vị trí số 9: 5 <= x <9

        // Hàm split: phân tách chuỗi thành mảng các phần tử string được cách nhau bởi ký tự hoặc biểu thức regex
        System.out.println();
        String s8 = "Hôm,nay,là,thứ,3,ngày,14/11/2023.";
        String[] arrStr = s8.split( ","); //chuỗi s8 được tách thành các phần tử ngăn cách nhau bởi dấu ,
        for (String item : arrStr) {
            System.out.println(item);
        }

    }
}
