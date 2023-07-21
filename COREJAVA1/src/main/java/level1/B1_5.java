package level1;

import java.util.Scanner;

public class B1_5 {
    public static void main(String[] args) {
        System.out.println("Nhap vao so luong chuoi");
        int x = new Scanner(System.in).nextInt();
        System.out.println("Nhap vao danh sach cac chuoi");
        String arrString[] = new String[x];

        for (int i = 0; i < arrString.length; i++) {
            arrString[i] = new Scanner(System.in).nextLine();
        }

        int arrMin = arrString[0].length();
        int count = 0;
        for (int i = 0; i <arrString.length ; i++) {
            if (arrMin>arrString[i].length()){
                arrMin = arrString[i].length();
                count =i;
            }
        }
        System.out.println("Chuoi can tim la: "+arrString[count]);
    }
}
