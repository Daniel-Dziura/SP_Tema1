package sp_practicatema1;

import java.util.Scanner;

public class GetUrl {

    public static String GetUrl() {

        //pattern - expresion regular
        String regex = "^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";
        try {
            //Scanner manu, declalar objeto
            Scanner sc = new Scanner(System.in);

            System.out.print("WEB: ");
            //Asignar URL a "String web" usando el pattern
            //System.out.println(sc.next(regex));
            String web = sc.next(regex);

            //Devolver String web con el contenido de la url
            return web;

        } catch (Exception e) {
            System.out.println("URL Incorrecta");
            System.exit(0);
        }
        return null;

    }

}
