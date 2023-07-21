package level3;

import java.util.Random;
import java.util.Scanner;

public class B3_2 {
    public static void main(String[] args) {
        System.out.println("Nhap vao so luong so nguyen: ");
        int x = new Scanner(System.in).nextInt();
        System.out.println("Nhap vao danh sach cac so nguyen: ");
        int arrNum[] = new int[x];
        for (int i = 0; i < arrNum.length; i++) {
            arrNum[i] = new Scanner(System.in).nextInt();
        }
        //! hieu lon nhat = so lon nhat - so nho nhat
        //! tim so lon nhat va nho nhat
        int max = arrNum[0];
        int min = arrNum[0];
        for (int i = 0; i < arrNum.length; i++) {
            if (max < arrNum[i]) {
                max = arrNum[i];
            }
            if (min > arrNum[i]) {
                min = arrNum[i];
            }
        }
        System.out.println("hieu lon nhat can tim la : " + max + " - " + min +" = "+ (max - min));
    }
}
