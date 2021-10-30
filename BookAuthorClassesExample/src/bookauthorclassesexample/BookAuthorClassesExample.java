
package bookauthorclassesexample;


public class BookAuthorClassesExample {

    
    public static void main(String[] args) {
         
        Author author1 = new Author("Самуэл", "etoo", "ETOO");
        System.out.println(author1);
        Book book1 = new Book("Приключения",1895,1900,author1,"Издатель в Америке");
        
        System.out.println(book1);
        
    }
    
}
