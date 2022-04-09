package Arrays;

public class MaxWordsSentence {
 public static void main(String[] args) {
  String[] input = { "one two", "three four five" };
  System.out.println(mostWordsCount(input));
 }

 public static int mostWordsCount(String[] sentences) {
  int mostWordsCount = 0;
  for (String sentence : sentences) {
   int sentenceLength = sentence.split(" ").length;
   if (sentenceLength > mostWordsCount) {
    mostWordsCount = sentenceLength;
   }
  }
  return mostWordsCount;
 }

}