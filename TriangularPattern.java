import java.util.*;
public class TriangularPattern {
    public void printPattern(int lines){
        Scanner scan = new Scanner(System.in);
        int lines = scan.nextInt();
        for (int i = 1; i <= lines; i++){
          for (int j = 1; j <= i; j++){
              System.out.print("*");
          }
          System.out.println();
        }
        for (int i = 1; i <= lines; i++){
          for (int j = (lines - 1); j >= i; j--){
              System.out.print("*");
          }
          System.out.println();
        }
        System.out.println();
    }
}
}
