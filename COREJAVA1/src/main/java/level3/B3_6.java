package level3;

import java.util.Arrays;
import java.util.Scanner;

public class B3_6 {
    public static void main(String[] args) {
        System.out.println("nhap vao so luong chu so cua mang 1: ");
        int x = new Scanner(System.in).nextInt();
        System.out.println("Nhap vao danh sach chu so cua mang 1: ");
        int arr1[] = new int[x];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = new Scanner(System.in).nextInt();
        }

        System.out.println("nhap vao so luong chu so cua mang 2: ");
        int y = new Scanner(System.in).nextInt();
        System.out.println("Nhap vao danh sach chu so cua mang 1: ");
        int arr2[] = new int[y];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = new Scanner(System.in).nextInt();
        }

        int newArr[] = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, newArr, 0, arr1.length);
        System.arraycopy(arr2, 0, newArr, arr1.length, arr2.length);
        System.out.println("Mang sau khi gop: "+Arrays.toString(newArr));
        int newLength = newArr.length;

        if (newLength%2!=0){
            System.out.println("So trung vi can tim: "+ newArr[(newArr.length-1)/2]);
        } else if (newLength%2==0) {
            System.out.println("So trung vi can tim: "+ (newArr[(newArr.length/2)-1]+newArr[(newArr.length/2)])/2);
        }

    }
}
