import java.util.Scanner;

public class Exercicio01{
  public static Scanner input = new Scanner(System.in);
  public static final int ANO_ATUAL = 2026;

  public static void main (String[] args){
      // Inserção de dados
      int idade;
      System.out.println("Digite sua idade: ");
      idade = input.nextInt();
      
      // Habilitação 
      if (idade >= 18){
        System.out.println("Você ja pode tirar a carteira de motorista!");
      }
      else{
        System.out.println("Você ainda não pode tirar a carteira de motorista!");
      }

      // Titulo de eleitor
      if(idade < 16){
        System.out.println("Você não pode votar!");
      }
      else if(idade > 18){
        System.out.println("Você é obrigado a votar!");
      }
      else if(idade < 70){
        System.out.println("Você é obrigado a ter o titulo de eleitor e obrigado a votar!");
      }
      else{
        System.out.println("Você não é mais obrigado a voltar");
      }

      // Nascimento
      int anoNasc = ANO_ATUAL - idade;
      System.out.printf("Você provavelmente nasceu em %d\n", anoNasc);
  }
}