package com.company.creationalDesignPatterns.factory.implementation;

public class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
