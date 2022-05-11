package day5;

public class Task1 {
    public static void main(String[] args) {

    Car car1 = new Car();
    car1.setModel("Какая-то модель");
        System.out.println(car1.getModel());
    car1.setColor("Какой-то цвет");
        System.out.println(car1.getColor());
    car1.setYear(1984);
        System.out.println(car1.getYear());

    }
}

class Car {
    private String model;
    private String color;
    private int year;

    public void setModel(String model1) {
        model = model1;
    }
    public String getModel() {
        return model;
    }
    public void setColor(String color1) {
        color = color1;
    }
    public String getColor() {
        return color;
    }
    public void setYear (int year1) {
        year = year1;
    }
    public int getYear() {
        return year;
    }
}

//*