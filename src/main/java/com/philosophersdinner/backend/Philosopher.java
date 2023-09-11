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
public class Philosopher extends Thread {
    
    private Table table;
    private int philosopher;
    private int indxPhilosopher;
    
    public Philosopher (Table t, int philosopher) {
        this.table = t;
        this.philosopher = philosopher;
        this.indxPhilosopher = philosopher - 1;
    }
    
    public void run () {
        while (true) {
            this.thinking();
            this.table.takeForks(this.indxPhilosopher);
            this.eating();
            System.out.println("Philosopher stops eatingm forks free: " + (this.table.leftFork(this.indxPhilosopher) + 1) + ", " + (this.table.rightFork(this.indxPhilosopher) + 1));
            this.table.leaveForks(this.indxPhilosopher);
        }
    }
    
    public void thinking () {
        System.out.println("Philosopher " + philosopher + " is thinking" );
        try {    
            sleep((long) (Math.random() * 4000));
        } catch (InterruptedException ex) {
            Logger.getLogger(Philosopher.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void eating () {
        System.out.println("Philosopher " + philosopher + " is eating" );
        try {    
            sleep((long) (Math.random() * 7000));
        } catch (InterruptedException ex) {
            Logger.getLogger(Philosopher.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
