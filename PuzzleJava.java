import java.util.Random;
public class PuzzleJava {
 public static void main(String[] args) {
  Random randMachine = new Random();
    int[] arr= new int[10];
    for(int i=1; i<arr.length; i++){
      arr[i] = randMachine.nextInt();
      System.out.println(arr[i]);
    }
 }    
}

// randMachine.setSeed(35679)
// ;
