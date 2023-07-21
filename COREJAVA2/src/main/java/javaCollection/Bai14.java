package javaCollection;

import java.util.HashSet;
import java.util.Scanner;

public class Bai14 {
    public static void main(String[] args) {
        System.out.println("Nhap vao so luong hashSet1: ");
        HashSet<Integer> hashSet1 = new HashSet<>();
        int x = new Scanner(System.in).nextInt();
        System.out.println("Nhap vao cac phan tu hashset 1: ");
        for (int i = 0; i < x; i++) {
            hashSet1.add(new Scanner(System.in).nextInt());
        }
        System.out.println("Cac phan tu trong hashSet1: ");
        System.out.println(hashSet1);
        System.out.println("Nhap vao so luong hashSet2: ");
        HashSet<Integer> hashSet2 = new HashSet<>();
        int y = new Scanner(System.in).nextInt();
        System.out.println("Nhap vao cac phan tu hashset 1: ");
        for (int i = 0; i < y; i++) {
            hashSet2.add(new Scanner(System.in).nextInt());
        }
        System.out.println("Cac phan tu trong hashSet2: ");
        System.out.println(hashSet2);


        HashSet<Integer> trungLap = new HashSet<>();
        for (int num : hashSet1) {
            if (hashSet2.contains(num)) {
                trungLap.add(num);
            }
        }
        System.out.println("phan tu trung lap la: ");
        System.out.println(trungLap);

    }
}
