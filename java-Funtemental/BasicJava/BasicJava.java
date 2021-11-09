import java.util.ArrayList;

public class BasicJava {
  public static void main(String[] args) {

  }

  // Print 1-255
  public static void AccountingTo255() {
    for (int i = 1; i <= 15; i++) {
      System.out.println("i= " + i);
    }
  }

  // Print odd numbers between 1-255
  public static void OddNumber() {
    for (int i = 1; i <= 15; i++) {
      if (i % 2 != 0) {
        System.out.println("i= " + i);
      }
    }
  }

  // Sum from 1 to 255
  public static void SumNumber() {
    int sum = 0;
    for (int j = 1; j <= 15; j++) {
      sum += j;
    }
    System.out.println("sum= " + sum);
  }

  // iterating through an array
  public static void ArrayInherate() {
    int[] inherate = { 1, 3, 5, 7, 9, 13 };
    for (int i = 0; i <= inherate.length; i++) {
      System.out.println("inherate: " + inherate);
    }
  }

  // Find Max
  public static void MaxArrayValue() {
    int[] maxNumber = { 5, 12, -7, 20, -3, 0, 8 };
    for (int i = 0; i <= maxNumber.length; i++) {
      for (int j = 0; j <= maxNumber.length; j++) {
        if (maxNumber[i] > maxNumber[j]) {
          int temp = maxNumber[i];
          maxNumber[i] = maxNumber[j];
          maxNumber[j] = temp;
        }
      }
    }
  }

  // Array with Odd Numbers
  public static void ArrayOddNum() {
    for (int i = 1; i <= 255; i++) {
      ArrayList<Integer> arrayOddNum = new ArrayList<Integer>();
      if (i % 2 != 0) {
        arrayOddNum.add(i);
      }
      System.out.println(arrayOddNum.get(i));
    }
  }

}
