/*
package DesignPatterns.Builder_Design_Patterns_Car;

import java.util.List;

public class Car {

    private String make;

    private String model;

    private double engine;

    private int year;

    private long mileage;

    private String country_of_origin;

    private List<String> features;

    private enum engine_type;

    public Car(String make, String model, double engine, int year, long mileage, String country_of_origin, List<String> features) {
        this.make = make;
        this.model = model;
        this.engine = engine;
        this.year = year;
        this.mileage = mileage;
        this.country_of_origin = country_of_origin;
        this.features = features;
    }

    public static class CarBuilder(){

        private String make;

        private String model;

        private double engine;

        private int year;

        private long mileage;

        private String country_of_origin;

        private List<String> features;

        private enum engine_type;


        public static CarBuilder builder(){

            return new CarBuilder();

        }

        public CarBuilder(String make){

           this.make = make;
           return this;
       }

        public CarBuilder(String model){

           this.model = model;
           return this;

        }

         public CarBuilder(double engine){

           this.engine = engine;
           return this;

        }

         public CarBuilder(int year){

           this.year = year;
           return this;

        }

         public CarBuilder(long mileage){

           this.mileage = mileage;
           return this;

        }

         public CarBuilder(String country_of_origin){

           this.country_of_origin = country_of_origin;
           return this;

        }

         public CarBuilder(List <String> features) {

            this.features = features;
            return this;

        }

        public Car build(){

            return new Car(make, model, engine, year, mileage, country_of_origin,features);

        }

    }

}
*/
