package javaCollection;

import java.util.HashMap;

public class Bai7 {
    public static void main(String[] args) {
        HashMap<String, Double[]> bangDiem = new HashMap<>();
        bangDiem.put("Bach", new Double[]{9.5, 8.25, 5.0});
        bangDiem.put("Oanh", new Double[]{9.0, 7.25, 6.75});
        bangDiem.put("Trinh", new Double[]{7.5, 6.0, 5.25});
        bangDiem.put("Mai", new Double[]{9.75, 7.5, 7.25});
        bangDiem.put("Phuong", new Double[]{8.5, 7.5, 5.5});
        for (String tenSinhVien : bangDiem.keySet()) {
            Double[] diem = bangDiem.get(tenSinhVien);
            double diemTB = 0;
            for (double d : diem) {
                diemTB += d;
            }
            diemTB /= diem.length;
            System.out.println("diem TB cua " + tenSinhVien + " la " + Math.round(diemTB * 100.0) / 100.0);
        }
    }
}
