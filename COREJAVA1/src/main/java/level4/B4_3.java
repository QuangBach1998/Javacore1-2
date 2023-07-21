package level4;

import java.util.Scanner;

public class B4_3 {
    public static void main(String[] args) {
        System.out.println("nhap vao so luong chuoi trong danh sach: ");
        int n = new Scanner(System.in).nextInt();
        System.out.println("Nhap vao cac chuoi: ");
        String arrStr[] = new String[n];
        for (int i = 0; i < arrStr.length; i++) {
            arrStr[i] = new Scanner(System.in).nextLine();
        }
        //! tim chuoi ngan nhat:
        String minStr = arrStr[0];
        for (String s : arrStr) {
            if (s.length() < minStr.length()) {
                minStr = s;
            }
        }
        System.out.println(minStr);
        //! tim do dai chuoi con chung dai nhat
        int maxLength = 0;
        for (int i = 0; i < minStr.length(); i++) {
            for (int j = i + 1; j <= minStr.length(); j++) {
                String substring = minStr.substring(i, j);
                boolean findString = true;

                for (String s : arrStr) {
                    if (!s.contains(substring)) {
                        findString = false;
                        break;
                    }
                }

                if (findString) {
                    maxLength = Math.max(maxLength, substring.length());
                }
            }
        }
        System.out.println(maxLength);
    }
}
