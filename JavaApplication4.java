/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author LAB230
 */


import java.util.Scanner;

public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    
    int escolha;
    
    System.out.println("Suas opções:  ");
    System.out.println("[ 1 ] - Comprar");
    System.out.println("[ 2 ] - Vender");
    System.out.println("[ 3 ] - Sair");
    System.out.println("Sua escolha: ");
    Scanner choice = new Scanner(System.in);
    escolha = choice.nextInt();
    
    switch (escolha){
        case 1:
            System.out.println("Você escolheu a opção comprar");
            break;
        
        case 2:
            System.out.println("Você escolheu a opção vender");
            break;
        
        
        case 3:
            System.out.println("Você escolheu a opção sair");
            break;
        
        
        default:
            System.out.println("Opção inválida");
        
              
    }
}
    
}
