import java.util.Scanner;

public class Exercise2 {
    public static double calcAverage(int num1, int num2, int num3){
        int sum = num1 + num2 + num3;
        return sum / 3.0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        double average = calcAverage(number1, number2, number3);
        System.out.println("The average is" +average);
    }
}
