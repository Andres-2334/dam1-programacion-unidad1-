import java.util.Scanner;

public class SaludGuerrero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int saludguerrero = 100;
        final int PORCION_SALUD = 18;
        final int GOLPE_SALUD = 12;
        System.out.println("golpes recibidos: ");
        int golperecibido = sc.nextInt();
        System.out.println("pocion bebida: ");
        int pocionBebida = sc.nextInt();
        saludguerrero -= golperecibido * GOLPE_SALUD;
        saludguerrero += pocionBebida * PORCION_SALUD;
        saludguerrero = Math.min(Math.max(0, saludguerrero), 100);
        System.out.printf("Salud final: %d%n", saludguerrero);
    
    }

}
