import java.util.Scanner;

public class Exercise4 {
    public static boolean isPrime(int num){
        boolean primeCheck = true;
        for (int i = 2; i < num - 1; i++){
            if (num % i == 0){
                primeCheck = false;
                break;
            }
        }
        return primeCheck;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean primeNumCheck = isPrime(number);
        if (!primeNumCheck){
            System.out.println("The number is not a prime number.");
        } else {
            System.out.println("The number is a prime number.");
        }
    }

}
