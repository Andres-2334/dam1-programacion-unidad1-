import java.util.Scanner;

public class CarreraFuturista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("introduce año actual: ");
        int añoActual = sc.nextInt();
        System.out.print("introduce año de la carrera: ");
        int añoCarrera = sc.nextInt();
        System.out.println("faltan " + (añoCarrera - añoActual) + " años para la carrera");
        sc.close();

    }

}
