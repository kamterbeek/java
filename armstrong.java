public class ArmstrongNumber {

    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int n = String.valueOf(number).length();
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, n);
            number /= 10;
        }

        return sum == originalNumber;
    }

    public static void main(String[] args) {
        int testNumber = 153;
        System.out.println(testNumber + " is Armstrong? " + isArmstrong(testNumber));
    }
}
