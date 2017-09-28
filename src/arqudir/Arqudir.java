package arqudir;

import java.io.IOException;
import javax.swing.JOptionPane;

public class Arqudir {

    public static void main(String[] args) throws IOException {
        Directorios dir = new Directorios();

        int op = 0;

        do {

            try {
                op = Integer.parseInt(JOptionPane.showInputDialog("***MENU*** \n1. Crear directorios \n2. Amosar arquivos e subdirectorios \n3. Amosar a ruta do primeiro directorio \n4. Informacion del primer txt \n5.Txt solo de lectura \n6. Borrar txt products1 \n7. Borrar todo \n8. Salir"));

            } catch (Exception e) {
                System.out.println(e.getMessage());
                op = 0;
            }
            switch (op) {

                case 1:
                    dir.crearDirectorios();
                    break;
                case 2:
                    dir.listar();
                    break;
                case 3:
                    dir.ruta();
                    break;
                case 4:
                    dir.prod();
                    break;
                case 5:
                    dir.lectura();
                    break;
                case 6:
                    dir.borrar();
                    break;
                case 7:
                    dir.borrarTodo();
                    break;
                case 8:
                    System.exit(0);

            }
        } while (op < 8);
    }

}
