import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int i = 0;
        int num = 0;

        System.out.println("Scrie un numar:");
        num = scanner.nextInt();

        while (i <= num) {
            sum += i;
            i++;
        }
        System.out.println("Suma este: " + sum);
    }
}