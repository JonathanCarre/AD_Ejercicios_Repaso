import java.util.Scanner;

public class Ejercicio_1 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String nombre="";
        int edad = -1;

        System.out.println("Introduce tu nombre: ");
        nombre=sc.next();
        System.out.println("Introduce tu edad: ");
        edad=sc.nextInt();
        System.out.println("El nombre del usuario es "+nombre+" y la edad es "+edad+".");

    }
}
