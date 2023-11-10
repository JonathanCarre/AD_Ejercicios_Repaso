package FileUtils;

import java.io.File;

public class Ejercicio_5 {
    public static void main(String[] args) {
        // CREAMOS EL OBJETO FILE CON EL DIRECTORIO ACTUAL
        File directorio = new File(".");

        // CREAMOS UNA CONDICIÓN PARA QUE ENTRE EN CASO DE QUE EL DIRECTORIO ACTUAL SEA UN DIRECTORIO

        if (directorio.isDirectory()) {
            // CREAMOS UN OBJETO LLAMADO ELEMENTOS QUE NOS DE LO QUE HAY DENTRO DE DIRECTORIO
            File[] elementos = directorio.listFiles();
            //HACEMOS UN FOR EACH PARA RECORRER LOS ELEMENTOS
            for (File elemento : elementos) {
                //CREAMOS UNA CONDICIÓN PARA QUE SI EL ELEMENTO ES UN FICHERO SALTE POR PANTALLA EL NOMBRE Y QUE DIGA QUE EL TIPO ES FICHERO
                if (elemento.isFile()) {
                    System.out.println("Nombre: " + elemento.getName() + " Tipo: Fichero");
                }
                //CREAMOS UNA CONDICIÓN PARA QUE SI EL ELEMENTO ES DIRECTORIO SALTE POR PANTALLA EL NOMBRE DEL DIRECTORIO Y DIGA QUE EL TIPO ES DIRECTORIO
                else if (elemento.isDirectory()) {
                    System.out.println("Nombre: " + elemento.getName() + " Tipo: Directorio");
                }
            }
        }
        // EN CASO DE EL LA VARIABLE directorio NO SEA UN DIRECTORIO SALTARÁ UN MENSAJE POR PANTALLA DE QUE NO ES UN DIRECTORIO VÁLIDO
        else {
            System.out.println("No es un directorio válido.");
        }
    }
}
