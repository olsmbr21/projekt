public class dreieck {

    // Funktion zur Berechnung der Fläche eines Dreiecks mit Herons Formel
    public static double berechneFlaeche(double a, double b, double c) {
        double s = (a + b + c) / 2; // Halbperimeter
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    // Funktion zur Berechnung des Umfangs eines Dreiecks
    public static double berechneUmfang(double a, double b, double c) {
        return a + b + c;
    }

    // Funktion zur Überprüfung, ob ein Dreieck gleichseitig ist
    public static boolean istGleichseitig(double a, double b, double c) {
        return a == b && b == c;
    }
}