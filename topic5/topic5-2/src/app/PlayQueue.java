package app;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class PlayQueue {

    public static void main(String[] args) {
        System.out.println();

        Queue<Integer> intQ = new LinkedList<Integer>();
        intQ.add(1);
        intQ.add(2);
        intQ.add(3);
        intQ.add(4);
        intQ.add(5);

        Queue<String> stringQ = new LinkedList<String>();
        stringQ.add("one");
        stringQ.add("two");
        stringQ.add("three");
        stringQ.add("four");
        stringQ.add("five");

        System.out.println("intQ size is " + intQ.size());
        System.out.println("stringQ size is " + stringQ.size());

        System.out.println("intQ head is " + intQ.peek());
        System.out.println("stringQ head is " + stringQ.peek());

        System.out.println("intQ = " + intQ.toString());
        
        Iterator<String> it = stringQ.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }

}
