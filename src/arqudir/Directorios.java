package arqudir;

import java.io.File;
import java.io.IOException;

public class Directorios {

    File arquivosdir = new File("/home/local/DANIELCASTELAO/mpastorperez/Escritorio/AD/arquivosdir");
    File products1 = new File("/home/local/DANIELCASTELAO/mpastorperez/Escritorio/AD/arquivosdir/Products1.txt");
    File subdir = new File("/home/local/DANIELCASTELAO/mpastorperez/Escritorio/AD/arquivosdir/subdir/");
    File products2 = new File("/home/local/DANIELCASTELAO/mpastorperez/Escritorio/AD/arquivosdir/subdir/Products2.txt");

    public void crearDirectorios() throws IOException {

        arquivosdir.mkdir();

        products1.createNewFile();

        if (!arquivosdir.exists()) {

            System.out.println("Directorio fallido");
        } else {

            System.out.println("Directorio creado con exito");
        }

        subdir.mkdir();

        products2.createNewFile();
    }

    public void listar() {

        File[] ficheros = arquivosdir.listFiles();
        for (int i = 0; i < ficheros.length; i++) {
            System.out.println(ficheros[i].getName());
        }
    }

    public void ruta() {

        System.out.println("File path is " + arquivosdir.getPath());

    }

    public void prod() {
        System.out.println("El nombre: " + products1.getName());
        System.out.println("La ruta: " + products1.getPath());
        System.out.println("Leer: " + products1.canRead());
        System.out.println("Escribir: " + products1.canWrite());
        System.out.println("Lonxitude en bytes: " + products1.length());

    }

    public void lectura() {
        System.out.println("El txt de product1 solo es de lectura " + products1.setReadOnly());
    }

    public void escritura() {
        System.out.println("En el txt de product1 se puede escribir " + products1.canWrite());
    }

    public void borrar() {
        System.out.println("El txt de product1 se ha borrado " + products1.delete());
    }

    public void borrarTodo() {
        products2.delete();
        subdir.delete();
        products1.delete();

        arquivosdir.delete();
    }
}
