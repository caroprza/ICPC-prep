import java.util.Scanner;
public class Tres {
  public static void multiplo(int[] l) {
    for (int i = 0; i < l.length; i++) {
      if (l[i] % 3 == 0) {
        System.out.print(i+1 + " ");
      }
    }
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] lista = new int[n];
    int num = 0;
    for (int i = 0; i < n; i++) {
      lista[i] = scanner.nextInt();
      if (lista[i] % 3 == 0) {
        num += 1;
      }
    }
    if (num == 0) {
      System.out.println("No hay triples.");
    }
    else {
      System.out.println(num);
    }
    multiplo(lista);
  }
}
