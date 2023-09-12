/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.philosophersdinner.backend;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import com.philosophersdinner.backend.ImageUtils;

/**
 *
 * @author Xavi
 */
public class Table {
    
    private boolean[] forks;
    private JLabel[] forksLabels;
    
    public Table (int numForks, JLabel[] forksLabels) {
        this.forks = new boolean[numForks];
        this.forksLabels = forksLabels;
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
                forksLabels[leftFork(philosopher)].setVisible(true);
                forksLabels[rightFork(philosopher)].setVisible(true);
                Logger.getLogger(Table.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        forks[leftFork(philosopher)] = true;
        forksLabels[leftFork(philosopher)].setVisible(false);
        forks[rightFork(philosopher)] = true;
        forksLabels[rightFork(philosopher)].setVisible(false);
    }
    
    public synchronized void leaveForks (int philosopher) {
        forks[leftFork(philosopher)] = false;
        forks[rightFork(philosopher)] = false;
        notifyAll();
    }
    
}
