package com.vti.lesson1.Lesson1;

public class Ex1 {
    public static void main(String[] args) {

        float s = tinhDienTichHinhTron(5.5F);
        System.out.println("Dien tich hinh tron la:" + s);
        float y = tinhDienTichChuNhat (5, 3);
        System.out.println("Dien tich hinh chu nhat la: " + y);
    }

    public static float tinhDienTichHinhTron(float r) {
        float dienTich = r * r * 3.14F;
        return dienTich;
    }
        public static float tinhDienTichChuNhat ( int d, int s){
            float dienTichChuNhat = d * s;
            return dienTichChuNhat;


        }
    }

