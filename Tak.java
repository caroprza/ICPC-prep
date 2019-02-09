import java.util.Scanner;
public class Tak {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int f = scanner.nextInt();
    int d = 0;
    while ((f-1)%11 != 0) {
      f *= 2;
      d++;
    }
    System.out.println(d + " " + f);
  }
}
