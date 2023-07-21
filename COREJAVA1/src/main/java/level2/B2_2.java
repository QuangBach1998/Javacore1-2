package level2;

import java.util.Scanner;

public class B2_2 {
    public static void main(String[] args) {
        System.out.println("Nhap vao so luong chuoi trong danh sach");
        int x = new Scanner(System.in).nextInt();
        System.out.println("Nhap vao danh sach cac chuoi");
        String arrString[] = new String[x];
        for (int i = 0; i < arrString.length; i++) {
            arrString[i] = new Scanner(System.in).nextLine();
        }

        String maxStr = arrString[0];
        for (int i = 0; i < arrString.length; i++) {
            if (maxStr.length() < arrString[i].length()) {
                maxStr = arrString[i];
            }
        }
        System.out.println("chuoi can tim la: "+maxStr);
    }
}
