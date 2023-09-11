/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.philosophersdinner.backend;

import com.philosophersdinner.backend.ImageUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/**
 *
 * @author Xavi
 */
public class Philosopher extends Thread {
    
    private Table table;
    private int philosopher;
    private int indxPhilosopher;
    private static Map<Integer, String> philosopherNames;
    private JLabel philosopherLabel;

    static {
        philosopherNames = new HashMap<>();
        philosopherNames.put(1, "Aristotle");
        philosopherNames.put(2, "Plato");
        philosopherNames.put(3, "Socrates");
        philosopherNames.put(4, "Confucius");
        philosopherNames.put(5, "Kant");
    }
    
    public Philosopher (Table t, int philosopher, JLabel philosopherLabel) {
        this.table = t;
        this.philosopher = philosopher;
        this.indxPhilosopher = philosopher - 1;
        this.philosopherLabel = philosopherLabel;
    }
    
    public void run () {
        while (true) {
            this.thinking();
            this.table.takeForks(this.indxPhilosopher);
            this.eating();
            System.out.println("Philosopher " + philosopherNames.get(this.philosopher) + " stops eating, forks free: " + (this.table.leftFork(this.indxPhilosopher) + 1) + ", " + (this.table.rightFork(this.indxPhilosopher) + 1));
            this.table.leaveForks(this.indxPhilosopher);
        }
    }
    
    public void thinking () {
        System.out.println("Philosopher " + philosopherNames.get(philosopher) + " is thinking" );
        try {
            ImageUtils.SetImageLabel(philosopherLabel, "C:\\Users\\Xavi\\Documents\\NetBeansProjects\\PhilosophersDinner\\src\\main\\java\\source\\thinking.gif");
            sleep((long) (Math.random() * 4000));
        } catch (InterruptedException ex) {
            Logger.getLogger(Philosopher.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void eating () {
        System.out.println("Philosopher " + philosopherNames.get(philosopher) + " is eating" );
        try {
            ImageUtils.SetImageLabel(philosopherLabel, "C:\\Users\\Xavi\\Documents\\NetBeansProjects\\PhilosophersDinner\\src\\main\\java\\source\\eating.gif");
            sleep((long) (Math.random() * 7000));
        } catch (InterruptedException ex) {
            Logger.getLogger(Philosopher.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
