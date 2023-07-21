package javaCollection;

import java.util.HashMap;
import java.util.HashSet;

public class Bai3 {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap1 = new HashMap<>();
        //! them key value
        hashMap1.put("Bach",25);
        hashMap1.put("Oanh",22);
        hashMap1.put("Cuong",28);
        hashMap1.put("Trung",28);
        hashMap1.put("Trinh",22);
        //! hien thi danh sach ten(key cua hashmap)
        for (String key: hashMap1.keySet()){
            System.out.print(key+" ");
        }
        System.out.println();
        //! tim tuoi cua 1 nguoi dua vao ten (vi du: Bach)
        System.out.println("tuoi cua Bach: "+ hashMap1.get("Bach"));
        //! xoa 1 nguoi cu the khoi hashmap(vi du: Trung)
        hashMap1.remove("Trung");
        System.out.println("Danh sach sau khi xoa: ");
        for (String key: hashMap1.keySet()){
            System.out.print(key+" ");
        }
        System.out.println();
        //! kiem tra xem 1 nguoi co ton tai trong hashmap
        System.out.println(hashMap1.containsKey("Bach"));
    }
}
