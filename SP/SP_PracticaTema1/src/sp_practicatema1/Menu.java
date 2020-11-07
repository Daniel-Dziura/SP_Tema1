package sp_practicatema1;

import java.util.Scanner;
import java.io.*;

public class Menu {

    public static void main(String[] args) throws IOException, InterruptedException {

        //Scanner manu, declalar objeto
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();

        //Variables iniciales
        String webHtml, html = null, output, menuOption = null;

        //Obtener url del usuario, devuelve un "String web"
        String web = GetUrl.GetUrl();
        

        //Imprimir menu mientras menuOption !8
        while (menuOption != "8") {
            
            //Imprimir menu
            printMenu();
            //Asignar la opcion a "String menuOption"
            menuOption = sc.nextLine();

            switch (menuOption) {
                case "1":
                    //Llamar al metodo runtime, devuelve contenido html de "String web"
                    html = Runtime.Runtime("..\\Opt1\\dist\\Opt1.jar", web, null); 
                    System.out.println(html);
                    
                    System.out.print("Enter para continuar");
                    break;
                case "2":
                    //Contar numero de vocales
                    System.out.print("Vocal en minuscula: ");
                    String vocal = sc.nextLine();
                    
                    //Llamar al metodo runtime, devuelve numero de vocales
                    output = Runtime.Runtime("..\\Opt2\\dist\\Opt2.jar", vocal, null);
                    System.out.println(output);
                    
                    System.out.print("Enter para continuar");
                    break;
                case "3":
                    //Cambiar letras
                    System.out.print("Letra a cambiar: ");
                    String letraCamb = sc.nextLine();
                    System.out.print("Cambiar por: ");
                    String letraSus = sc.nextLine();
                    
                    //Cambiar letra "letraCamb" por "letraSus" y guardar en encrypted.txt
                    //Llamar al metodo runtime, cambiar letra "letraCamb" por "letraSus" y guardar en encrypted.txt, devuelve estado
                    output = Runtime.Runtime("..\\Opt3\\dist\\Opt3.jar", letraCamb, letraSus);
                    System.out.println(output);
                    
                    System.out.print("Enter para continuar");
                    break;
                case "4":
                    //Llamar al metodo runtime, lee encrypted.txt
                    output = Runtime.Runtime("..\\Opt4\\dist\\Opt4.jar", null, null);
                    System.out.println(output);
                    
                    System.out.print("Enter para continuar");
                    break;
                case "5":
                    //Buscar palabra index de palabra
                    System.out.print("Buscar palabra: ");
                    String palabra = sc.nextLine();
                    
                    //Llamar al metodo runtime, devuelve index
                    output = Runtime.Runtime("..\\Opt5\\dist\\Opt5.jar", palabra, null);
                    System.out.println(output);
                    
                    System.out.print("Enter para continuar");
                    break;
                case "6":
                    //Borrar body e incertar nombre
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    
                    //Llamar al metodo runtime, devuelve estado
                    output = Runtime.Runtime("..\\Opt6\\dist\\Opt6.jar", nombre, null);
                    
                    System.out.print("Enter para continuar");
                    break;
                case "7":
                    //Ejecutar index.html con el navegador por defecto
                    output = Runtime.Runtime("..\\Opt7\\dist\\Opt7.jar", null, null);
                    System.out.println(output);
                    
                    System.out.print("Enter para continuar");
                    break;
                case "8":
                    //Apagar programa
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }

            //Next
            String siguiente = sc.nextLine();
        }

    }

    public static void printMenu() {
        System.out.println("\n1. Carregar pàgina Web");
        System.out.println("2. Analitzar número de vocals");
        System.out.println("3. Substituir lletres");
        System.out.println("4. llegir encrypted.txt");
        System.out.println("5. Cercar paraules clau");
        System.out.println("6. Crear arxiu index.html");
        System.out.println("7. Ejecutar arxiu index.html a través d’un navegador");
        System.out.println("8. Exit");
    }

}
