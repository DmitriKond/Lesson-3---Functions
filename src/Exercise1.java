import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        int num3;

        System.out.println("Enter the first number");
        num1 = scanner.nextInt();
        System.out.println("Enter the second number");
        num2 = scanner.nextInt();
        System.out.println("Enter the last number");
        num3 = scanner.nextInt();
        biggestNum(num1, num2, num3);
    }

    public static void biggestNum(int num1, int num2, int num3){
        if (num1 > num2){
            if (num1 > num3){
                System.out.println(num1);
            } else {
                System.out.println(num3);
            }
        }
        if (num2 > num1) {
            if (num2 > num3) {
                System.out.println(num2);
            } else {
                System.out.println(num3);
            }
        } else {
            System.out.println(num3);
        }
    }
}
