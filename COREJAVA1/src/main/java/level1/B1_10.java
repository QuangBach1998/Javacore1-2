package level1;

import java.util.Scanner;

public class B1_10 {
    public static void main(String[] args) {
        System.out.println("Nhap vao so luong chuoi: ");
        int x = new Scanner(System.in).nextInt();
        System.out.println("Nhap vao danh sach cac chuoi: ");
        String arrString[] = new String[x];
        for (int i = 0; i < arrString.length ; i++) {
            arrString[i] = new Scanner(System.in).nextLine();
        }

        int count = 0;
        for (int i = 0; i < arrString.length ; i++) {
            if (arrString[i].contains("a")){
                count+=1;
            }
        }
        System.out.println("So luong chuoi chua ky tu a: "+count);

    }
}
