package javaCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Bai4 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(12);
        arrayList.add(23);
        arrayList.add(34);
        arrayList.add(14);
        arrayList.add(46);
        arrayList.add(48);
        arrayList.add(31);
        System.out.println("Arraylist truoc khi sap xep: " + arrayList);
        //! sap xep tang:
        Collections.sort(arrayList);
        System.out.println("Arraylist sap xep tang: " + arrayList);
        //! sap xep giam
        Collections.sort(arrayList, Comparator.reverseOrder());
        System.out.println("Arraylist sap xep giam: " + arrayList);

    }
}
