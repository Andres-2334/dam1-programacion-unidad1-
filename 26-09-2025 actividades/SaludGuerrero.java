import java.util.Scanner;

public class SaludGuerrero {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int saludguerrero = 100;
    int pocion = 18;
    int golpe = -12;
    System.out.println("golpes recibidos: ");
    int golperecibido = sc.nextInt();
    System.out.println("pocion bebida: ");
    int pocionBebida = sc.nextInt();
    System.out.println("Salud final: " + (saludguerrero + (golperecibido * golpe) + (pocion * pocionBebida)));
    

    }
    
    



}
