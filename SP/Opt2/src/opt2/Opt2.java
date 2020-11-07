package opt2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Opt2 {

    public static void main(String[] args) throws IOException {

        //Recuperar argumentos
        String html = null;
        char vocal = args[0].charAt(0);

        ArrayList<String> cadenes = new ArrayList<>();

        //Leer contentido html de archivo "temporal"
        try (BufferedReader in = new BufferedReader(new FileReader("../temporal"))) {
            String linia;
            while ((linia = in.readLine()) != null) {
                cadenes.add(linia);
            }
            String[] resultat = new String[cadenes.size()];
            for (int index = 0; index < resultat.length; index++) {
                resultat[index] = cadenes.get(index);
            }
            html = Arrays.toString(resultat);
        }

        int count = 0;

        //Contar nuemro de vocales
        if ((vocal == 'a') || (vocal == 'e') || (vocal == 'i') || (vocal == 'o') || (vocal == 'u')) {
            for (int i = 0; i < html.length(); i++) {
                if (html.charAt(i) == vocal) {
                    count++;
                }
            }
            System.out.println("Numero de vocales: " + count);
        }

    }

}
