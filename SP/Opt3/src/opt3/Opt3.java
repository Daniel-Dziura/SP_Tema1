package opt3;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Opt3 {

    public static void main(String[] args) throws IOException {

        //Recuperar argumentos
        char charA = args[0].charAt(0);
        char charB = args[1].charAt(0);
        String html2 = null;

        //Leer contentido html de archivo "temporal"
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

            //Cambiar letras
            html2 = html.replace(charA, charB);

        }

        //Escribir archivo en encrypted.txt
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("../encrypted.txt"));
            writer.write(html2);
            System.out.println("Se ha escrito el archivo correctamente");

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
