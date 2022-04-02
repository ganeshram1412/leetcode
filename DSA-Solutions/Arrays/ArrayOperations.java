package Arrays;

public class ArrayOperations {
 public static void main(String[] args) {
  String input[] = { "--X", "X++", "X++" };
  System.out.println(finalValueAfterOperations(input));
 }

 public static int finalValueAfterOperations(String[] operations) {
  int result = 0;
  for (String operation : operations) {
   switch (operation) {
    case "X++":
     result = result + 1;
     break;
    case "++X":
     result = result + 1;
     break;
    case "X--":
     result = result - 1;
     break;
    case "--X":
     result = result - 1;
     break;

    default:
     break;
   }
  }
  return result;
 }
}