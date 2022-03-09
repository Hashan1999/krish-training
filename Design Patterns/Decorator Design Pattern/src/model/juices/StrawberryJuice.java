/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.juices;

import model.FruitJuice;

/**
 *
 * @author HASHA
 */
public class StrawberryJuice extends FruitJuice {

    private String imageUrl = "/resources/invoiceimg/StrawberryJuice.png";

    @Override
    public String getImageUrl() {
        return imageUrl;
    }

    @Override
    public double getPrice() {
        return 200.0;
    }

    @Override
    public String getDescription() {
        return "Strawberry Juice";
    }
}
