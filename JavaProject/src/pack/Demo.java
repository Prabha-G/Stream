package pack;



@FunctionalInterface // only contains 1 method
interface MySam {
    void show();
}

class A implements MySam {
    public void show() {
        System.out.println("Hello World!");
    }
}

/**
 * Hello world!
 *
 */
public class Demo {
    public static void main(String[] args) {
        /*System.out.println("Hello World!");
        MySam m = new A();
        m.show();*/

        MySam m = () -> System.out.println("Hello World!"); // Lambda expression 
        m.show(); // Calling the show method
    }
}
