package com.company.creationalDesignPatterns.factory.implementation;

public class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
