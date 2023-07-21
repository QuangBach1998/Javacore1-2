package javaCollection;

import java.util.HashSet;
import java.util.Scanner;

public class Bai16 {
    public static void main(String[] args) {
        System.out.println("Nhap vao so luong hashSet: ");
        HashSet<Integer> hashSet = new HashSet<>();
        int x = new Scanner(System.in).nextInt();
        System.out.println("Nhap vao cac phan tu hashset 1: ");
        for (int i = 0; i < x; i++) {
            hashSet.add(new Scanner(System.in).nextInt());
        }
        System.out.println("Cac phan tu trong hashSet: ");
        System.out.println(hashSet);

        //! chuyen hashSet ve mang:
        Integer arr[] = new Integer[hashSet.size()];
        hashSet.toArray(arr);
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Phan tu lon nhat la: " + max);
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Phan tu lon nhat la: " + min);
    }
}
