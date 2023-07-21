package javaCollection;

import java.util.ArrayList;

public class Bai1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();

        //! them phan tu
        arrayList1.add(20);
        arrayList1.add(12);
        arrayList1.add(98);
        arrayList1.add(27);
        arrayList1.add(5);

        //! hien thi arraylist
        System.out.println("cac phan tu trong arraylist: " + arrayList1);

        //! tinh tong cac phan tu
        int ketQua = 0;
        for (int i = 0; i < arrayList1.size(); i++) {
            ketQua += arrayList1.get(i);
        }
        System.out.println("tong cac phan tu trong arraylist" + ketQua);

        //! tim gia tri lon nhat va nho nhat
        int max = arrayList1.get(0);
        for (int i = 0; i < arrayList1.size(); i++) {
            if (max < arrayList1.get(i)) {
                max = arrayList1.get(i);
            }
        }
        int min = arrayList1.get(0);
        for (int i = 0; i < arrayList1.size(); i++) {
            if (min > arrayList1.get(i)) {
                min = arrayList1.get(i);
            }
        }
        System.out.println("Gia tri lon nhat: " + max);
        System.out.println("Gia tri nho nhat: " + min);

        //! xoa phan tu cu the
        arrayList1.remove(4); // xoa phan tu co index = 4
        //! kiem tra phan tu co ton tai
        boolean check = arrayList1.contains(98);
        System.out.println(check);
    }
}
