import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

     Scanner scanner = new Scanner(System.in);

        System.out.println("Care este baza?");
        int num1 = scanner.nextInt();
        System.out.println("Care este exponentul?");
        int num2 = scanner.nextInt();
        int power = 1;

        while(num2 != 0) {
            power = power * num1;
            num2--;
        }

        System.out.println(power);
    }

}
