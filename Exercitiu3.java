package homework3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*3 Să ne aducem un pic aminte de URSS sau de varianta
rusească de prezentare. Scrieți un program ce conține numele,
prenumele și patronimicul Dvs. Rezultatul programului este
afișarea full a celor 3 nume.*/
public class Exercitiu3 {
    public static void main(String[] args) {
        ArrayList<String> info = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String prenume, patronimic, numeDefamilie;
        System.out.println("Numele si patronimicul");
        System.out.println("Introdu numele tau");
        prenume = scanner.next();
        info.add(prenume);
        System.out.println("Introdu patronimicul");
        patronimic = scanner.next();
        info.add(patronimic);
        System.out.println("Introdu numele de familie");
        numeDefamilie = scanner.next();
        info.add(numeDefamilie);
        Collections.sort(info);//pentru sortare ordonanta

        System.out.println(info);


    }
}
