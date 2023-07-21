package level1;

import java.util.Arrays;
import java.util.Scanner;

public class B1_9 {
    public static void main(String[] args) {
        System.out.println("Nhap vao 1 chuoi: ");
        String s = new Scanner(System.in).nextLine();
        String arrString[] = s.split(" ");
        System.out.println("So luong tu cua chuoi: "+arrString.length);

    }
}
