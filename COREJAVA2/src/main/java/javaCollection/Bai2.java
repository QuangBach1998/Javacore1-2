package javaCollection;

import java.util.HashSet;

public class Bai2 {
    public static void main(String[] args) {
        HashSet<String> countries = new HashSet<>();
        //! them ten quoc gia
        countries.add("Viet Nam");
        countries.add("Trung Quoc");
        countries.add("Nga");
        countries.add("My");
        countries.add("Nhat");
        //! hien thi danh sach
        System.out.println("Danh sach cac quoc gia: " + countries);
        //! kiem tra ton tai
        System.out.println("danh sach co quoc gia Viet Nam? :" + countries.contains("Viet Nam"));
        //! xoa quoc gia Trung Quoc
        countries.remove("Trung Quoc");
        System.out.println("Danh sach cac quoc gia sau khi xoa Trung Quoc: " + countries);
        //! tinh so luong cac quoc gia (da xoa Trung Quoc) -> 4
        System.out.println("So luong quoc gia: " + countries.size());

    }
}
