import java.util.Scanner;

public class Exercise5 {
    public static boolean pythagorasTriplet(int num1, int num2, int num3){
        int sum = (num1 * num1) + (num2 * num2);
        boolean isPythagoras = false;
        if (sum == (num3 * num3)){
            isPythagoras = true;
        }
        return isPythagoras;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        boolean pythagorasCheck = pythagorasTriplet(number1, number2, number3);
        if (pythagorasCheck){
            System.out.println("The number is a Pythagoras triplet");
        } else {
            System.out.println("The number is not a Pythagoras triplet");
        }
    }
}
