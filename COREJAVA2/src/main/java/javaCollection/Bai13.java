package javaCollection;

import java.util.HashSet;
import java.util.Scanner;

public class Bai13 {
    public static void main(String[] args) {
        System.out.println("nhap vao so luong phan tu  cua mang: ");
        int x = new Scanner(System.in).nextInt();
        System.out.println("nhap vao cac phan tu: ");
        int arr[] = new int[x];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Scanner(System.in).nextInt();
        }

        HashSet<Integer> hashSet = new HashSet<>();
        HashSet<Integer> trungLap = new HashSet<>();
        for (int num : arr) {
            if (hashSet.contains(num)) {
                trungLap.add(num);
            } else {
                hashSet.add(num);
            }
        }
        System.out.println("Cac phan tu trung lap: ");
        for (int ptLap : trungLap) {
            System.out.print(ptLap + " ");
        }
    }
}
