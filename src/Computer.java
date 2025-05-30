public class Computer {
    String brand;
    String color;
    int capacity;

    public Computer(){
        System.out.println("Hello World");
    }

    public Computer(String brand, String color) {
        this();
        System.out.println("Hello Pragra");
        this.brand = brand;
        this.color = color;
    }

    public Computer(String brand, String color, int capacity) {
        this("Hp", "Grey");
        System.out.println("Hello Students");
        this.brand = brand;
        this.color = color;
        this.capacity = capacity;
    }

    public void display(){
        System.out.println(brand);
        System.out.println(color);
        System.out.println(capacity);
    }


}
