import java.util.Scanner;

public class InventarioFrutas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int frutasTotales = 200;
        System.out.println("Frutas recibidas: ");
        int frutasRecibidas = sc.nextInt();
        System.out.println("Frutas vendidas: ");
        int frutasVendidas = sc.nextInt();
        frutasTotales += frutasRecibidas - frutasVendidas;

        System.out.printf("inventario final: %d%n", frutasTotales);

        sc.close();

    }
}
