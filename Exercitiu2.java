package homework3;

/*Arătați două metode (variante) pentru concatenarea
următoarelor două șiruri pentru a obține un singur șir
”Republica Moldova”:
String name1 = "Republica";
String name2 = "Moldova";*/
public class Exercitiu2 {
    public static void main(String[] args) {
        String name1 = "Republica ";
        String name2 = "Moldova";
        System.out.println(name1 + name2);
        System.out.println(name1.concat(name2));
    }
}
