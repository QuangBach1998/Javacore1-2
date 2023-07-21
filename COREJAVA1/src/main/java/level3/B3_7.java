package level3;

import java.util.Arrays;
import java.util.Scanner;

public class B3_7 {
    public static void main(String[] args) {
        System.out.println("Nhap vao 1 chuoi ky tu: ");
        String x = new Scanner(System.in).nextLine();
        //! loai bo khoang trang, chuyen ve chu thuong
       String y = x.replaceAll(" ", "").toLowerCase();
        //! luu so lan xuat hien  tung ky tu
        int countChar[] = new int[26];
        for (char c : y.toCharArray()) {
            countChar[c - 'a']++;
        }
        //! xac dinh palindrome
        int palindRome = 0;
        boolean countFound = false;
        for (int count : countChar) {
            if (count % 2 == 0) {
                palindRome += count;
            } else {
                palindRome += count - 1;
                countFound = true;
            }
        }
        if (countFound) {
            palindRome += 1;
        }


        System.out.println(palindRome);
    }
}
