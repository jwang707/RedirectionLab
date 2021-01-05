import java.util.*;
public class PigLatin{
  public static void main(String[] args){
    Scanner n = new Scanner(System.in);
    while (n.hasNextLine()){
      Scanner line = new Scanner (n.nextLine());
      while (line.hasNext()){
        System.out.print(pigLatinSimple(line.next()));
    }
    System.out.println();
  }
}

  public static String pigLatinSimple(String s){ //changes an individual s to pigLatinSimple
    String result = "";
  /*  while (n.hasNextLine()){
      Scanner line = new Scanner (n.nextLine());
      while (line.hasNext()){ */
        if (s.charAt(0) == 'a' || s.charAt(0) == 'e' || s.charAt(0) == 'i' || s.charAt(0) == 'o' || s.charAt(0) == 'u') {
          return s + "hay ";
        }
        else{
          return s.substring(1, s.length()) + s.substring(0, 1) + "ay ";
        }
      //}
  //  }
  }
}
