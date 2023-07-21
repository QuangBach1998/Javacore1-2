package level1;

import java.util.Scanner;

public class B1_8 {
    public static void main(String[] args) {
        System.out.println("Nhap vao so luong chu so: ");
        int x = new Scanner(System.in).nextInt();
        System.out.println("Nhap vao danh sach cac so: ");
        int arr[] = new int[x];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = new Scanner(System.in).nextInt();
        }


        if (x%2!=0){
                System.out.println("So trung vi can tim: "+ arr[(arr.length-1)/2]);
        } else if (x%2==0) {
            System.out.println("So trung vi can tim: "+ (arr[(arr.length/2)-1]+arr[(arr.length/2)])/2);
        }

    }
}
