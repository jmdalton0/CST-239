package app;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class PlayList {

    public static void main(String[] args) {
        System.out.println();

        List<Integer> numList = new ArrayList<Integer>();
        numList.add(Integer.valueOf(1));
        numList.add(Integer.valueOf(2));
        numList.add(Integer.valueOf(3));
        numList.add(Integer.valueOf(4));
        numList.add(Integer.valueOf(5));

        List<String> stringList = new ArrayList<String>();
        stringList.add("violin");
        stringList.add("viola");
        stringList.add("cello");
        stringList.add("bass");
        stringList.add("harp");

        System.out.println("numList[0] = " + numList.get(0));
        System.out.println("stringList[0] = " + stringList.get(0));

        for (Integer num : numList) {
            System.out.println("numList element = " + num);
        }

        Iterator<String> it = stringList.iterator();
        while(it.hasNext()) {
            System.out.println("stringList element = " + it.next());
        }
    }

}
