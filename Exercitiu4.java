package homework3;

/*4.Aveți următorul șir:
"AbraCadabra"
Creați un program ce va returna la output în două rânduri
diferite acest string. Primul cu majuscule, al doilea cu litere
mici.*/
public class Exercitiu4 {
    public static void main(String[] args) {
        String word = "AbraCadabra";
        System.out.println("Cuvant initial " + word);
        System.out.println("Registru la majuscule " + word.toUpperCase());
        System.out.println("Registru la minuscule " + word.toLowerCase());
    }
}
