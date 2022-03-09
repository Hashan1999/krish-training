/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.toppings;

import model.FruitJuice;
import model.Topping;

/**
 *
 * @author HASHA
 */
public class WhippingCream extends Topping {

    public WhippingCream(FruitJuice juice) {
        super(juice);
    }

    @Override
    public double getPrice() {
        return juice.getPrice() + 20.0;
    }

    @Override
    public String getDescription() {
        return juice.getDescription() + " With Whipping Cream ";
    }
}
