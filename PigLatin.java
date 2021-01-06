import java.util.*;
import java.lang.*;

public class PigLatin{
  public static void main(String[] args){
    Scanner n = new Scanner(System.in);
    while (n.hasNextLine()){
      Scanner line = new Scanner(n.nextLine());
      while (line.hasNext()){
        System.out.print(pigLatinBest(line.next()) + " ");
    }
    System.out.println();
  }
}

  public static String pigLatinSimple(String s){ //changes an individual word to pigLatinSimple
    String word = s.toLowerCase();
    if (word.charAt(0) == 'a' || word.charAt(0) == 'e' || word.charAt(0) == 'i' || word.charAt(0) == 'o' || word.charAt(0) == 'u') {
      return word + "hay ";
    }
    else{
      return word.substring(1, word.length()) + word.substring(0, 1) + "ay ";
    }
  }

  public static String pigLatin(String s){ //changes an individual word to pigLatin
    String word = s.toLowerCase();
    String[] digraphs = {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
    if (word.charAt(0) == 'a' || word.charAt(0) == 'e' || word.charAt(0) == 'i' || word.charAt(0) == 'o' || word.charAt(0) == 'u') {
      return word + "hay";
    }
    if (word.length() >= 2){
      for (String digraph : digraphs){
        if (word.substring(0, 2).equals(digraph)) {
          return word.substring(2, word.length()) + word.substring(0, 2) + "ay";
        }
      }
    }
    return word.substring(1, word.length()) + word.substring(0, 1) + "ay";
  }

  public static String pigLatinBest(String s){ //changes an individual word to pigLatin
    String word = s.toLowerCase();

    if (Character.isLetter(word.charAt(0))) {
      if (Character.isLetterOrDigit(word.charAt(word.length()-1))){
        return pigLatin(word);
      }
      else{
        String bingbing = word.substring(word.length()-1);
        return pigLatin(word.substring(0, word.length()-1)) + bingbing;
      }
    }
    return "u did a bad";
  }









}
