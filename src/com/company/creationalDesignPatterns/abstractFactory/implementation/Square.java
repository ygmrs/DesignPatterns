package com.company.creationalDesignPatterns.abstractFactory.implementation;

public class Square implements Shape{

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
