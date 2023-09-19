import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Ejercicio_5 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int num = (int) ((Math.random() * (100-0+1)) + 0);
        System.out.println(num);
        int intentos=0;
        int num_usuario=-1;

        do {
            System.out.println("Introduce un número del 0-100: ");
            num_usuario=sc.nextInt();
            if (num!=num_usuario){
                System.out.println("Has fallado, vuelve a intentar.");
                intentos=intentos+1;
                if (num_usuario<num) {
                    System.out.println("Busca un número mayor.");

                }
                else if (num_usuario>num) {
                    System.out.println("Busca un número menor.");


                }

            }

            else {
                System.out.println("Has acertado!!");
                intentos=intentos+1;


            }



        }while(num_usuario!=num);
        System.out.println("El número de intentos es "+intentos+".");



    }
}
