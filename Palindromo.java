import java.util.Scanner;
public class Palindromo {
  public static String comprobar(String[] palabra) {
    int acum = 0;
    for (int i = 0; i < palabra.length; i++) {
      if (palabra[i].equals(palabra[palabra.length-i-1])) {
        acum += 1;
      }
    }
    if (acum == palabra.length) {
      return "Si";
    }
    else {
      return "No";
    }
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String p = scanner.nextLine();
    String[] pal = p.split("");
    System.out.println(comprobar(pal));
  }
}
