
package stringwordstester;
import java.util.Scanner;


public class StringWordsTester {

   
    public static void main(String[] args) {
             System.out.println("Напишите что-то!?");
         Scanner input = new Scanner(System.in);
         
         String phrase = input.nextLine();
         //String name = input.next();
         System.out.println("Вы думаете что:" + phrase);
         
         int n = phrase.length();
        int l = 1;
         int numLastChar = n - l;
         
         
         for(int i = numLastChar; i >= 0; i--)
         {
             System.out.println(phrase.charAt(i));
             
         }
          if(n>=4)
         {
             String newString = phrase.substring(l,3 + l);
             System.out.println(newString);
         }
         String[] words = phrase.split(" ");
         int M = words.length;
         
    }
    
}
