// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Eingabe der Breite und Höhe des Rechtecks
        System.out.print("Geben Sie die Breite des Rechtecks ein: ");
        double width = scanner.nextDouble();

        System.out.print("Geben Sie die Höhe des Rechtecks ein: ");
        double height = scanner.nextDouble();

        // Aufruf der Funktionen und Ausgabe der Ergebnisse
        double area = calculateArea(width, height);
        double perimeter = calculatePerimeter(width, height);
        boolean isSquare = isSquare(width, height);

        System.out.println("Breite: " + width);
        System.out.println("Höhe: " + height);
        System.out.println("Fläche: " + area);
        System.out.println("Umfang: " + perimeter);
        System.out.println("Ist Quadrat: " + isSquare);
    }

    // Funktion zur Berechnung der Fläche
    public static double calculateArea(double width, double height) {
        return width * height;
    }

    // Funktion zur Berechnung des Umfangs
    public static double calculatePerimeter(double width, double height) {
        return 2 * (width + height);
    }

    // Funktion zur Überprüfung, ob das Rechteck ein Quadrat ist
    public static boolean isSquare(double width, double height) {
        return width == height;
    }
}