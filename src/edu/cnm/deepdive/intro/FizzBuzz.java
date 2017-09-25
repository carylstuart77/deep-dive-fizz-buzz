package edu.cnm.deepdive.intro;

/**
 * This class implements the FizzBuzz game, using an upper limit specified
 * on the comand line
 * @author Caryl Stuart
 *
 */
public class FizzBuzz {

  private static final int DEFAULT_LIMIT = 100;

  /**
   * Ifthen check that upper default limit is 100
   * @param args
   */
  public static void main(String[] args){
    //if-then-else check for command line input length
    int limit = (args.length > 0) ? Integer.parseInt(args[0]) : DEFAULT_LIMIT;
    for (int i = 1; i <= limit; i++) {
      System.out.println(computeResponse(i));
    }
  }

  /**
   * Computes and returns the appropriate fizz/buzz/fizzbuzznumber
   * value for a given input value
   * @param value input value
   * @return fizz/buzz/fizzbuzz/numberic response.
   */
  private static String computeResponse(int value){
    String result = "";
    //give back modulas or remainder
    if (value % 3 == 0) {
      //this cancatinates fizz to result
      result += "fizz";
    }
    if (value % 5 == 0) {
      result += "buzz";
    }
    if (result.isEmpty()){
      result += value;
    }
   // If (result == ""){
      //result = Integer.toString(value);
      //result = "" + value;
      //place holder
      //result = String.format("%d", value);
     // result += value;
    //}
    return result;
  }
}

