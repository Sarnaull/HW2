package Cars;

public abstract class Car {
    private String brand;
    private String model;
    private int year;
    private String color;
    private boolean isAutomatic;
    private double engineVolume;

    public Car(String brand, String model, int year, String color,
               boolean isAutomatic, double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.isAutomatic = isAutomatic;
        this.engineVolume = engineVolume;
    }

    public String getFullInfo() {
        return brand + " " + model + " " + year + " года, цвет: " + color +
                ", коробка: " + (isAutomatic ? "автомат" : "механика") +
                ", объем двигателя: " + engineVolume + "л";
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Геттеры
    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public int getYear() { return year; }
    public String getColor() { return color; }
    public boolean isAutomatic() { return isAutomatic; }
    public double getEngineVolume() { return engineVolume; }
}
