import java.util.Scanner;
public class Excursion {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int p = scanner.nextInt();
    int[] camiones = new int[n];
    for (int i = 0; i < n; i++) {
      camiones[i] = scanner.nextInt();
    }
    int[] posicion = new int[p];
    for (int i = 0; i < p; i++) {
      posicion[i] = scanner.nextInt();
      System.out.println(camiones[posicion[i]-1]);
    }
    /*for (int i = 0; i < p; i++) {
      System.out.println(camiones[posicion[i]-1]);
    }*/
  }
}
