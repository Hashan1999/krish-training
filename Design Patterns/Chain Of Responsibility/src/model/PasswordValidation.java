/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import gui.SignUp;
import javax.swing.JOptionPane;

/**
 *
 * @author HASHA
 */
public class PasswordValidation extends Validation {

    @Override
    public void process(User user) {

        boolean isContainsUpperCase = false;
        boolean isContainsLowerCase = false;
        boolean isContaisNumbers = false;

        if (!user.getPassword().isBlank()) {
            char[] c = user.getPassword().toCharArray();
            for (char d : c) {
                if (Character.isUpperCase(d)) {
                    isContainsUpperCase = true;
                } else if (Character.isLowerCase(d)) {
                    isContainsLowerCase = true;
                } else if (Character.isDigit(d)) {
                    isContaisNumbers = true;
                }
            }
            if (isContainsUpperCase) {
                if (isContainsLowerCase) {
                    if (isContaisNumbers) {
                        if (c.length >= 8) {
                            this.validation.process(user);
                        } else {
                            JOptionPane.showMessageDialog(SignUp.frame, "Password Should Contains atleast 8 characters", "Sign Up", JOptionPane.INFORMATION_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(SignUp.frame, "Password Should Contains Numbers", "Sign Up", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(SignUp.frame, "Password Should Contains Lower case letters", "Sign Up", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(SignUp.frame, "Password Should Contains Capital Letters", "Sign Up", JOptionPane.INFORMATION_MESSAGE);
            }

        } else {
            
            JOptionPane.showMessageDialog(SignUp.frame, "Password Field cannot be empty", "Sign Up", JOptionPane.INFORMATION_MESSAGE);
        }

    }

}
