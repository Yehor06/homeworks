
package cartest;
 class CarTest {

    
    public static void main(String[] args) {
        driver driver1 = new driver("Ivan", "Ivanov", "Ivanovich");
        System.out.println(driver1);
        Car car1 = new Car(2000, 2000, "CarBand", "salesman");
        
        System.out.println(car1);
    }
    
}
