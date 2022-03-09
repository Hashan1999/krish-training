/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;

/**
 *
 * @author HASHA
 */
public class Helper {
   public static String getSelectedButtonText(ButtonGroup buttonGroup) {
    for (Enumeration buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
        AbstractButton button = (AbstractButton) buttons.nextElement();

        if (button.isSelected()) {
            return button.getText();
        }
    }

    return null;
}
}
