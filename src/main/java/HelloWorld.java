import java.io.IOException;
import java.util.Scanner;
import java.io.InputStreamReader;

public class MyClass {

  public static void main(String[] args) {
      Scanner scanner = new Scanner(new InputStreamReader(System.in));
    String originalStr = "Hello";
    String reversedStr = "";
    System.out.println("Original string: " + originalStr);
        
    for (int i = 0; i < originalStr.length(); i++) {
      reversedStr = originalStr.charAt(i) + reversedStr;
      System.out.println("reversedStr ===> " + reversedStr);
//      System.out.println("Please hit enter: ");
    //    String input = scanner.nextLine();
    }
    
    System.out.println("Reversed string: "+ reversedStr);
  }

}
