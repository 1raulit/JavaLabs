package org.example;

import java.util.Objects;

/**
 * Клас Car представляє автомобіль з базовими характеристиками.
 */
public class Car {
    private String model;
    private String brand;
    private int year;
    private double price;
    private double mileage;

    /**
     * Конструктор для створення об'єкта Car.
     *
     * @param model   модель автомобіля
     * @param brand   бренд автомобіля
     * @param year    рік випуску автомобіля
     * @param price   ціна автомобіля
     * @param mileage пробіг автомобіля
     */
    public Car(String model, String brand, int year, double price, double mileage) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.mileage = mileage;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public double getMileage() {
        return mileage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", mileage=" + mileage +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && Double.compare(car.price, price) == 0 &&
                Double.compare(car.mileage, mileage) == 0 &&
                Objects.equals(model, car.model) &&
                Objects.equals(brand, car.brand);
    }

}
