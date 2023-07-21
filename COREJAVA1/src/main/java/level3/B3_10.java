//package level3;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class B3_10 {
//    public static void main(String[] args) {
//        System.out.println("Nhap vao so luong chuoi trong danh sach: ");
//        int x = new Scanner(System.in).nextInt();
//        System.out.println("Nhap vao cac chuoi ");
//        String arrString[] = new String[x];
//        for (int i = 0; i <arrString.length ; i++) {
//            arrString[i] = new Scanner(System.in).nextLine();
//        }
//
//
//        int minLength = arrString[0].length();
//        for (int i = 0; i < arrString.length ; i++) {
//            if (minLength>arrString[i].length()){
//                arrString[0] = arrString[i];
//            }
//        }
//        System.out.println(Arrays.toString(arrString));
//
//    }
//}
