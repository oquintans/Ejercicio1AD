/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivos;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author oracle
 */
public class Arquivos {

    public void createDir() {
        File fich = new File("/home/oracle/NetBeansProjects/arquivos/arquivosdir");
        if (fich.mkdirs() != false) {
            fich.mkdirs();
        } else {
            System.out.println("Ya existe el directorio");
        }
    }

    public void createDirFich() {
        try {
            File dir = new File("/home/oracle/NetBeansProjects/arquivos/arquivosdir/subdir");
            File fich = new File("/home/oracle/NetBeansProjects/arquivos/arquivosdir/subdir/Products2.txt");
            dir.mkdirs();
            if (fich.createNewFile() != false) {
                fich.createNewFile();
            } else {
                System.out.println("Ya existe el fichero");
            }
        } catch (IOException ex) {
            Logger.getLogger(Arquivos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void createFich() {
        try {
            File fich = new File("/home/oracle/NetBeansProjects/arquivos/arquivosdir/Products1.txt");
            if (fich.createNewFile() != false) {
                fich.createNewFile();
            } else {
                System.out.println("Ya existe el fichero");
            }

        } catch (IOException ex) {
            Logger.getLogger(Arquivos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void comprobarFiles() {
        File dir = new File("/home/oracle/NetBeansProjects/arquivos/arquivosdir");
        File fich = new File("/home/oracle/NetBeansProjects/arquivos/arquivosdir/Products1.txt");
        if (dir.exists()) {
            System.out.println("El directorio existe");
        } else {
            System.out.println("El directorio no existe");
        }
        if (fich.exists()) {
            System.out.println("El fichero existe");
        } else {
            System.out.println("El fichero no existe");
        }
    }

    public void listar() {
        File dir = new File("/home/oracle/NetBeansProjects/arquivos/arquivosdir");
        String lista[] = dir.list();
        for (int i = 0; i < dir.list().length; i++) {
            System.out.println(lista[i]);
        }
    }
}
