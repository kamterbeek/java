
public class HelloWorld {
    public static void main(String[] args) {
    
        System.out.println("Hello, Java world!");

        int number = 5;
        System.out.println("The number is: " + number);

        if (number > 3) {
            System.out.println("The number is greater than 3.");
        } else {
            System.out.println("The number is 3 or less.");
        }

        System.out.println("Counting from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }
}
