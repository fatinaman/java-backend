package module07;
class Circle{
    static double PI = 3.14159;
    static double area(double radius){
        return PI*radius*radius;
    }
}

class TemperatureConverter{
    static double celsiusToFahrenheit(double celsius){
        double fahrenheit = (celsius * 9.0 / 5.0) + 32;
        return fahrenheit;
    }
    static double fahrenheitToCelsius(double fahrenheit){
        double celsius = (fahrenheit - 32.0) * 5.0 / 9.0;
        return celsius;
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println(Circle.area(5));   
        System.out.println(TemperatureConverter.celsiusToFahrenheit(120.5));
    }
}
