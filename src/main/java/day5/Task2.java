package day5;


public class Task2 {
    public static void main(String[] args) {

    Motorbike motorbike1 = new Motorbike("Lada", "Черный", 2020 );
        System.out.println(motorbike1.getModel());
        System.out.println(motorbike1.getColor());
        System.out.println(motorbike1.getYear());

    }
}

class Motorbike {
    private final String model;
    private final String color;
    private final int year;

    public Motorbike(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }
    public String getModel() {
        return model;
    }
    public String getColor() {
        return color;
    }
    public int getYear() {
        return year;
    }
}
