import java.util.Scanner;

public class Ejercicio_6 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int num;
        do {
            System.out.println("Introduce un número del 0 al 10: ");
            num = sc.nextInt();
            if (num >= 0 && num <= 10) {
                for (int i = 0; i <= 20; i++) {
                    int resultado;
                    resultado = num * i;
                    System.out.println(num + " X " + i + " = " + resultado);
                }
            } else {
                System.out.println("El número introducido es no está entre el 0 y el 10.");
            }
        }while(num<0 || num>10);


    }
}
