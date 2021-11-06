
package stringsumdigits;
import java.util.Scanner;

public class StringSumDigits {

    public static void main(String[] args) {
        
        System.out.println("Введите число");
        Scanner input = new Scanner(System.in);
        
        String number = input.nextLine();
        System.out.println("Ваше число:"+ number);
        
        int n = number.length();
        int l = 1;
        int numLastChar = n - l;
        
           for(int i = numLastChar; i >= 0; i--)
         {
             System.out.println(number.charAt(i));
             
         }
           String goodSymbols = "1234567890";
           for(int i = 0; i < number.length(); i++)
           {
           String currentSym = String.valueOf(number.charAt(i));
           if(goodSymbols.contains(currentSym) == false)
           {
               
               System.out.println("ОШИБКА!ВВЕДИТЕ ЧИСЛО!");
               
           }
           }
         
         
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
