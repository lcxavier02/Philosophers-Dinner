/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.philosophersdinner.backend;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Xavi
 */
public class Table {
    
    private boolean[] forks;
    
    public Table (int numForks) {
        this.forks = new boolean[numForks];
    }
    
    public int leftFork (int i) {
        return i;
    }
    
    public int rightFork (int i) {
        if (i == 0) {
            return this.forks.length - 1;
        } else {
            return i -1;
        }
    }
    
    public synchronized void takeForks (int philosopher) {
        while (forks[leftFork(philosopher)] || forks[rightFork(philosopher)]) {
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Table.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        forks[leftFork(philosopher)] = true;
        forks[rightFork(philosopher)] = true;
    }
    
    public synchronized void leaveForks (int philosopher) {
        forks[leftFork(philosopher)] = false;
        forks[rightFork(philosopher)] = false;
        notifyAll();
    }
    
}
