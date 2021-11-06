
package math;

 class MyMathLibraryTester {

    
    public static void main(String[] args) {
           double a = 3;
    double b = 4;
    double c = 5;
    
    double p = (a + b + c)/2;
    double Geron = Math.sqrt(p*(p-a)*(p-b)*(p-c));
    
        System.out.println("Ответ = "+Geron);
        
        double A = 4;
        double B = 3;
        double C = Math.sqrt((3*3)+(4*4));
        
        System.out.println("Ответ = "+C);

        
    }
    
}
