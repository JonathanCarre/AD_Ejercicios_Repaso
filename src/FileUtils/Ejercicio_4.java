package FileUtils;

import java.io.File;

public class Ejercicio_4 {
    public static void main(String[] args) {

        System.out.println("DATOS DEL FICHERO");

        File directorio = new File(".");

        /** HACEMOS QUE SALTE POR PANTALLA UN MENSAJE CON LOS DATOS DEL FICHERO
         * ESTO LO HAREMOS UTILIZANDO EL METODO get PARA SACAR LOS DATOS.
         */
        System.out.println("NOMBRE: "+directorio.getName());

        // RUTA NORMAL
        System.out.println("RUTA: "+directorio.getPath());

        // RUTA ABSOLUTA
        System.out.println("RUTA ABSOLUTA: "+ directorio.getAbsolutePath());

        // ¿SE PUEDE LEER?
        System.out.println("SE PUEDE LEER: "+directorio. canRead());

        // ¿SE PUEDE ESCRIBIR?
        File fichero3 = new File("ficheros");
        System.out.println("SE PUEDE ESCRIBIR: "+directorio.canWrite());

        // TAMAÑO EN BYTES
        System.out.println("TAMAÑO: "+ directorio.length());

        //¿ES UN DIRECTORIO?
        System.out.println("ES UN DIRECTORIO: "+ directorio.isDirectory());

        //¿ES UN FICHERO?
        System.out.println("ES UN FICHERO: "+ directorio.isFile());

        //NOMBRE DEL DIRECTORIO PADRE
        System.out.println("NOMBRE DEL DIRECTORIO PADRE: " +  directorio.getParent());
    }
}
