package com.company.creationalDesignPatterns.abstractFactory.implementation;

public class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
