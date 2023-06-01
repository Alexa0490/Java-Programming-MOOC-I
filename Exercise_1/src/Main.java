import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int x = sc.nextInt();

      for(x=2; x<=100; x=x+2) {
          System.out.println(x);
      }
    }
}