import java.util.Scanner;

class media{
  public static void main(String[] args) {
  float nota1, nota2, media;
  int quantidade_alunos, cont = 0;
  System.out.println("Quantidade de alunos: ");
  Scanner leia = new Scanner(System.in);
  quantidade_alunos = leia.nextInt();
  do {
    cont++;
    Scanner lenota = new Scanner(System.in);
    System.out.println("Primeiro nota do " + cont + "º aluno: ");
    nota1 = lenota.nextFloat();
    System.out.println("Segunda nota do " + cont + "º aluno: ");
    nota2 = lenota.nextFloat();
    media = (nota1 + nota2) / 2;
    System.out.println("Tirando " + nota1 + " e " + nota2 + " a média é igual a " + media);
    if (media >= 70){
    System.out.println("Você está aprovado.Bom trabalho!");
  }

    else if (media >= 50){
    System.out.println("Você está de recuperação.Se esforce!");
  }

    else{
    System.out.println("Você está reprovado.Se dedique mais no ano que vem!");
  }
    
  }while (cont < quantidade_alunos);

 
  }
}