import java.util.Scanner;
public class Sequia {
  public static int llenar(int[] lista, int a) {
    int suma = 0;
    for (int i = 0; i < lista.length; i++) {
      suma += lista[i];
      if (suma >= a) {
        return i + 1;
      }
    }
    return 0;
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int c = scanner.nextInt();
    int[] pred = new int[n];
    for (int i = 0; i < n; i++) {
      pred[i] = scanner.nextInt();
    }
    System.out.println(llenar(pred, c));
  }
}
