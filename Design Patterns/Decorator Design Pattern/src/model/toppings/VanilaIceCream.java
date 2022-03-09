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
public class VanilaIceCream extends Topping{
    
    public VanilaIceCream(FruitJuice juice) {
        super(juice);
    }
    
       @Override
    public double getPrice() {
   return juice.getPrice()+50.0;
    }

    @Override
    public String getDescription() {
    return juice.getDescription()+" With Vanila Ice Cream ";
    }
    
}
