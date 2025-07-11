import java.util.Scanner;

public class EvenOrOdd {
    public static void printNumbers(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (i % 3 != 0 && i % 5 != 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the start of the range: ");
        int start = scanner.nextInt();
        System.out.print("Enter the end of the range: ");
        int end = scanner.nextInt();

        System.out.println("Numbers between " + start + " and " + end + " not divisible by 3 or 5:");
        printNumbers(start, end);
    }
}
