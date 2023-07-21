package javaCollection;

import java.util.HashMap;
import java.util.Scanner;

public class Bai8 {
    private HashMap<String, String> danhSachSanPham = new HashMap<>();

    public String themDuLieu(String maSP, String thongTin) {
        this.danhSachSanPham.put(maSP, thongTin);
        return "them du lieu thanh cong";
    }

    public void hienThiDanhSach() {
        System.out.println(danhSachSanPham);
    }

    public String timThongTinSP(String maSP) {
        return danhSachSanPham.get(maSP);
    }

    public String xoaSanPham(String maSP) {
        danhSachSanPham.remove(maSP);
        return "xoa thanh cong";
    }

    public String capNhatSanPham(String maSP, String thongTinMoi) {
        danhSachSanPham.replace(maSP, thongTinMoi);
        return "Update thanh cong";
    }

    public static void main(String[] args) {
        Bai8 b8 = new Bai8();
        int luaChon = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Welcome");
            System.out.println("1: them du lieu \n" +
                    "2: hien thi danh sach \n" +
                    "3: tim thong tin san pham bang ma san pham \n" +
                    "4: xoa san pham khoi danh sach \n" +
                    "5: cap nhat thong tin san pham \n" +
                    "nhan 0 de thoat");
            luaChon = scanner.nextInt();
            scanner.nextLine();
            if (luaChon == 1) {
                System.out.println("nhap ma san pham");
                String maSP = scanner.nextLine();
                System.out.println("nhap thong tin");
                String thongTin = scanner.nextLine();
                b8.themDuLieu(maSP, thongTin);
            } else if (luaChon == 2) {
                b8.hienThiDanhSach();
            } else if (luaChon == 3) {
                System.out.println("Nhap ma san pham de tim thong tin");
                String maSP = scanner.nextLine();
                System.out.println(b8.timThongTinSP(maSP));
            } else if (luaChon == 4) {
                System.out.println("Nhap ma san pham muon xoa");
                String maSP = scanner.nextLine();
                b8.xoaSanPham(maSP);
            } else if (luaChon == 5) {
                System.out.println("Nhap ma san pham muon cap nhat");
                String maSP = scanner.nextLine();
                System.out.println("Nhap thong tin moi cap nhat");
                String thongTinMoi = scanner.nextLine();
                System.out.println(b8.capNhatSanPham(maSP, thongTinMoi));
            }
        } while (luaChon != 0);
    }
}
