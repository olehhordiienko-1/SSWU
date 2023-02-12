package Collections.Treemap;

import java.util.*;

public class Handler {
    public static void main(String[] args) {
        TreeMap<String, String> tmss1 = new TreeMap<>();
        //     <key   ,  value>
        tmss1.put("NAME", "SERG");
        tmss1.put("ADDRESS", "MYRU");
        tmss1.put("AGE", "22");
        tmss1.put("MARK", "4.1");

        TreeMap<String, String> tmss2 = new TreeMap<>();
        //     <key   ,  value>
        tmss2.put("NAME", "MARY");
        tmss2.put("ADDRESS", "LISOVA");
        tmss2.put("AGE", "18");
        tmss2.put("MARK", "4.9");

        TreeMap<String, String> tmss3 = new TreeMap<>();
        //     <key   ,  value>
        tmss3.put("NAME", "LUCY");
        tmss3.put("ADDRESS", "LISOVA");
        tmss3.put("AGE", "20");
        tmss3.put("MARK", "4.8");

        TreeMap<String, String> tmss4 = new TreeMap<>();
        //     <key   ,  value>
        tmss4.put("NAME", "MAX");
        tmss4.put("ADDRESS", "SUMSKA");
        tmss4.put("AGE", "19");
        tmss4.put("MARK", "4.0");

        ArrayList<TreeMap<String, String>> altmss = new ArrayList<>();
        altmss.add(tmss1); altmss.add(tmss2); altmss.add(tmss3); altmss.add(tmss4);
        System.out.println(altmss);
        double markMax = Double.NEGATIVE_INFINITY;
        String nameMax = "";
        double tempMax = 0;
        for(TreeMap<String, String> temp : altmss) {
            tempMax = Double.parseDouble(temp.get("MARK"));
            if(tempMax > markMax) {
                markMax = tempMax;
                nameMax = temp.get("NAME");
            }
        }

        System.out.println(nameMax + markMax);
    }
}

// name address age mark    Hibernate   Student -> Entity
// Serg Myru    22  4.1     Student s1 = new Student("Serg", "Myru", 22, 4.1);
// Mary Lisova  18  4.9     Student s2 = new Student("Mary", "Lisova", 18, 4.9);
// Lucy Sadova  20  4.8     Student s3 = new Student("Lucy", "Sadova", 20, 4.8);
// Max  Sumska  19  4.0     Student s4 = new Student("Max", "Sumska", 19, 4.0);

class Student {
    String name, address;
    int age;
    double mark;

    public Student(String name, String address, int age, double mark) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.mark = mark;
    }
}