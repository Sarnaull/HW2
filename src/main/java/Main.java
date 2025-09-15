import Cars.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    //it's Main origin
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        // Создаем и добавляем автомобили
        cars.add(new Suzuki("Swift", 2005, "зеленый", false, 1.3));
        cars.add(new Suzuki("Vitara", 2010, "синий", true, 1.6));
        cars.add(new Toyota("Camry", 2015, "черный", true, 2.5));
        cars.add(new Toyota("Prius", 2020, "зеленый", true, 1.8));
        cars.add(new Honda("Civic", 2007, "красный", false, 1.6));
        cars.add(new Honda("Accord", 2003, "белый", true, 2.0));
        cars.add(new BMW("X5", 2018, "зеленый", true, 3.0));
        cars.add(new BMW("3 Series", 2008, "серый", true, 2.0));
        cars.add(new Mercedes("E-Class", 2012, "черный", true, 2.2));
        cars.add(new Mercedes("C-Class", 2006, "серебристый", false, 1.8));

        // Вызываем методы согласно заданию
        printCarsAfter2006(cars);
        changeGreenToRed(cars);
        printAutomaticCars(cars); // Дополнительный метод
    }

    // 1. Метод для вывода авто после 2006 года
    public static void printCarsAfter2006(List<Car> cars) {
        System.out.println("Автомобили после 2006 года");
        for (Car car : cars) {
            if (car.getYear() > 2006) {
                System.out.println(car.getFullInfo());
            } else {
                System.out.println("устаревший авто: " + car.getBrand() + " " + car.getModel() + " " + car.getYear());
            }
        }
        System.out.println();
    }

    // 2. Метод для изменения зеленого цвета на красный
    public static void changeGreenToRed(List<Car> cars) {
        System.out.println("Изменение зеленого цвета на красный");
        for (Car car : cars) {
            if ("зеленый".equalsIgnoreCase(car.getColor())) {
                System.out.println("Меняем цвет: " + car.getBrand() + " " + car.getModel() +
                        " с " + car.getColor() + " на красный");
                car.setColor("красный");
            }
        }
        System.out.println();
    }

    // 3. Дополнительный метод: вывод автомобилей с автоматической коробкой
    public static void printAutomaticCars(List<Car> cars) {
        System.out.println("Автомобили с автоматической коробкой передач");
        for (Car car : cars) {
            if (car.isAutomatic()) {
                System.out.println(car.getFullInfo());
            }
        }
    }
}