import java.util.Scanner;
import java.lang.Math;
public class Estadistica {
  public static int min(int[] lista) {
    int menor = lista[0];
    for (int i = 0; i < lista.length; i++) {
      if (lista[i] < menor) {
        menor = lista[i];
      }
    }
    return menor;
  }
  public static int max(int[] lista) {
    int mayor = lista[0];
    for (int i = 0; i < lista.length; i++) {
      if (lista[i] > mayor) {
        mayor = lista[i];
      }
    }
    return mayor;
  }
  public static int media(int[] lista) {
    int suma = 0;
    for (int i = 0; i < lista.length; i++) {
      suma += lista[i];
    }
    double total = (suma*1.0)/lista.length;
    return (int)(Math.floor(total));
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] l = new int[n];
    for (int i = 0; i < n; i++) {
      l[i] = scanner.nextInt();
    }
    System.out.println(min(l) + " " + max(l) + " " + media(l));
  }
}
