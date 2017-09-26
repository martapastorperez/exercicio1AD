
package exercicio1;

import java.io.File;
import java.io.IOException;


public class Directorios {
    
    public void crearDirectorios() throws IOException{
         File arquivosdir = new File("/home/local/DANIELCASTELAO/mpastorperez/Escritorio/AD/arquivos");
        arquivosdir.mkdir();
          File Products1 = new File("/home/local/DANIELCASTELAO/mpastorperez/Escritorio/AD/arquivos/Products1.txt");
         Products1.createNewFile();
         
          if (!arquivosdir.exists())
    {
      
      System.out.println("Directorio fallido");
    }
    else
    {
    
      System.out.println("Directorio creado con exito");
    }
         
         File subdir = new File("/home/local/DANIELCASTELAO/mpastorperez/Escritorio/AD/arquivos/arquivosdir/");
          subdir.mkdir();
           File Products2 = new File("/home/local/DANIELCASTELAO/mpastorperez/Escritorio/AD/arquivos/arquivosdir/Products2.txt");
         Products2.createNewFile();
        
  
   
    }
    
    
    
    
}

/*
setReadOnly
delete
list
listfiles
mkdirs
createnewfile
exists
canread
canwrite
getname
getPath
isDirectory
isFile
lenght
*/