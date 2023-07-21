package javaCollection.bai12;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class SanPham {
    private String ten;
    private String ma;
    private double giaBan;
    private String ngaySX;

    //! sap xep theo ten
    public static void sapXepTheoTen(ArrayList<SanPham> listSanPham) {
        Collections.sort(listSanPham, new Comparator<SanPham>() {
            @Override
            public int compare(SanPham o1, SanPham o2) {
                return o1.ten.compareTo(o2.ten);
            }
        });
    }

    //! sap xep theo gia ban
    public static void sapXepTheoGiaBan(ArrayList<SanPham> listSanPham) {
        Collections.sort(listSanPham, new Comparator<SanPham>() {
            @Override
            public int compare(SanPham o1, SanPham o2) {
                return Double.compare(o1.giaBan, o2.giaBan);
            }
        });
    }

    //! sap xep theo ngay san xuat
    public static void sapXepTheoNgaySanXuat(ArrayList<SanPham> listSanPham) {
        Collections.sort(listSanPham, new Comparator<SanPham>() {
            @Override
            public int compare(SanPham o1, SanPham o2) {
                return o1.ngaySX.compareTo(o2.ngaySX);
            }
        });
    }

    //! sap xep theo gia ban va ngay san xuat
    public static void sapXepTheoGiaBanVaNgaySanXuat(ArrayList<SanPham> listSanPham) {
        Collections.sort(listSanPham, new Comparator<SanPham>() {
            @Override
            public int compare(SanPham o1, SanPham o2) {
                int compareGiaBan = Double.compare(o1.giaBan, o2.giaBan);
                if (compareGiaBan != 0) {
                    return compareGiaBan;
                } else {
                    return o1.ngaySX.compareTo(o2.ngaySX);
                }
            }
        });
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "ten='" + ten + '\'' +
                ", ma='" + ma + '\'' +
                ", giaBan=" + giaBan +
                ", ngaySX='" + ngaySX + '\'' +
                '}';
    }

    public static void main(String[] args) {
        System.out.println("Nhap so luong san pham: ");
        int x = new Scanner(System.in).nextInt();
        ArrayList<SanPham> listSanPham = new ArrayList<>();
        for (int i = 0; i < x; i++) {
            System.out.println();
            SanPham sp = new SanPham();
            System.out.println("Thong tin san pham thu : " + i);
            System.out.println("Nhap vao ten san pham: ");
            sp.ten = new Scanner(System.in).nextLine();
            System.out.println("Nhap vao ma san pham: ");
            sp.ma = new Scanner(System.in).nextLine();
            System.out.println("Nhap vao gia ban: ");
            sp.giaBan = new Scanner(System.in).nextDouble();
            System.out.println("Nhap vao ngay san xuat: ");
            sp.ngaySX = new Scanner(System.in).nextLine();
            listSanPham.add(sp);
        }
        System.out.println("sap xep theo ten");
       sapXepTheoTen(listSanPham);
        for (SanPham sp : listSanPham) {
            System.out.println(sp);
        }
        System.out.println("sap xep theo gia ban");
        sapXepTheoGiaBan(listSanPham);
        for (SanPham sp : listSanPham) {
            System.out.println(sp);
        }
        System.out.println("sap xep theo ngay san xuat");
        sapXepTheoNgaySanXuat(listSanPham);
        for (SanPham sp : listSanPham) {
            System.out.println(sp);
        }
        System.out.println("sap xep theo gia ban va ngay san xuat");
        sapXepTheoGiaBanVaNgaySanXuat(listSanPham);
        for (SanPham sp : listSanPham) {
            System.out.println(sp);
        }
    }
}
