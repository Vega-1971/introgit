package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMain {

    public static void main(String[] args) {
        List<String> l = new ArrayList<>();

        l.add("one");
        l.add("two");
        l.add("three");

        String s = l.toString();
        System.out.println(s);

        System.out.println(l);

        System.out.println(l.get(2));
        l.add("four");
        l.remove(0);

        System.out.println(l);

        System.out.println(l.size());

        System.out.println(l.contains("four"));

        System.out.println(l.indexOf("three"));

        System.out.println(l.indexOf("one"));

        l.clear();

        System.out.println(l);

        List<Integer> i_list = Arrays.asList(1, 2, 3);

        for (int i=0; i<i_list.size();i++) {

            System.out.println(i_list.get(i));
        }
        for (int i: i_list) {

            System.out.println(i);
        }
    }
}

