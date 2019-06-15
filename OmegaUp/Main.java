import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double A = Double.parseDouble(scanner.nextLine());
		double B = Double.parseDouble(scanner.nextLine());
		double C = Double.parseDouble(scanner.nextLine());
		double MEDIA = ((A*2/10) + (B*3/10) + (C*5/10));
		System.out.println("MEDIA = " + String.format("%.1f", MEDIA));
	}
}