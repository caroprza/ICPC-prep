import java.util.Scanner;
public class Utopian {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int h = 0;
    for (int i = 0; i <= n; i++) {
      if (i == 0) {
        h = 1;
      }
      else if (i % 2 == 0) {
        h++;
      }
      else if (i % 2 != 0) {
        h *= 2;
      }
      System.out.println(i + " " + h);
    }
  }
}
