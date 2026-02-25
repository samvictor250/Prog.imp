import java.util.Scanner;

public class Tabuada{
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        int valor;
        
        System.out.println("Digite o numero a ser multiplicado: ");
        valor = input.nextInt();
        
        System.out.println("==========");
        System.out.printf("Valor escolhido: %d\n",valor);
        System.out.println("==========");
        
        for(int i = 0; i < 11; i++){
            int result = i * valor;
            System.out.printf("%d X %d = %,4d\n",valor, i, result);
        }
    }
}
