import java.util.Scanner;

public class Exercicio01{
  public static Scanner input = new Scanner(System.in);
  public static void main (String[] args){
      int idade;
      System.out.println("Digite sua idade: ");
      idade = input.nextInt();

      if (idade >= 18){
        System.out.println("Você ja pode tirar a carteira de motorista!");
      }
      else{
        System.out.println("Você ainda não pode tirar a carteira de motorista!");
      }
  }
}