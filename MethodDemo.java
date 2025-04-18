public class MethodDemo {
    public static void main(String[] args) {

public static void greet() {

 }
public static void greet() {
   System.out.println("Hello from the greet method!"); 
}
public static void main(String[] args) {
   greet(); // Calling the greet method
}
public class MethodDemo {
    //... (main and greet methods)...

    public static void printMessage(String message) {

    }
}
public class MethodDemo {
    //... (other methods)...

    public static void printMessage(String message) {
        System.out.println(message);
    }
}
public class MethodDemo {
    public static void main(String[] args) {
        greet();
        printMessage("This is my message!");
    }

    //... (other methods)...
}
    }
}