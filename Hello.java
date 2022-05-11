import java.util.*;
public class Hello{
  private static Scanner scan;

  public static void main(String[] args) {
    scan = new Scanner(System.in);
    String word = scan.nextLine();
    System.out.println(word);
  }
}