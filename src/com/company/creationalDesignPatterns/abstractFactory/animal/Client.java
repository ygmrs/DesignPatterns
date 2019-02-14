package com.company.creationalDesignPatterns.abstractFactory.animal;

import com.company.creationalDesignPatterns.abstractFactory.animal.animalFamily.Animal;

public class Client {

    public static void main(String[] args) {
        FactoryProvider factoryProvider = new FactoryProvider();
        AbstractFactory abstractFactory  = factoryProvider.getFactory("Animal");
        Animal animal = (Animal) abstractFactory.create("Dog");
        System.out.println(animal.makeSound());
    }
}
