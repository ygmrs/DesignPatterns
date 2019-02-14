package com.company.creationalDesignPatterns.abstractFactory.animal;

import com.company.creationalDesignPatterns.abstractFactory.animal.colorFamily.Black;
import com.company.creationalDesignPatterns.abstractFactory.animal.colorFamily.Brown;
import com.company.creationalDesignPatterns.abstractFactory.animal.colorFamily.Color;
import com.company.creationalDesignPatterns.abstractFactory.animal.colorFamily.White;

public class ColorFactory implements AbstractFactory<Color>{

    @Override
    public Color create(String type) {
        if("Black".equalsIgnoreCase(type)){
            return new Black();
        }else if("Brown".equalsIgnoreCase(type)){
            return new Brown();
        }else if("White".equalsIgnoreCase(type)){
            return new White();
        }
        return null;
    }
}
