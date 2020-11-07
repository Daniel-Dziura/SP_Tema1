package sp_practicatema1;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Runtime {

    public static String Runtime(String Jar, String param1, String param2) {
        //creamos un runtime.
        java.lang.Runtime rt = java.lang.Runtime.getRuntime();

        try {
            Process procesChild = null;
            //Ejecutar jar con los parametos pasados
            procesChild = rt.exec("java -jar " + Jar + " " + param1 + " " + param2);
            //procesChild.waitFor();

            //Leer output de procesChild
            InputStream is = procesChild.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            String respuesta = br.readLine();
            //Devolver output
            return respuesta;

        } catch (Exception e) {
            System.out.println("Ups, Somthing was wrong on the proces to creat a child...");
        }
        return null;
    }

}
