
package cartest;


public class Car {

    public Car(int year, int year1, String CarBand, String salesman) {
        this.year = year;
        this.year1 = year1;
        this.CarBand = CarBand;
        this.salesman = salesman;
    }

    @Override
    public String toString() {
        return "Car{" + "year=" + year + ", year1=" + year1 + ", CarBand=" + CarBand + ", salesman=" + salesman + '}';
    }

    public int getYear() {
        return year;
    }

    public int getYear1() {
        return year1;
    }

    public String getCarBand() {
        return CarBand;
    }

    public String getSalesman() {
        return salesman;
    }

    public void setCarBand(String CarBand) {
        this.CarBand = CarBand;
    }
    int year;
    int year1;
    String CarBand;
    String salesman;
    
}
