import java.util.Scanner;

public class Exercise3 {
    public static boolean isEven (int num){
        boolean even;
        if (num % 2 == 0){
            even = true;
        } else {
            even = false;
        }
        return even;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean result = isEven(number);
        System.out.println("Is the number even?" +result);
    }
}
