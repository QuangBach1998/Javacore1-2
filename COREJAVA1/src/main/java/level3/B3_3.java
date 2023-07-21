package level3;

import java.util.Scanner;

public class B3_3 {
    public static void main(String[] args) {
        System.out.println("Nhap vao so luong chu so: ");
        int x = new Scanner(System.in).nextInt();
        System.out.println("Nhap vao danh sach cac so: ");
        int arrNum[] = new int[x];
        for (int i = 0; i < arrNum.length; i++) {
            arrNum[i] = new Scanner(System.in).nextInt();
        }

        int newArr[] = new int[x];
        newArr[0] = 1;
        int max = 1;

        for (int i = 0; i <x ; i++) {
            newArr[i] = 1;
            for (int j = 0; j <i ; j++) {
                if (arrNum[i]>arrNum[j]){
                    newArr[i]=Math.max(newArr[i],newArr[j]+1);
                }
            }
            max =Math.max(max,newArr[i]);
        }
        System.out.println("Ket qua: "+max);
    }
}
