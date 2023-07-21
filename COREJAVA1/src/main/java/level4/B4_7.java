package level4;

import java.util.Arrays;
import java.util.Scanner;

public class B4_7 {
    public static void main(String[] args) {
        System.out.println("Nhập vào số lượng chuỗi: ");
        int x = new Scanner(System.in).nextInt();
        System.out.println("Nhập vào danh sách chuỗi: ");
        String arrString[] = new String[x];
        for (int i = 0; i < arrString.length; i++) {
            arrString[i] = new Scanner(System.in).nextLine();
        }

        sapXep(arrString);
        System.out.println("Danh sách sau khi sắp xếp:");
        System.out.println(Arrays.toString(arrString));
    }

    public static void sapXep(String[] arr) {
        Arrays.sort(arr, (a, b) -> {
            int distinctWordsA = countDistinctWords(a);
            int distinctWordsB = countDistinctWords(b);

            if (distinctWordsA == distinctWordsB) {
                return b.length() - a.length();
            }

            return distinctWordsB - distinctWordsA;
        });
    }

    public static int countDistinctWords(String str) {
        String[] words = str.split(" "); //! tach chuoi thanh mang
        return (int) Arrays.stream(words).distinct().count(); //! loai bo tu trung lap va dem
    }
}
