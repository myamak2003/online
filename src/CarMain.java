public class CarMain{
    public static void main(String[] args) {
        Car car = new Car("Model X", "Tesla", 2022, 85000.0, "Black", 10);

        System.out.println(car.toString());
        car.sell(3);

        System.out.println("Model: " + car.getModel());
        System.out.println("Brand: " + car.getBrand());
        System.out.println("Year: " + car.getYear());
        System.out.println("Price: " + car.getPrice());
        System.out.println("Color: " + car.getColor());
        System.out.println("Quantity: " + car.getQuantity());

        car.setPrice(90000.0);
        car.setColor("Red");
        car.setQuantity(12);
        System.out.println(car.toString());
    }
}

