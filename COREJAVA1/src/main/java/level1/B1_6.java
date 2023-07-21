package level1;

import java.util.Arrays;
import java.util.Scanner;

public class B1_6 {
    public static void main(String[] args) {
        System.out.println("Nhap vao so luong chu so: ");
        int x = new Scanner(System.in).nextInt();
        System.out.println("Nhap vao danh sach cac so: ");
        int arr[] = new int[x];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = new Scanner(System.in).nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Mang sau khi sap xep tang: "+ Arrays.toString(arr));
    }
}
