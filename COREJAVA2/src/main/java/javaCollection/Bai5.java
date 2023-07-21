package javaCollection;

import java.util.HashMap;

public class Bai5 {
    public static void main(String[] args) {
        int numbers[] = {2, 7, 11, 15};
        int target = 9;
        int ketqua[] = findSum(numbers, target);
        if (ketqua.length == 2) {
            System.out.println("Output: [" + ketqua[0] + ", " + ketqua[1] + "]");
        } else {
            System.out.println("khong tim thay");
        }
    }


    public static int[] findSum(int numbers[], int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int x = target - numbers[i];
            if (hashMap.containsKey(x)) {
                return new int[]{hashMap.get(x), i};
            }
            hashMap.put(numbers[i], i);
        }
        return new int[0];
    }
}
