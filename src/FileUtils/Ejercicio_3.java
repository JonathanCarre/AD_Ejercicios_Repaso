package FileUtils;

import java.io.File;

public class Ejercicio_3 {

        public static void main(String[] args) {
            /** CREAMOS UNA VARIABLE STRING PARA ALMACENAR LA RUTA DEL DIRECTORIO
             */
            String directorio = "C:\\Users\\JonathanCarreñoF\\Desktop\\PRUEBA";
            File carpeta = new File(directorio);

            // CREAMOS UN CONDICIONAL PARA INDICAR SI EL OBJETO CARPETA ES UN DIRECTORIO

            if (carpeta.isDirectory()) {
                // CREAMOS UN OBJETO LLAMADO FICHERO CON EL MÉTODO listFiles() PARA QUE NOS INDIQUE LOS FICHEROS
                File[] ficheros = carpeta.listFiles();

                // CREAMOS UN CONDICIONAL PARA INDICAR QUE ENTRE EN CASO DE QUE LOS FICHEROS NO ESTEN DECLARADOS COMO NULL

                if (ficheros != null) {
                    // CREAMOS UNA VARIABLE DE TIPO ENTERO LLAMADA CONTADOR PARA ALMACENAR LA CANTIDAD DE FICHEROS QUE HAY
                    int contador = ficheros.length;
                    System.out.println("Número de ficheros en el directorio: " + contador);
                } else {
                    // EN CASO DE QUE LOS FICHEROS ESTEN DECLARADOS COMO NULL O NO HAYA FICHEROS SALTARÁ EL SIGUIENTE MENSAJE POR PANTALLA
                    System.out.println("No se pudo obtener la lista de ficheros en el directorio.");
                }
            } else {
                // EN CASO DE QUE NO SE CUMPLA LA PRIMERA CONDICIÓN DE QUE LA CARPETA SEA UN DIRECTORIO SALTARÁ EL SIGUIENTE MENSAJE
                System.out.println("La ruta especificada no es un directorio válido.");
            }
        }




}
