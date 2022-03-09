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
public class Tree {

    private ChristmasTreeCaretaker caretaker = new ChristmasTreeCaretaker();
    private JLabel decorationLabel;

    public Tree(JLabel decorationLabel) {
        this.decorationLabel = decorationLabel;
    }

    public Tree() {
    }

    public JLabel getDecorationLabel() {
        return decorationLabel;
    }

    public void save(JLabel decorationLabel) {
        this.decorationLabel = decorationLabel;
        caretaker.addMemento(new ChristmasTreeMemento(decorationLabel));
    }

    public void undo() {
        this.decorationLabel = caretaker.getMemento().getDecorationLabel();

    }
}
