package opt6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Opt6 {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        String html;
        String nombre = args[0];

        //Leer archivo
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
            html = Arrays.toString(resultat);
            System.out.println(html);

        }

        //Dividir body e incertar nombre
        String[] parts = html.split("<body");
        String antesBody = parts[0];
        String part2 = parts[1];

        String html2 = part2;
        String[] parts2 = html2.split("</body>");

        String despuesBody = parts2[1];

        String htmlName = antesBody + "<body>" + nombre + "</body>" + despuesBody;

        //Escribir archivo modificado en ndex.html
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("../index.html"));
            writer.write(htmlName);
            System.out.println("Se ha escrito el archivo correctamente");

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
