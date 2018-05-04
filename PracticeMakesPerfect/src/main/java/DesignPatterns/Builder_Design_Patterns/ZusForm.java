//// Builder design pattern
//
//package DesignPatterns.Builder_Design_Patterns;
//
//public class ZusForm {
//
//    private String name;
//
//    private String surname;
//
//    private String city;
//
//    private String street;
//
//    private int streetNumber;
//
//    private boolean female;
//
//    private int age;
//
//    public static class ZusFormBuilder {
//
//        private String name;
//
//        private String surname;
//
//        private String city;
//
//        private String street;
//
//        private int streetNumber;
//
//        private boolean female;
//
//        private int age;
//
//
//        public ZusFormBuilder name(String name) {
//
//            this.name = name;
//
//            return this;
//
//        }
//
//        public ZusFormBuilder surname(String surname) {
//
//            this.surname = surname;
//            return this;
//
//        }
//
//        public ZusFormBuilder city(String city) {
//
//            this.city = city;
//            return this;
//
//        }
//
//        public ZusFormBuilder street(String street) {
//
//            this.street = street;
//            return this;
//
//        }
//
//        public ZusFormBuilder streetNumber(int streetNumber) {
//
//            this.streetNumber = streetNumber;
//            return this;
//
//        }
//
//        public ZusFormBuilder female(boolean female) {
//
//            this.female = female;
//            return this;
//
//        }
//
//        public ZusFormBuilder age(int age) {
//
//            this.age = age;
//            return this;
//
//        }
//
//        public ZusFormBuilder build(name, surname, city, street, streetNumber, female, age){ //Builder's constructor method
//
//            return new ZusFormBuilder();
//
//        }
//
//    }
//
//}
