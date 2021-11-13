
package stringexample;
import java.util.Scanner;


public class StringExample {

   
    public static void main(String[] args) {
        
        
         System.out.println("Как вас зовут?");
         Scanner input = new Scanner(System.in);
         
         String name = input.nextLine();
         //String name = input.next();
         System.out.println("Ну, привет," + name);
         
         int n = name.length();
        int l = 1;
         int numLastChar = n - l;
         
         for(int i = numLastChar; i >= 0; i--)
         {
             System.out.println(name.charAt(i));
             
         }
         
         if(n>=4)
         {
             String newString = name.substring(l,3 + l);
             System.out.println(newString);
         }
         //String[] words = name.split(" ");
         //int M = words.length;
         //String firstName = words[0];
         //String lastName = words[l];
         
         
         //System.out.printf("Вы ввели слов %d, это имя = %s и фамилия = %s \n", M, firstName, lastName);
         
         
         //boolean result = name.contains(lastName);
         //if (result == true)
         //{
            // System.out.println("Строка ="+name+" содержит строку = "+lastName);
             
             
              
         }
         
    }
    

