package level2;

import java.util.Scanner;

public class B2_1 {
    public static void main(String[] args) {
        System.out.println("Nhap vao so luong chu so: ");
        int x = new Scanner(System.in).nextInt();
        System.out.println("Nhap vao danh sach cac so: ");
        int arrNumber[] = new int[x];
        for (int i = 0; i < arrNumber.length ; i++) {
            arrNumber[i] = new Scanner(System.in).nextInt();
        }

        //! duyet mang, tim so lon nhat dau tien
        int max1 = arrNumber[0];
        for (int i = 0; i < arrNumber.length ; i++) {
            if (max1<arrNumber[i]){
                max1 = arrNumber[i];
            }
        }
        System.out.println("So lon nhat la: "+max1);

        //! duyet mang, tim so lon thu hai
        int max2 = arrNumber[0];
        for (int i = 0; i <arrNumber.length ; i++) {
            if (max2<arrNumber[i]&& max2>max1){
                max2 = arrNumber[i];
            }
        }
        System.out.println("so lon thu 2 la: "+ max2);
    }
}
