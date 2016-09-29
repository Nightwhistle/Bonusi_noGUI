/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smegi.bonusi;

import com.smegi.bonusi.model.Database;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sergej
 */
public class Bonusi {

    public static void main(String[] args) {

        Database db = new Database();

        while (true) {
            try {
                db.getUsersList();
                db.setNews();
                System.out.println(new Date());
                Thread.sleep(1000 * 60);
            } catch (InterruptedException ex) {
                Logger.getLogger(Bonusi.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
