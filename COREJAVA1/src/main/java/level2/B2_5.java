package level2;

import java.util.Scanner;

public class B2_5 {
    public static void main(String[] args) {
        System.out.println("Nhap vao so luong chu so: ");
        int x = new Scanner(System.in).nextInt();
        System.out.println("Nhap vao danh sach cac so: ");
        int arrNumber[] = new int[x];
        for (int i = 0; i < arrNumber.length ; i++) {
            arrNumber[i] = new Scanner(System.in).nextInt();
        }

        int ketQua = Integer.MIN_VALUE;
        int now = 0;
        for (int element:arrNumber) {
            now = Math.max(element,element+now);
            ketQua =Math.max(ketQua,now);
        }
        System.out.println("Tong lon nhat cua mang con lien ke: "+ketQua);
    }
}
