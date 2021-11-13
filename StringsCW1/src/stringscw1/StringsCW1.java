package stringscw1;
import java.util.Scanner;


public class StringsCW1 {

    public static void main(String[] args) {
        System.out.println("Напишите что-то!");
        Scanner input = new Scanner(System.in);
        
        String phrase = input.nextLine();
        
        System.out.println("Вы ввели " + phrase);
        
       int w = word.length();
       int z = 1;
       int numLastWrd = w - z;
       
        for(int i = numLastWrd; i >= 0; i--)
         {
             System.out.println(word.charAt(i));
             
         }
    }
    
}
