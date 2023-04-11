// Autor: Mateus Henrique de Souza Medeiros ADS 3 - turma B
package calculadora;

import java.util.Scanner;
// Bibliogeca matemática
import java.lang.Math;
import java.io.IOException;
    


// Cria classe calculadora
public class Calculadora {   
    
    
    // Método que realiza a adição de 2 numeros
    public void Adicao(){
        System.out.println("======== ADICÃO ========");

       Scanner num = new Scanner(System.in);
       System.out.println("Informe o 1º valor: ");
       int n1 = num.nextInt();
       System.out.println("Informe o 2ºvalor: ");
       int n2 = num.nextInt();
       int soma = (n1 + n2);

       //System.out.println(n1 + " + " n2 + " = " + soma);
       System.out.println(n1 +  " + " + n2 + " = " + soma);
       
    }
    
    // Método que calcula a subtração de 2 valores
    public void Subtracao(){
        System.out.println("======== SUBTRAÇÃO ========");
       int sub = 0;
       Scanner num = new Scanner(System.in);
       System.out.println("Informe o 1º valor: ");
       int n1 = num.nextInt();
       System.out.println("Informe o 2ºvalor: ");
       int n2 = num.nextInt();
       
       sub = (n1 - n2);
       
       System.out.println(n1 +  " - " + n2 + " = " + sub);
       

    }
    
    // Método que calcula a multiplicação de 2 valores
    public void Multiplicacao(){
        System.out.println("======== MULTIPLICAÇÃO ========");
       int mult = 0;
       Scanner num = new Scanner(System.in);
       System.out.println("Informe o 1º valor: ");
       int n1 = num.nextInt();
       System.out.println("Informe o 2ºvalor: ");
       int n2 = num.nextInt();
       
       mult = (n1 * n2);
       
       System.out.println(n1 +  " x " + n2 + " = " + mult);
        
        
    }
    
    // Função que calcula a divisão de 2 valores
    public void Divisao(){
        System.out.println("======== DIVISÃO ========");
       int div = 0;
       Scanner num = new Scanner(System.in);
       System.out.println("Informe o 1º valor: ");
       int n1 = num.nextInt();
       System.out.println("Informe o 2ºvalor: ");
       int n2 = num.nextInt();
       
       div = (n1 / n2);
       
       System.out.println(n1 +  " / " + n2 + " = " + div);
    }
    
    
    // Função que calcula a porcentagem de um número em relação a outro
    // Ex: 30% de 100 = 30
    public void Porcentagem(){
        System.out.println("======== PERCENTUAL ========");
       Scanner num = new Scanner(System.in);
       System.out.println("Informe o 1º valor: ");
       float n1 = num.nextFloat();
       System.out.println("Informe o 2ºvalor: ");
       float n2 = num.nextFloat();
       
       float porcent = (n1 * n2 / 100);
       
       System.out.println(n1 + "% de " + n2 + " vale " + porcent);
    }
    
    
    // Calcula a raiz quadrada de um número
    public void RaizQuadrada(){
        System.out.println("======== RAIZ QUADRADA ========");
       Scanner num = new Scanner(System.in);
       System.out.println("Valor: ");
       float n1 = num.nextFloat();
       
       System.out.println("A raiz quadrada de " + n1 + " vale " + Math.sqrt(n1));
    }
      
        
    

    // Calcula a potência de um valor
    public void Exponenciacao(){
        System.out.println("======== EXPONENCIAÇÃO =========");
       Scanner num = new Scanner(System.in);
       System.out.println("Base: ");
       double n1 = num.nextDouble();
       System.out.println("Expoente: ");
       double n2 = num.nextDouble();
       
        
        //double n1 = 2.0;
        
        //double n2 = 2.0;
       
       //System.out.println("A raiz quadrada vale " + Math.pow(n1, n2));
       System.out.println(n1 + " elevado a " + n2 + " vale " + Math.pow(n1, n2));
    }
        

    

   
public static void main(String[] args)throws IOException, InterruptedException{
    
    // Menu
    
    boolean continuar = true;
    
    while (continuar){
        
    
        // Cabeçalho
        System.out.println("===============================================");
        System.out.println("|                   JAVA CALC                   |");
        System.out.println("===============================================");
        
        // Menu de opções do usuário
        System.out.println("Menu: ");
        System.out.println("1 - Adição: ");
        System.out.println("2 - Subtração: ");
        System.out.println("3 - Multiplicação: ");
        System.out.println("4 - Divisão: ");
        System.out.println("5 - Percentual: ");
        System.out.println("6 - Exponenciação: ");
        System.out.println("7 - Raiz Quadrada: ");
        System.out.println("8 - Sair");
        System.out.println("Sua escolha: ");
        
        // Escolha do usuário
        Scanner opc = new Scanner(System.in);
        int EscolhaUsuario = opc.nextInt();

        Calculadora calc1 = new Calculadora();
           
        
        // Verifica qual foi a escolha feita pelo usuário
        
        
        // Adição
        if (EscolhaUsuario == 1){
            calc1.Adicao();
        }
        
        
        // Subtração
        else if (EscolhaUsuario == 2){
            calc1.Subtracao();
        
        }
        
        // multiplicação
        else if (EscolhaUsuario == 3){
            calc1.Multiplicacao();
        }

        
        // Divisão
        else if (EscolhaUsuario == 4){
            calc1.Divisao();
        }

         // Percentual
        else if (EscolhaUsuario == 5){
            calc1.Porcentagem();
        }

        // Exponenciação
        else if (EscolhaUsuario == 6){
            calc1.Exponenciacao();
        }

        else if (EscolhaUsuario == 7){
            calc1.RaizQuadrada();
        }
        
        else if (EscolhaUsuario == 8){
            System.out.println("======== SAIR ========");
            continuar = false;
        }
        
        else{
            System.out.println("Opção inválida.Por favor, tente novamente");
        }
        
       
        //Limpa a tela no windows, no linux e no MacOS
        if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            Runtime.getRuntime().exec("clear");

    }
}
        
        
    }

