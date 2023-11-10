package FileUtils;

import java.io.File;
import java.io.IOException;

public class CrearDirectorio {
    public static void main(String[] args) {


        // Crear el directorio
        File directorio = new File("mi_directorio");

        if (!directorio.exists()) {
            if (directorio.mkdir()) {
                System.out.println("Directorio creado exitosamente.");
            } else {
                System.err.println("No se pudo crear el directorio.");
                return;
            }
        } else {
            System.out.println("El directorio ya existe.");
        }

        // Crear los archivos dentro del directorio
        File archivo1 = new File(directorio, "fichero1.txt");
        File archivo2 = new File(directorio, "fichero2.txt");

        try {
            if (archivo1.createNewFile()) {
                System.out.println("Archivo 1 creado exitosamente.");
            } else {
                System.err.println("No se pudo crear el archivo 1.");
            }

            if (archivo2.createNewFile()) {
                System.out.println("Archivo 2 creado exitosamente.");
            } else {
                System.err.println("No se pudo crear el archivo 2.");
            }
            // Renombrar el archivo2.txt
            File nuevoArchivo2 = new File(directorio, "nuevo_fichero2.txt");
            if (archivo2.renameTo(nuevoArchivo2)) {
                System.out.println("Archivo 2 renombrado exitosamente a " + "nuevo_fichero2.txt");
            } else {
                System.err.println("No se pudo renombrar el archivo 2.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

