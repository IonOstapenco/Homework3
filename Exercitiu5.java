package homework3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*5. Elaborati un program Java ce se va saluta cu
voi,după care vă va întreba numele vostru. Va
trebui să-l introduceți de la tastatură, după care
programul se va saluta din nou, deja spunțndu-vă
numele.*/
public class Exercitiu5 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Bună ziua!");
        System.out.println("Introduceți numele Dvs");
        try {
            String nume = reader.readLine();
            System.out.println("Bună ziua, " + nume);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
