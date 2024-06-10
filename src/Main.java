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
        System.out.println("Ist Quadrat: " + (isSquare ? "Ja" : "Nein"));

        Dreieck d1 = new Dreieck();
        double a = 5.0;
        double b = 5.0;
        double c = 5.0;

        double flaeche = d1.berechneFlaeche(a, b, c);
        double umfang = d1.berechneUmfang(a, b, c);
        boolean gleichseitig = d1.istGleichseitig(a, b, c);

        System.out.println("Seitenlängen: a = " + a + ", b = " + b + ", c = " + c);
        System.out.println("Fläche: " + flaeche);
        System.out.println("Umfang: " + umfang);
        System.out.println("Ist gleichseitig: " + (gleichseitig ? "Ja" : "Nein"));

        // Eingabe des Radius des Kreises
        System.out.print("Geben Sie den Radius des Kreises ein: ");
        double radius = scanner.nextDouble();

        // Aufruf der Funktionen und Ausgabe der Ergebnisse für den Kreis
        double circleArea = calculateCircleArea(radius);
        double circumference = calculateCircumference(radius);
        boolean isPositive = isPositiveRadius(radius);

        System.out.println("Radius: " + radius);
        System.out.println("Kreisfläche: " + circleArea);
        System.out.println("Umfang: " + circumference);
        System.out.println("Ist der Radius positiv: " + (isPositive ? "Ja" : "Nein"));

        scanner.close();
    }

    // Funktion zur Berechnung der Fläche des Rechtecks
    public static double calculateArea(double width, double height) {
        return width * height;
    }

    // Funktion zur Berechnung des Umfangs des Rechtecks
    public static double calculatePerimeter(double width, double height) {
        return 2 * (width + height);
    }

    // Funktion zur Überprüfung, ob das Rechteck ein Quadrat ist
    public static boolean isSquare(double width, double height) {
        return width == height;
    }

    // Funktion zur Berechnung der Fläche des Kreises
    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Funktion zur Berechnung des Umfangs des Kreises
    public static double calculateCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    // Funktion zur Überprüfung, ob der Radius positiv ist
    public static boolean isPositiveRadius(double radius) {
        return radius > 0;
    }
}

class Dreieck {

    // Funktion zur Berechnung der Fläche eines Dreiecks mit Herons Formel
    public double berechneFlaeche(double a, double b, double c) {
        double s = (a + b + c) / 2; // Halbperimeter
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    // Funktion zur Berechnung des Umfangs eines Dreiecks
    public double berechneUmfang(double a, double b, double c) {
        return a + b + c;
    }

    // Funktion zur Überprüfung, ob ein Dreieck gleichseitig ist
    public boolean istGleichseitig(double a, double b, double c) {
        return a == b && b == c;
    }
}
