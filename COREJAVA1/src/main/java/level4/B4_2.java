package level4;

import java.util.Scanner;

public class B4_2 {
    public static void main(String[] args) {
        System.out.println("nhap vao gia tri dich ");
        int y = new Scanner(System.in).nextInt();
        System.out.println("nhap vao so luong phan tu mang");
        int x = new Scanner(System.in).nextInt();
        System.out.println("nhap vao danh sach cac so nguyen ");
        int arr[] = new int[x];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Scanner(System.in).nextInt();
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == y) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
