package javaCollection;

import java.util.HashMap;
import java.util.Scanner;

public class Bai11 {
    private HashMap<String, String> dulieu = new HashMap<>();

    public String themTu(String tuKhoa, String yNghia) {
        this.dulieu.put(tuKhoa, yNghia);
        return "Them tu thanh cong";
    }

    public String traCuu(String tuKhoa) {
        return dulieu.get(tuKhoa);
    }

    public static void main(String[] args) {
        Bai11 bai11 = new Bai11();
        int luaChon = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhap 1 de them tu \n" +
                    "Nhap 2 de tra cuu \n" +
                    "Nhap 0 de thoat");
            luaChon = scanner.nextInt();
            scanner.nextLine();
            if (luaChon == 1) {
                System.out.println("Nhap vao tu: ");
                String tuKhoa = scanner.nextLine();
                System.out.println("Nhap vao y nghia: ");
                String yNghia = scanner.nextLine();
                System.out.println(bai11.themTu(tuKhoa, yNghia));
            } else if (luaChon == 2) {
                System.out.println("nhap vao tu khoa de tra cuu");
                String tuKhoa = scanner.nextLine();
                System.out.println("y nghia la : " + bai11.traCuu(tuKhoa));
            }
        } while (luaChon != 0);
    }
}
