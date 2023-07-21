package level4;

import java.util.Arrays;
import java.util.Scanner;

public class B4_6 {
    public static void main(String[] args) {
        System.out.println("Nhap vao so luong phan tu: ");
        int x = new Scanner(System.in).nextInt();
        System.out.println("Nhap vao danh sach cac phan tu: ");
        int arr[] = new int[x];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Scanner(System.in).nextInt();
        }

        Arrays.sort(arr);

        int max = arr[x - 1] * arr[x - 2] * arr[x - 3];
        int max2 = arr[0] * arr[1] * arr[x - 1];

        int ketQua = Math.max(max,max2);
        System.out.println("tich lon nhat: "+ ketQua);
    }
}
