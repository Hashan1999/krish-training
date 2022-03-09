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
public abstract class Validation {

    Validation validation;

    public void setNext(Validation validation) {
        this.validation = validation;
    }

    public abstract void process(User user);

}
