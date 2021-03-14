package com.company;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("dog");
        dog.name="Szarik";
        Car car1 = new Car("A3","Audi","120k");

        Human me = new Human();
        me.firstName="Patryk";
        me.lastName="Aleksandrowicz";
        me.age=21;
        me.sex="men";
        me.car=car1;

        System.out.println(car1.model+car1.producer+car1.price);

    }
}