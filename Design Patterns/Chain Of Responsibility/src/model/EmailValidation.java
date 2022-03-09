/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import gui.SignUp;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author HASHA
 */
public class EmailValidation extends Validation {

    @Override
    public void process(User user) {
        if (!user.getEmail().isBlank()) {

            String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(user.getEmail());
            if (matcher.matches()) {
                JOptionPane.showMessageDialog(SignUp.frame, "Successfully validated!!", "Sign Up", JOptionPane.INFORMATION_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(SignUp.frame, "Invalid Email!", "Sign Up", JOptionPane.INFORMATION_MESSAGE);

            }

        } else {

            JOptionPane.showMessageDialog(SignUp.frame, "Email Field cannot be empty", "Sign Up", JOptionPane.INFORMATION_MESSAGE);
        }

    }

}
