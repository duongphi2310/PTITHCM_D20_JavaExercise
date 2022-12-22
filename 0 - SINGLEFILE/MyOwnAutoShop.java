class Car {
    private int    speed;
    private double regularPrice;
    private String color;

    public double getSalePrice() {
        return regularPrice;
    }
    public Car(int speed, double regularPrice, String color) {
        this.speed        = speed;
        this.regularPrice = regularPrice;
        this.color        = color;
    }
    public String toString() {
        return "Speed        : " + speed + " km/h\nRegular Price: " + regularPrice + " $\nColor        : " + color; 
    }
 }
class Truck extends Car {
    private int weight;

    public Truck(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    } 
    public double getSalePrice() {
        if (weight > 2000) {
            return super.getSalePrice() * 0.9;
        }
        else {
            return super.getSalePrice() * 0.8;
        }
    }
    public String toString() {
        return "TRUCK: \n" + super.toString() + "\nWeight       : " + weight + " kg"; 
    }
}
class Ford extends Car {
    private int year;
    private int manufacturerDiscount;

    public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
        super(speed, regularPrice, color);
        this.year                 = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }
    public double getSalePrice() {
        return super.getSalePrice() - manufacturerDiscount;
    }
    public String toString() {
        return "FORD: \n" + super.toString() + "\nYear         : " + year + "\nManufacturer Discount: " + manufacturerDiscount;
    }
}
public class MyOwnAutoShop {
    public static void main(String[] args) {
        Truck truck1 = new Truck(90, 120000, "GRAY", 9000);
        System.out.println(truck1);
        System.out.println("Sale Price   : " + truck1.getSalePrice() + " $");

        System.out.println("");

        Ford ford1 = new Ford(100, 240000, "BLACK", 2022, 15000);
        System.out.println(ford1);
        System.out.println("Sale Price   : " + ford1.getSalePrice() + " $");
    }
}
