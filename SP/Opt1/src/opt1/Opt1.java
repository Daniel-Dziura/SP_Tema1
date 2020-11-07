package opt1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Opt1 {

    public static void main(String[] args) throws MalformedURLException, IOException {

        //Recuperar argumentos
        String url = args[0];

        HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();

        int responseCode = connection.getResponseCode();
        InputStream inputStream;
        
        //Vereficar conexion al servidor web
        if (200 <= responseCode && responseCode <= 299) {
            inputStream = connection.getInputStream();
        } else {
            inputStream = connection.getErrorStream();
        }

        //Leer respuesta
        BufferedReader in = new BufferedReader(
                new InputStreamReader(
                        inputStream));

        StringBuilder response = new StringBuilder();
        String currentLine;

        while ((currentLine = in.readLine()) != null) {
            response.append(currentLine);
        }

        in.close();

        String respuesta = response.toString();
        //Imprimir contenido html, va a ser leido por la clase runtime y devuelto a menu
        System.out.println(respuesta);

        //Guardar copia de "String respuesta" en un archivo "temporal" para uso futuro
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("../temporal"));
            writer.write(respuesta);

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
