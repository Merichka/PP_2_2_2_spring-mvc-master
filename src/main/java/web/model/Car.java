package web.model;

public class Car {
    private String brand;
    private String color;
    private int series;

    public Car() {

    }

    public Car(String brand, String color, int series) {
        this.brand = brand;
        this.color = color;
        this.series = series;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public int getSeries() {
        return series;
    }
}
