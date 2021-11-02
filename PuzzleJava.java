import java.util.Random;

public class PuzzleJava {
  public static void main(String[] args) {
   Random randMachine = new Random();
   int[] arr= new int[10];
    for(int i=1; i<10; i++){
      arr[i] = randMachine.nextInt(20);
      System.out.println(arr[i]);
    }    
  }

  public static void randomLetterArr() {
    Random randLetter = new Random();

    String alphaLetter = "abcdefghijklmnopqrstuvwxyz";
    String[] alpha = new String[26];
    for (int i = 0; i < 26; i++) {
      alpha[i] = String.valueOf(alphaLetter.charAt(i));
    }
    System.out.println(alpha[randLetter.nextInt(26)]);
  }
}

public String generatePassword(){
  String password ="";
  for(int i=0 ; i<8;i++){
    password = password + generatePassword();
  }
return password;
} 


