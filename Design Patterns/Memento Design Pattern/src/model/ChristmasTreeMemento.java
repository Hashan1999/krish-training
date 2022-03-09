/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.JLabel;

/**
 *
 * @author HASHA
 */
public class ChristmasTreeMemento {
     private final JLabel decorationLabel;

    public ChristmasTreeMemento(JLabel decorationLabel) {
        this.decorationLabel = decorationLabel;
    }

    public JLabel getDecorationLabel() {
        return decorationLabel;
    } 
}
