package opt7;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;

public class Opt7 {

    public static void main(String[] args) throws MalformedURLException, URISyntaxException, IOException {

        //Ejecutar index.html con navegador por defecto
        File file = new File("../index.html");

        Desktop desktop = Desktop.getDesktop();
        if (file.exists()) {
            desktop.open(file);
            System.out.println("Archivo abierto");
        } else {
            System.out.println("Archivo no existe");
        }

    }

}
