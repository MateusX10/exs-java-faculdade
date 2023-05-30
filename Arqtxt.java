/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arqtxt;

/**
 *
 * @author Mateus Henrique de Souza Medeiros
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.NoSuchElementException;

public class Arqtxt {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException {
        
        Scanner cobaia1 = new Scanner(Paths.get("C:\\Users\\unicesumar\\Desktop\\cobaia.txt"));
        try{
            while (cobaia1.hasNext()){
            System.out.printf("%-6s", cobaia1.next());
        
        }
        }
        catch (NoSuchElementException erroElemento){
            System.err.println("Arquivo com problemas...");
        }
        
        catch (IllegalStateException erroEstado){
            System.err.println("Erro ao ler o arquivo...");
        }
        
        
            
        
    }
    
}
