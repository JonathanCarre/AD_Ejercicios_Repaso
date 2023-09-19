import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_2 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] numeros= new int[3];
        System.out.println("Introduce el primer número: ");
        numeros[0]=sc.nextInt();
        System.out.println("Introduce el segundo número: ");
        numeros[1]=sc.nextInt();
        System.out.println("Introduce el tercer número: ");
        numeros[2]=sc.nextInt();


        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));


    }
}
