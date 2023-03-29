package app;

public class Person {
    private String firstName;
    private String lastName;

    /**
     * Paramaterized constructor.
     * @param firstName Person's first name.
     * @param lastName Person's last name.
     */
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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
        return getClass() + ": " + firstName + " " + lastName;
    }
}
