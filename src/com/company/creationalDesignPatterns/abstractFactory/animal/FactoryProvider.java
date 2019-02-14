package com.company.creationalDesignPatterns.abstractFactory.animal;


public class FactoryProvider {

    public AbstractFactory getFactory(String choice){
        if("Animal".equalsIgnoreCase(choice)){
            return new AnimalFactory();
        }
        else if("Color".equalsIgnoreCase(choice)){
            return new ColorFactory();
        }
        return null;
    }


}
