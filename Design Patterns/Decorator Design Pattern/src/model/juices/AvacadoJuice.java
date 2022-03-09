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
public class AvacadoJuice extends FruitJuice {

    private String imageUrl = "/resources/invoiceimg/avocado.png";

    @Override
    public double getPrice() {
        return 120.0;
    }

    @Override
    public String getDescription() {
        return "Avacado Juice";
    }

    @Override
    public String getImageUrl() {
        return imageUrl;
    }

}
