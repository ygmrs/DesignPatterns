package com.company.creationalDesignPatterns.abstractFactory.animal;

public interface AbstractFactory<T> {

    T create(String type);
}
