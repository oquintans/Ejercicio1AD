/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivos;

import java.io.File;

/**
 *
 * @author oracle
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Arquivos arq = new Arquivos();
        //arq.createDir();
        //arq.createFich();
        //arq.comprobarFiles();
        //arq.createDirFich();
        //arq.listar();
        File dir = new File("/home/oracle/NetBeansProjects/arquivos/arquivosdir");
        File fich = new File("/home/oracle/NetBeansProjects/arquivos/arquivosdir/Products1.txt");
        System.out.println(dir.getAbsolutePath());
        System.out.println("Nombre: " + fich.getName());
        System.out.println("Ruta: " + fich.getAbsolutePath());
        System.out.println("Readable: " + fich.canRead());
        System.out.println("Executable: " + fich.canExecute());
        System.out.println("Writable: " + fich.canWrite());
        System.out.println("Tamaño (bytes): " + fich.length());

        fich.setReadOnly();
        fich.setWritable(true);
        System.out.println("Writable: " + fich.canWrite());
        //fich.delete();
        
    }

}
