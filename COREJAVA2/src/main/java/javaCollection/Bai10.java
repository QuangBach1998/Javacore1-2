package javaCollection;

import java.util.HashMap;
import java.util.Map;

public class Bai10 {
    public static void main(String[] args) {
        HashMap<String, Double> danhSachDiem = new HashMap<>();
        danhSachDiem.put("Bach", 9.5);
        danhSachDiem.put("Oanh", 8.5);
        danhSachDiem.put("Trinh", 5.75);
        danhSachDiem.put("Mai", 7.0);
        danhSachDiem.put("Lan", 4.5);
        danhSachDiem.put("Hai", 3.5);
        for (Map.Entry<String, Double> entry : danhSachDiem.entrySet()) {
            if (entry.getValue() >= 8) {
                System.out.println(entry.getKey() + " dat diem cao (>= 8.0)");
            }
            if (entry.getValue() >= 5 && entry.getValue() < 8) {
                System.out.println(entry.getKey() + " dat diem trung binh (>= 5.0 và < 8.0)");
            }
            if (entry.getValue() < 5) {
                System.out.println(entry.getKey() + " truot (< 5.0)");
            }
        }
    }
}
