import java.util.Scanner;

public class Exercicio01{
  public static Scanner input = new Scanner(System.in);
  public static void main (String[] args){
      int ANO_ATUAL = java.time.Year.now().getValue();
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
      else if(idade >= 18 && idade < 70){
        System.out.println("Você é obrigado a votar!");
      }
      else{
        System.out.println("Você não é mais obrigado a votar");
      }

      System.out.printf("\nDe acordo com o ano atual %d\n", ANO_ATUAL);
      // Nascimento
      int anoNasc = ANO_ATUAL - idade;
      System.out.printf("Você provavelmente nasceu em %d\n", anoNasc);
  }
}
