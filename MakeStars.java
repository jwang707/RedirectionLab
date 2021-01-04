import java.util.*;
public class MakeStars{
  public static void main(String[] args) {
    Scanner n = new Scanner(System.in);
    String result = "";
    while (n.hasNextLine()){
      String line = n.nextLine();
      for (int i = 0; i < line.length(); i++){
          if (line.charAt(i) == ' ') {
            result += " ";
          }
          else result += "*";
      }
      result += "\n";
    }
    System.out.println(result);
  }
}
