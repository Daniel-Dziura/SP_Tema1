package opt5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Opt5 {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        String palabra = args[0];

        //Leer del archivo
        ArrayList<String> cadenes = new ArrayList<>();
        try (BufferedReader in = new BufferedReader(new FileReader("../temporal"))) {
            String linia;
            while ((linia = in.readLine()) != null) {
                cadenes.add(linia);
            }
            String[] resultat = new String[cadenes.size()];
            for (int index = 0; index < resultat.length; index++) {
                resultat[index] = cadenes.get(index);
            }
            String html = Arrays.toString(resultat);

            //Buscar palabra
            String strOrig = html;
            int intIndex = strOrig.indexOf(palabra);

            if (intIndex == - 1) {
                System.out.println(palabra + " no se ha encontrado");
            } else {
                System.out.println("Se ha encontrado " + palabra + " en index " + intIndex);
            }
        }
    }

}

