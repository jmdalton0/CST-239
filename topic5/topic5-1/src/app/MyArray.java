package app;

public class MyArray {

    public <E> void printArray(E[] inputArray) {
        for (E element : inputArray) {
            System.out.printf("%s ", element);
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'A', 'R', 'R', 'A', 'Y' };

        System.out.println();

        MyArray myArray = new MyArray();
        System.out.println("intArray:");
        myArray.printArray(intArray);
        System.out.println();

        System.out.println("doubleArray:");
        myArray.printArray(doubleArray);
        System.out.println();

        System.out.println("charArray:");
        myArray.printArray(charArray);
        System.out.println();
    }
    
}
