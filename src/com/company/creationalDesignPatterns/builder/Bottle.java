package com.company.creationalDesignPatterns.builder;

public class Bottle implements Packing{
    @Override
    public String pack() {
        return "Bottle";
    }
}