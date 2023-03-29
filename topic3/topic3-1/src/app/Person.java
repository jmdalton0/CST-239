package app;

public class Person implements PersonInterface, Comparable<Person> {
    private String firstName;
    private String lastName;
    private boolean running;
    private int age;

    /**
     * Paramaterized constructor.
     * @param firstName Person's first name.
     * @param lastName Person's last name.
     */
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    /**
     * Clone Constructor
     * @param person Person object to clone.
     */
    public Person(Person person) {
        this.firstName = person.getFirstName();
        this.lastName = person.getLastName();
    }
    
    /** 
     * Returns the first name of the person.
     * @return String first name.
     */
    public String getFirstName() {
        return firstName;
    }
    
    /** 
     * Returns the last name of the person.
     * @return String last name.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Equals
     * @return boolean if the two objects are equal.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            System.out.println("obj is null");
            return false;
        } else if (obj == this) {
            System.out.println("obj == this");
            return true;
        } else if (getClass() != obj.getClass()) {
            System.out.println("obj is not of class Person");
            return false;
        } else {
            Person person = (Person)obj;
            if (
                this.firstName == person.getFirstName() &&
                this.lastName == person.getLastName()
            ) {
                return true;
            }
        }
        return false;
    }

    /** 
     * ToString
     * @return String person data.
     */
    @Override
    public String toString() {
        return firstName + " " + lastName + ", age " + age;
    }

    /**
     * Compare a person object to another person object by last name, then first name.
     * @param o Person to compare to.
     * @return 0 if the two Persons are equal. -1 if this object is less than o. 1 if this object is greater than o.
     */
    @Override
    public int compareTo(Person o) {
        return Integer.compare(this.age, o.age);
    }

    /**
     * Make a person walk.
     */
    @Override
    public void walk() {
        System.out.println("Person " + this + " is walking.");
        running = false;
    }

    /**
     * Make a person run.
     */
    @Override
    public void run() {
        System.out.println("Person " + this + " is running.");
        running = true;
    }

    /**
     * Check if a person is running.
     * @return True is the person is running. False otherwise.
     */
    @Override
    public boolean isRunning() {
        return running;
    }
}
