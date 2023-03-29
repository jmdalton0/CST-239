package app;

/**
 * Person class represents a person with a name, age, height, and weight
 * 
 * @author jmdalton0
 */
public class Person {

    private String name;
    private int age;
    private int height;
    private int weight;

    /**
     * Main method to test the public functions.
     * @param args
     * @return void
     */
    public static void main(String[] args) {
        Person person = new Person("Jesse", 26, 72, 170);
        person.walk(5);
        person.talk("Hello");
    }

    /**
     * Default Constructor.
     * @returns new Person object
     */
    public Person() {
        this.name = "";
        this.age = 0;
        this.height = 0;
        this.weight = 0;
    }

    /**
     * Paramaterized Constructor
     * @returns new Person object
     * @param name
     * @param age
     * @param height
     * @param weight
     */
    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    /**
     * Get name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Get age
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * Get height
     * @return height
     */
    public int getHeight() {
        return height;
    }

    /**
     * Get weight
     * @return weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Set name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Set age
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Set height
     * @param height
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Set weight
     * @param weight
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * Walk the person a certain number of miles
     * @param miles the number of miles
     * @return void
     */
    public void walk(int miles) {
        System.out.println(this.name + " walked " + miles + " miles.");
    }

    /**
     * Cause the person to speak a message
     * @param message the message
     * @return void
     */
    public void talk(String message) {
        System.out.println(this.name + " said \"" + message + ".\"");
    }
}