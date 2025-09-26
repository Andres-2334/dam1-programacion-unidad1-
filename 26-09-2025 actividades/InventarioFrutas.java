import java.util.Scanner;

public class InventarioFrutas {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int frutaliacomienzo = 200;
    System.out.println("Frutas recibidas: ");
    int frutasrecibidas = sc.nextInt();
    System.out.println("Frutas vendidas: ");
    int frutasvendidas = sc.nextInt();
    System.out.println("inventario final: " + (frutaliacomienzo + frutasrecibidas - frutasvendidas));


}
}
