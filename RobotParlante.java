import java.util.Scanner;

public class RobotParlante {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String Texto = sc.nextLine();
    char robot1 = Texto.charAt(0);
    System.out.println(robot1);
    String Texto2 = sc.nextLine();
    char robot2 = Texto2.charAt(Texto2.length()-1);
    System.out.println(robot2);
    String texto3 = sc.nextLine();
    String robot3 = texto3.substring(0,3);
    System.out.println(robot3);
    String texto4 = sc.nextLine();
    String robot4 = texto4.substring(texto4.length()-Math.min(texto4.length(),3));
    System.out.println(robot4);
    String texto5 = sc.nextLine();
    String robot5 = texto5.toUpperCase();
    System.out.println(robot5);
}
}
