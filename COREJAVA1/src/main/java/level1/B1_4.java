package level1;

import java.util.Scanner;

public class B1_4 {
    public static void main(String[] args) {
        System.out.println("nhap vao so luong chu so: ");
        int x = new Scanner(System.in).nextInt();
        System.out.println("Nhap vao danh sach cac so: ");
        int y [] = new int[x];
        for (int i = 0; i <y.length; i++) {
            y[i] = new Scanner(System.in).nextInt();
        }
        int max = y[0];
        for (int i = 0; i <y.length ; i++) {
            if (max<y[i]){
                max = y[i];
            }
        }
        System.out.println("So lon nhat la: "+max);
    }
}
