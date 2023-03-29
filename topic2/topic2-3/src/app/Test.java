package app;

public class Test {
    
    /** 
     * Test Driver to check the equality of a few Person objects.
     * @param args Program arguments
     */
    public static void main(String[] args) {
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
    }
}
