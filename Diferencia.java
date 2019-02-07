import java.util.Scanner;
public class Diferencia {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int A = Integer.parseInt(scanner.nextLine());
    int B = Integer.parseInt(scanner.nextLine());
    int C = Integer.parseInt(scanner.nextLine());
    int D = Integer.parseInt(scanner.nextLine());
    int DIFERENCA = A * B - C * D;
    System.out.println("DIFERENCA = " + DIFERENCA);
  }
}
