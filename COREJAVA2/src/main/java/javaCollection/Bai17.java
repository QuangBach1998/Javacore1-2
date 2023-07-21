package javaCollection;

import java.util.HashSet;
import java.util.Scanner;

public class Bai17 {
    public static void main(String[] args) {
        System.out.println("Nhap vao so luong hashSet: ");
        HashSet<String> hashSet = new HashSet<>();
        int x = new Scanner(System.in).nextInt();
        System.out.println("Nhap vao cac phan tu hashset 1: ");
        for (int i = 0; i < x; i++) {
            hashSet.add(new Scanner(System.in).nextLine());
        }
        System.out.println("Cac phan tu trong hashSet duy nhat: ");
        System.out.println(hashSet);
    }
}
