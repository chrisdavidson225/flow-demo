```java
public class HelloWorld {
    private String message;

    public HelloWorld() {
        this.message = "Hello, World its Friday tomorrow!";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        System.out.println(helloWorld.getMessage());
    }
}
```