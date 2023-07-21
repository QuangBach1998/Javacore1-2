package level4;

import java.util.Scanner;

public class B4_9 {
    public static void main(String[] args) {
        System.out.println("nhap vao so luong cac phan tu");
        int n = new Scanner(System.in).nextInt();
        System.out.println("nhap cac so vao danh sach");
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Scanner(System.in).nextInt();
        }
        int now = 1;
        int max = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] <= 1) {
                now++;
            } else {
                now = 1;
            }
            max = Math.max(now, max);
        }
        System.out.println(max);
    }
}
