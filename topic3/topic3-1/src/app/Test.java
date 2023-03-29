package app;

import java.util.Arrays;

public class Test {
    
    /** 
     * Test Driver to check the equality of a few Person objects.
     * @param args Program arguments
     */
    public static void main(String[] args) {
        /* 
        Person person1 = new Person("Jesse", "Dalton");
        Person person2 = new Person("Jesse", "Dalton");
        Person person3 = new Person(person1);

        System.out.println();
        System.out.print("P1 and P2 are ");
        if (person1 == person2) {
            System.out.print("identical");
        } else {
            System.out.print("not identical");
        }
        System.out.println(" by ==");

        System.out.print("P1 and P2 are ");
        if (person1.equals(person2)) {
            System.out.print("identical");
        } else {
            System.out.print("not identical");
        }
        System.out.println(" by equals()");

        System.out.print("P1 and P3 are ");
        if (person1.equals(person3)) {
            System.out.print("identical");
        } else {
            System.out.print("not identical");
        }
        System.out.println(" by equals()");

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);

        person1.walk();
        person1.run();
        System.out.println("Person 1 is running: " + person1.isRunning());
        person1.walk();
        System.out.println("Person 1 is running: " + person1.isRunning());
        */

        Person[] persons = new Person[4];
        persons[0] = new Person("Robert", "Plant", 20);
        persons[1] = new Person("Jimmy", "Page", 80);
        persons[2] = new Person("John Paul", "Jones", 7);
        persons[3] = new Person("John", "Bonham", 24);
        
        Arrays.sort(persons);
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
        }

    }
}
