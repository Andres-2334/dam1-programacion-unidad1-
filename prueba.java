import java.util.Scanner;

public class prueba {


    /*
     * esto es un comentario 
     * en miltiple lineas
     * 
     * curso: DAM 
     */

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("introduce tu nombre: ");

    String nombre = sc.nextLine();

    System.out.println("tu nombre es: " + nombre);

    System.out.println("introduce tu edad: ");

    String edad = sc.nextLine();

    System.out.println("tu edad es: " + edad);

    System.out.println("introduce donde vives: ");

    String vivienda = sc.nextLine();

    System.out.println("vives en: " + vivienda);

    sc.close();             




}   

}
