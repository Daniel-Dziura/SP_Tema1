package opt4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Opt4 {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        //Leer archivo encrypted.txt
        ArrayList<String> cadenes = new ArrayList<>();
        try (BufferedReader in = new BufferedReader(new FileReader("../encrypted.txt"))) {
            String linia;
            while ((linia = in.readLine()) != null) {
                cadenes.add(linia);
            }
            String[] resultat = new String[cadenes.size()];
            for (int index = 0; index < resultat.length; index++) {
                resultat[index] = cadenes.get(index);
            }

            //Imprimir resultat
            System.out.println(Arrays.toString(resultat));
        }
    }

}
