package com.vti.lesson1.Lesson6;

/**
 * 16/11/2023
 */
public class Person {
    // Biến instance (đại diện cho thuộc tính của đối tượng)
    String name;
    int age;
    String address;

    public void walk (String name) {
        System.out.println(name + " đi bộ.");
    }

    public void setName(String ten) {
        this.name = ten;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    // Constructor và contructor mặc định
    // Tương tự như hàm nhưng được sử dụng để khởi tạo giá trị cho các biến instance
    public Person() {
    }

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public static void main(String[] args) {
        new Person(); // đối tượng 1
        Person p1 = new Person(); //đối tượng 2
        Person p2 = new Person(); //đối tượng 3
        // p1 và p2 là 2 đối tượng hoàn toàn độc lập nhau
        p1.walk("bạn A");
        p2.walk("bạn B");
        //p1 và p2 là 2 biến được gán đối tượng Person
        //p1 và p2 có thể gọi được các hàm instance
        // ví dụ:
        Person p3 = new Person();
        System.out.println(p3.name);
        // sẽ in ra giá trị null vì mới chỉ tạo đối tượng từ từ khoá new chưa set giá trị
        // cho các thuộc tính

        p3.setName("Huyền");
        System.out.println(p3.name);
        System.out.println(p2.name);

        // gán giá trị cho biến instance bằng cách sử dụng constructor
        Person p5 = new Person();
        // Constructor mặc định
        p5.setName("Thắm");
        p5.setAddress("Japan");
        p5.setAge(34);

        System.out.println(p5.getName() + " - " + "tuoi: " + p5.getAge() + " - " + p5.getAddress());
        Person p4 = new Person("Huyền", 33, "Vietnam"); //Constructor với 3 biến instance được gán giá trị
        System.out.println(p4.getAddress());
        System.out.println(p4.getName() + " - " + "tuoi: " + p4.getAge() + " - " + p4.getAddress());

        Person p7 = new Person("Nam", 37, "Vietnam");
        System.out.println(p7.getAddress());
        System.out.println(p7.getName() + " - " + "tuoi: " + p7.getAge() + " - " + p7.getAddress());
        Person p8 = new Person("Dieu", 27, "Vietnam");
        System.out.println(p8.getAddress());
        System.out.println(p8.getName() + " - " + "tuoi: " + p8.getAge() + " - " + p8.getAddress());
        Person p9 = new Person("Huy", 24, "Vietnam");
        System.out.println(p9.getAddress());
        System.out.println(p9.getName() + " - " + "tuoi: " + p9.getAge() + " - " + p9.getAddress());
        Person p10 = new Person("Long", 25, "Vietnam");
        System.out.println(p10.getAddress());
        System.out.println(p10.getName() + " - " + "tuoi: " + p10.getAge() + " - " + p10.getAddress());
        Person p11 = new Person("Duong", 31, "Vietnam");
        System.out.println(p11.getAddress());
        System.out.println(p11.getName() + " - " + "tuoi: " + p11.getAge() + " - " + p11.getAddress());


    }
}
