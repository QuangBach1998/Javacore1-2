package level3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class B3_5 {
    public static void main(String[] args) {
        System.out.println("Nhap vao so luong chu so: ");
        int x = new Scanner(System.in).nextInt();
        System.out.println("Nhap vao danh sach cac so: ");
        List<Integer> arrNum = new ArrayList<>();
        for (int i = 0; i < x; i++) {
            arrNum.add(new Scanner(System.in).nextInt());
        }
        Collections.sort(arrNum);
        int ketQua = 1;
        for (int i = 0; i < x && arrNum.get(i) <= ketQua; i++) {
            ketQua += arrNum.get(i);
        }
        System.out.println("ket qua: " + ketQua);
    }
}
