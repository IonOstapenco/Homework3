package homework3;

/*1. Scrieți un program Java ce va returna 3 caractere din
următorul șir: Programare Java!
Output:
Șirul inițial: Programare Java!
Caracterul de la poziția 0 este #
Caracterul de la poziția 5 este #
Ultimul caracter al șirului este #*/
public class Exercitiu1 {
    public static void main(String[] args) {
        String sir = "Programare Java!";
        char ultimulCaracter = sir.charAt(sir.length() - 1);
        System.out.println("Sirul initial: " + sir);
        System.out.println("Caracterul de la pozitia 0 este " + sir.charAt(0));
        System.out.println("Caracterul de la pozitia 5 este " + sir.charAt(5));
        System.out.println("Ultimul caracter al sirului este " + ultimulCaracter);
    }
}
