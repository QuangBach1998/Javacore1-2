package level3;

import java.util.Scanner;

public class B3_1 {
    public static void main(String[] args) {
        System.out.println("Nhap vao so luong chu so : ");
        int x = new Scanner(System.in).nextInt();
        System.out.println("Nhap vao danh sach cac so : ");
        int arrNum[] = new int[x];
        for (int i = 0; i < arrNum.length; i++) {
            arrNum[i] = new Scanner(System.in).nextInt();
        }
        //! tim so nho nhat
        int min1 = arrNum[0];
        for (int i = 0; i < arrNum.length; i++) {
            if (min1 > arrNum[i]) {
                min1 = arrNum[i];
            }
        }
        System.out.println("So nho nhat la: " + min1);
        //! tim so nho thu hai
        int min2 = arrNum[0];
        for (int i = 0; i < arrNum.length; i++) {
            if (min2 > arrNum[i] && min2 < min1) {
                min2 = arrNum[i];
            }
        }
        System.out.println("so nho thu hai la: " + min2);
    }
}
