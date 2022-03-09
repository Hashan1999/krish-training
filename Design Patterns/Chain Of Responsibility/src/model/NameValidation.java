/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import gui.SignUp;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author HASHA
 */
public class NameValidation extends Validation {

    @Override
    public void process(User user) {
        if (!user.getName().isBlank()) {
            this.validation.process(user);
        } else {

            JOptionPane.showMessageDialog(SignUp.frame, "Name Field cannot be empty", "Sign Up", JOptionPane.INFORMATION_MESSAGE);
        }

    }

}
