package level4;

import java.util.Scanner;

public class B4_1 {
    public static void main(String[] args) {
        System.out.println("Nhap vao so luong phan tu: ");
        int x = new Scanner(System.in).nextInt();
        System.out.println("Nhap vao tung phan tu trong danh sach");
        int arr[] = new int[x];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Scanner(System.in).nextInt();
        }

        int n = arr.length;
        int count = 0;


        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    count++;
                }
            }
        }
        System.out.println("So lan dem duoc la : " + count);
    }
}
