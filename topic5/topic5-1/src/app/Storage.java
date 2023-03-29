package app;

public class Storage<T> {

    private T s;

    public Storage() {
        s = null;
    }

    public Storage(T s) {
        this.s = s;
    }

    public T getData() {
        return s;
    }
    
    public static void main(String[] args) {
        System.out.println();
        Storage<String> s1 = new Storage<String>("Robert Plant");
        System.out.println("s1 = " + s1.getData());
        Storage<Integer> s2 = new Storage<Integer>(0);
        System.out.println("s2 = " + s2.getData());
    }

}