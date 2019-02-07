import java.util.Scanner;
public class Salary {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int id = Integer.parseInt(scanner.nextLine());
    int hours = Integer.parseInt(scanner.nextLine());
    double money = Double.parseDouble(scanner.nextLine());
    double salary = money * hours;
    System.out.println("NUMBER = " + id);
    System.out.println("SALARY = U$ " + String.format("%.2f", salary));
  }
}
