import java.util.ArrayList;
import java.util.Collections;


    class Car implements Comparable<Car> {
        private String model;
        private int year;
        public Car(String model, int year) {
            this.model = model;
            this.year = year;
        }
        public int getYear() {
            return year;
        }

        public String getModel() {
            return model;
        }

        @Override
        public int compareTo(Car other) {
            return Integer.compare(this.year, other.year);
        }
        @Override
        public String toString() {
            return "Car: model= " + model + ", year=" + year;
        }
        public static void main(String[] args) {
            ArrayList<Car> cars = new ArrayList<>();
            cars.add(new Car("Mazda", 2020));
            cars.add(new Car("Honda", 2018));
            cars.add(new Car("BMW", 2019));
            cars.add(new Car("Ferrari", 2015));
            cars.add(new Car("Skoda", 2017));
            cars.add(new Car("Audi", 2021));
            cars.add(new Car("Mercedes", 2016));
            cars.add(new Car("Porsche", 2014));
            cars.add(new Car("Hyundai", 2022));
            cars.add(new Car("Volvo", 2013));
            Collections.sort(cars);
            for (Car car : cars) {
                System.out.println(car);
            }
        }
    }

