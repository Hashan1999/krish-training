/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Stack;

/**
 *
 * @author HASHA
 */
public class ChristmasTreeCaretaker {
     private final Stack<ChristmasTreeMemento> mementoList = new Stack<>();

    public void addMemento(ChristmasTreeMemento memento) {
        mementoList.push(memento);
    }

    public ChristmasTreeMemento getMemento() {
        return mementoList.pop();
    }
}



