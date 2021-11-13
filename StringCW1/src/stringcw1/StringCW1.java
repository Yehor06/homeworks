
package stringcw1;
import java.util.Scanner;
import java.io.BufferedReader;//+
import java.io.FileWriter;//+
import java.io.PrintWriter;//+
import java.io.IOException;
import java.io.InputStreamReader;//+
import java.io.FileReader;//+
import java.util.logging.Level;
import java.util.logging.Logger;

public class StringCW1 {

    
    public static void main(String[] args) {
     
         System.out.println("Введите что-то");
         
         Scanner input = new Scanner(System.in);
         
         String word = input.nextLine();
         //String name = input.next();
         System.out.println("Вы ввели" + word);
         
         int n = word.length();
        int l = 1;
         int numLastWord = n - l;
         
         for(int i = numLastWord; i >= 0; i--)
         {
             System.out.println(word.charAt(i));
             
         }
         
         if(n>=4)
         {
             String newString = word.substring(l,3 + l);
             System.out.println(newString);
         }
    }
    
}
