package com.vti.lesson1.Lesson4.Mang;

/**
 * 11/11/2023
 */
public class Mang {
    public static void main(String[] args) {
        //cấu trúc mảng
        // Cách 1: [Kiểu dữ liệu của mảng][] = new [kiểu dữ liệu mảng][số phần tử];
        // Cách 2: [Kiểu dữ liệu của mảng][] = {Khởi tạo các phần tử cho mảng};

        // 1 mảng là 1 tập hợp tất cả các phần tử (đối tượng) có cùng tính chất, đặc điểm tương tự nhau
        int [] mangSoNguyen = {1,2,3,4,5,6,7};
        int [] mang2 = new int [7];
        mang2[0] = 1;
        mang2[1] = 8;
        mang2[2] = 10;
        mang2[3] = 12;
        mang2[4] = 21;
        mang2[5] = 19;
        mang2[6] = 100;

        //for(int viTri = 0; viTri < mang2.length; viTri++) {
        //    System.out.println(mang2[viTri]);
        //}

        // Cấu trúc for each
        // Khai báo biến có cùng kiểu dữ liệu với mảng.
        for (int item : mang2) {
            item = mang2 [6];
            System.out.println(item);
// Vòng lặp while/ do while không biết được số lần lặp
            // Vòng lặp for dùng cho mảng hoặc dùng khi xác định được số vòng lặp
        }


    }
}
