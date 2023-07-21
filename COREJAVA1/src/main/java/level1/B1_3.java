package level1;

import java.util.Scanner;

public class B1_3 {
    public static void main(String[] args) {
        System.out.println("Nhap vao 1 so: ");
        int x = new Scanner(System.in).nextInt();
        System.out.println("Binh phuong so vua nhap la: " + Math.pow(x, 2));
    }
}
