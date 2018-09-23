import java.util.Arrays;
/**
 * A method which finds only one missing element from an array.
 */

public class MissingNumberInArray {
  public static int missingElem(int[] numbers,int maxNum){

    // remember about conversion to flot in some cases
    int expectedSum = (int)(maxNum * ((float)(maxNum+1) / 2));
    int realSum = 0;

    for (int num : numbers) {
      realSum += num;
    }

    return expectedSum - realSum;
  }

  public static void main(String[] args){
    int missing_elem = missingElem(new int[] {1,2,3,4,6},6);
    System.out.println(missing_elem);
  }
}
