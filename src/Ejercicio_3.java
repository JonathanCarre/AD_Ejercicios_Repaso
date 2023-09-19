import javax.swing.*;

public class Ejercicio_3 {
    public static void main(String[] args) {
        String letra= JOptionPane.showInputDialog("Introduce un caracter: ");
        if (letra == letra.toLowerCase()){
            System.out.println("La letra es minúscula.");
        }
        else{
            System.out.println("La letra es mayúscula.");
        }
    }
}
