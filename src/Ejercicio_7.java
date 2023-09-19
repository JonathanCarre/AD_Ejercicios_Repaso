import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_7 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array= new int[5];
        int num;
        for (int i=0;i<array.length;i++){
            System.out.println("Introduce un número: ");
            num=sc.nextInt();
            array[i]=num;
        }
        double media_array= calcularMediaArray(array);
        System.out.println("La media del array es "+media_array);

    }

    public static double calcularMediaArray(int[] array){
        double resultado=0;
        for (int i=0;i<array.length;i++){
            resultado=resultado+array[i];
        }
        resultado=resultado/array.length;
        return resultado;

    }
}
