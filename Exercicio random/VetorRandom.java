import java.util.Random;

public class VetorRandom{
  public static Random rand = new Random();
  public static int[] vetor = new int[100];

  public static void main(String[] args){

    System.out.print("{");
    if(vetor.length >= 1){
      System.out.print(" " + vetor[0]);
      for(int i = 0; i < vetor.length; i++){
        int MAX = rand.nextInt(31);
        System.out.print(", " + MAX);
      }
    }
    System.out.print("}\n");
  }
}