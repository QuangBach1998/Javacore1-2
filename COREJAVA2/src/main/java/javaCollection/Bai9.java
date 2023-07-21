package javaCollection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        System.out.println("Nhap vao doan van ban: ");
        String s = new Scanner(System.in).nextLine();
        String words[] = s.split("[\\s,.!?]+"); //! tách bằng khoảng trắng và ký tự dấu
        System.out.println(Arrays.toString(words));

        HashMap<String, Integer> wordHashMap = new HashMap<>();
        for (String word : words) {
            String lower = word.toLowerCase(); //!chuyen thanh chu thuong

            if (wordHashMap.containsKey(lower)) {
                int count = wordHashMap.get(lower);
                wordHashMap.put(lower, count + 1);
            } else {
                wordHashMap.put(lower, 1);
            }
        }
        System.out.println("Hien thi: ");
        for (Map.Entry<String, Integer> entry : wordHashMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
