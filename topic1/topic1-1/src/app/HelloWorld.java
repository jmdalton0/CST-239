package app;

public class HelloWorld {
    public static void main(String[] args) {
        HelloWorld hello = new HelloWorld();
        hello.sayHello("Jesse");
    }

    private void sayHello(String name) {
        System.out.println("\n\nHello, my name is " + name);
    }
}
