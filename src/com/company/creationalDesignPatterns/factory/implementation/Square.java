package com.company.creationalDesignPatterns.factory.implementation;

public class Square implements Shape{

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
