import java.util.Scanner;

public class Ejercicio_4 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int nota =-1;
        System.out.println("Introduce tu nota: ");
        nota=sc.nextInt();
        switch (nota){
            case 0:
                System.out.println("INSUFICIENTE");
                break;
            case 1:
                System.out.println("INSUFICIENTE");
                break;
            case 2:
                System.out.println("INSUFICIENTE");
                break;
            case 3:
                System.out.println("INSUFICIENTE");
                break;
            case 4:
                System.out.println("INSUFICIENTE");
                break;
            case 5:
                System.out.println("SUFICIENTE");
                break;
            case 6:
                System.out.println("BIEN");
                break;
            case 7:
                System.out.println("NOTABLE");
                break;
            case 8:
                System.out.println("NOTABLE");
                break;
            case 9:
                System.out.println("SOBRESALIENTE");
                break;
            case 10:
                System.out.println("SOBRESALIENTE");
                break;
        }

    }
}
