package FileUtils;

import java.io.File;

public class Ejercicio_2 {
    public static void main(String[] args) {
        /** CREAMOS UNA VARIABLE DE TIPO STRING CON LA RUTA DE LOS FICHEROS Y DEL DIRECTORIO
         * PRIMERO CREAMOS LA RUTA DEL PRIMER FICHERO
         * TAMBIÉN CREAMO UN OBJETO DE TIPO FILE PARA ALMACENAR LA  RUTA
         */
        String ruta_completa="C:\\Users\\JonathanCarreñoF\\IdeaProjects\\AD_Ejercicios_Repaso\\mi_directorio\\fichero1.txt";
        File fichero1 = new File(ruta_completa);
        /** CREAMOS UN CONDICIONAL QUE INDIQUE QUE SI EXISTE EL PRIMER FICHERO ENTRE DENTRO DE OTRA CONDICIÓN
         * LA SIGUIENTE CONDICIÓN INDICA QUE SI SE BORRA EL FICHERO SALGA UN MENSAJE POR PANTALLA DE QUE SE HA BORRADO
         * SI NO SE CUMPLE SALTA UN MENSAJE DE QUE NO HA SIDO POSIBLE ELIMINAR EL FICHERO
         * EN CASO DE QUE LA PRIMERA CONDICIÓN DE QUE SI EXISTE EL FICHERO NO SE CUMPLA SALTA UN MENSAJE DE QUE EL FICHERO INDICADO NO EXISTE
         */
        if (fichero1.exists()){
            if (fichero1.delete()){
                System.out.println("El fichero ha sido borrado con exito,");
            }
            else {
                System.out.println("No se ha podido eliminar el fichero.");
            }
        }
        else{
            System.out.println("No existe el fichero.");
        }
        /** VOLVEMOS A REPETIR LOS DOS PASOS ANTERIORES PARA EL SIGUIENTE FICHERO
         */
        ruta_completa="C:\\Users\\JonathanCarreñoF\\IdeaProjects\\AD_Ejercicios_Repaso\\mi_directorio\\nuevo_fichero2.txt";
        File fichero2= new File(ruta_completa);
        if (fichero2.exists()){
            if (fichero2.delete()){
                System.out.println("El fichero ha sido borrado con exito,");
            }
            else {
                System.out.println("No se ha podido eliminar el fichero.");
            }
        }
        else{
            System.out.println("No existe el fichero.");
        }
        /** PARA BORRAR EL DIRECTORIO ES EXACTAMENTE LO MISMO PERO CAMBIANDO LA RUTA DE LOS FICHERO POR SOLO LA DE LOS DIRECTORIOS
         */
        ruta_completa="C:\\Users\\JonathanCarreñoF\\IdeaProjects\\AD_Ejercicios_Repaso\\mi_directorio";
        File directorio=new File(ruta_completa);
        if (directorio.exists()){
            if (directorio.delete()){
                System.out.println("El directorio ha sido borrado con exito,");
            }
            else {
                System.out.println("No se ha podido eliminar el directorio.");
            }
        }
        else{
            System.out.println("No existe el directorio.");
        }

    }

}
