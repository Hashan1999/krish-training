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
public class MobileValidation extends Validation {

    @Override
    public void process(User user) {
        if (user.getMobile().isBlank()) {

            JOptionPane.showMessageDialog(SignUp.frame, "Mobile Field cannot be empty", "Sign Up", JOptionPane.INFORMATION_MESSAGE);
        } else if (!checkNumberCount(user.getMobile())) {
            JOptionPane.showMessageDialog(SignUp.frame, "Mobile Field should contains 10 numbers", "Sign Up", JOptionPane.INFORMATION_MESSAGE);

        } else {
            this.validation.process(user);
        }
    }

    boolean checkNumberCount(String mobile) {
        try {
            int mobNum = Integer.parseInt(mobile);
            if (mobile.length() != 10) {
                return false;
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
