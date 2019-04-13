package pl.sda.set;

import java.util.Objects;

public class Car {
    private String win;
    private String brand;
    private String color;

    // konstruktor
    public Car(String win, String brand, String color) {
        this.win = win;
        this.brand = brand;
        this.color = color;
    }

    public String getWin() {
        return win;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "win='" + win + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(win, car.win);
    }

    @Override
    public int hashCode() {
        return Objects.hash(win);
    }
} // class Car
