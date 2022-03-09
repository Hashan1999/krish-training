/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author HASHA
 */
public class Topping extends FruitJuice {

    public final FruitJuice juice;

    public Topping(FruitJuice juice) {
        this.juice = juice;
    }

    @Override
    public double getPrice() {
        return juice.getPrice();
    }

    @Override
    public String getDescription() {
        return juice.getDescription();
    }

    @Override
    public String getImageUrl() {
        return juice.getImageUrl();
    }
}
