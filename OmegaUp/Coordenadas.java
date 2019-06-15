import java.util.Scanner;
public class Coordenadas {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double x = Double.parseDouble(scanner.nextLine());
    double y = Double.parseDouble(scanner.nextLine());
    if (x == 0 && y == 0) {
      System.out.println("Origem");
    }
    else if (x == 0 && y != 0) {
      System.out.println("Eixo Y");
    }
    else if (x != 0 && y == 0) {
      System.out.println("Eixo X");
    }
    else if (x > 0 && y > 0) {
      System.out.println("Q1");
    }
    else if (x < 0 && y > 0) {
      System.out.println("Q2");
    }
    else if (x < 0 && y < 0) {
      System.out.println("Q3");
    }
    else if (x > 0 && y < 0) {
      System.out.println("Q4");
    }
  }
}
