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
    private JLabel[] forksLabels;
    private boolean shouldStop = false;

    static {
        philosopherNames = new HashMap<>();
        philosopherNames.put(0, "Aristotle");
        philosopherNames.put(1, "Plato");
        philosopherNames.put(2, "Socrates");
        philosopherNames.put(3, "Confucius");
        philosopherNames.put(4, "Kant");
    }
    
    public Philosopher (Table t, int philosopher, JLabel philosopherLabel, JLabel[] forksLabels) {
        this.table = t;
        this.philosopher = philosopher;
        this.indxPhilosopher = philosopher - 1;
        this.philosopherLabel = philosopherLabel;
        this.forksLabels = forksLabels;
    }
    
    public void setShouldStop(boolean shouldStop) {
        this.shouldStop = shouldStop;
    }
    
    public void run () {
        while (!shouldStop && !Thread.currentThread().isInterrupted()) {
            this.thinking();
            this.table.takeForks(this.indxPhilosopher);
            this.eating();
            System.out.println("Philosopher " + philosopherNames.get(this.philosopher) + " stops eating, forks free: " + (this.table.leftFork(this.indxPhilosopher)) + ", " + (this.table.rightFork(this.indxPhilosopher)));
            forksLabels[this.table.leftFork(this.indxPhilosopher)].setVisible(true);
            forksLabels[this.table.rightFork(this.indxPhilosopher)].setVisible(true);
            this.table.leaveForks(this.indxPhilosopher);
            
            if (Thread.currentThread().isInterrupted()) {
                return;
            }
        }
    }
    
    public void thinking () {
        System.out.println("Philosopher " + philosopherNames.get(philosopher) + " is thinking" );
        try {
            ImageUtils.SetImageLabel(philosopherLabel, "C:\\Users\\Xavi\\Documents\\NetBeansProjects\\PhilosophersDinner\\src\\main\\java\\source\\batthink.gif");
            sleep((long) (Math.random() * 4000));
        } catch (InterruptedException ex) {
            ImageUtils.SetImageLabel(philosopherLabel, "C:\\Users\\Xavi\\Documents\\NetBeansProjects\\PhilosophersDinner\\src\\main\\java\\source\\philosopher.png");
            Logger.getLogger(Philosopher.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void eating () {
        System.out.println("Philosopher " + philosopherNames.get(philosopher) + " is eating" );
        try {
            ImageUtils.SetImageLabel(philosopherLabel, "C:\\Users\\Xavi\\Documents\\NetBeansProjects\\PhilosophersDinner\\src\\main\\java\\source\\eating.gif");
            sleep((long) (Math.random() * 7000));
        } catch (InterruptedException ex) {
            ImageUtils.SetImageLabel(philosopherLabel, "C:\\Users\\Xavi\\Documents\\NetBeansProjects\\PhilosophersDinner\\src\\main\\java\\source\\philosopher.png");
            Logger.getLogger(Philosopher.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
