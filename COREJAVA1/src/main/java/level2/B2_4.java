package level2;

import java.util.Scanner;

public class B2_4 {
    public static void main(String[] args) {
        System.out.println("nhap vao so luong chu so: ");
        int x = new Scanner(System.in).nextInt();
        System.out.println("Nhap vao danh sach cac so: ");
        int arrNumber[] = new int[x];
        for (int i = 0; i <arrNumber.length ; i++) {
            arrNumber[i] = new Scanner(System.in).nextInt();
        }
        int ketQua = 0;
        for (int i = 0; i < arrNumber.length ; i++) {
            if (arrNumber[i]%3==0&& arrNumber[i]%5==0){
                ketQua+= arrNumber[i];
            }
        }
        System.out.println("tong cac so chia het cho ca 3 va 5 : "+ ketQua);
    }
}
