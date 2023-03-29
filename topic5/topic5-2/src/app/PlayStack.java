package app;

import java.util.Iterator;
import java.util.Stack;

public class PlayStack {

    public static void main(String[] args) {
        System.out.println();

        Stack<Integer> intStack = new Stack<Integer>();
        intStack.push(1);
        intStack.push(2);
        intStack.push(3);
        intStack.push(4);
        intStack.push(5);

        Stack<String> stringStack = new Stack<String>();
        stringStack.push("one");
        stringStack.push("two");
        stringStack.push("three");
        stringStack.push("four");
        stringStack.push("five");

        System.out.println("intStack size is " + intStack.size());
        System.out.println("stringStack size is " + stringStack.size());

        System.out.println("intStack[1] = " + intStack.elementAt(1));
        System.out.println("stringStack[1] = " + intStack.elementAt(1));

        System.out.println("intStack = " + intStack.toString());

        Iterator<String> it = stringStack.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
    
}
