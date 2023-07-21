package level3;

import java.util.Scanner;

public class B3_4 {
    public static void main(String[] args) {
        System.out.println("Nhap vao so luong chuoi: ");
        int x = new Scanner(System.in).nextInt();
        System.out.println("Nhap vao danh sach cac chuoi: ");
        String arrString[] = new String[x];
        for (int i = 0; i < arrString.length; i++) {
            arrString[i] = new Scanner(System.in).nextLine();
        }
        int count = 0;
        for (int i = 0; i < arrString.length - 1; i++) {
            for (int j = 0; j < arrString[i].length(); j++) {
                for (int k = 0; k < arrString[i + 1].length(); k++) {
                    if (arrString[i].charAt(j) == arrString[i + 1].charAt(k)) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
        //! sai
    }
}
