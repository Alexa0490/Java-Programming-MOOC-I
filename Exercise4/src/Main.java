import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a % 3 == 0) {
            System.out.println(a + " este divizibil cu 3.");
        } else {
            System.out.println(a + " nu este divizibil cu 3.");
        }

        if (a % 5 == 0) {
            System.out.println(a + " este divizibil cu 5.");
        } else {
            System.out.println(a + " nu este divizibil cu 5.");
        }
    }
}

