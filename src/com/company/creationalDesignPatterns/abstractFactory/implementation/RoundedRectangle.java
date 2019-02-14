package com.company.creationalDesignPatterns.abstractFactory.implementation;

public class RoundedRectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Inside RoundedRectangle::draw() method.");
    }
}
