/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.philosophersdinner.backend;

/**
 *
 * @author Xavi
 */
public class PhilosophersDinner {

    public static void main(String[] args) {
        Table t = new Table(5);
        
        for (int i = 1; i <= 5; i++) {
            Philosopher p = new Philosopher(t, i);
            p.start();
        }
    }
}
