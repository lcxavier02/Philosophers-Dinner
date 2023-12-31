/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.philosophersdinner.frontend;

import com.philosophersdinner.backend.Philosopher;
import com.philosophersdinner.backend.Table;
import com.philosophersdinner.backend.ImageUtils;
import java.awt.Image;
import java.util.List;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Xavi
 */
public class Dinner extends javax.swing.JFrame {
    
    private JLabel[] philosopherLabels = new JLabel[5];
    private JLabel[] forksLabels = new JLabel[5];
    private List<Philosopher> philosophers = new ArrayList<>();

    /**
     * Creates new form Diiner
     */
    public Dinner() {
        initComponents();
        
        ImageUtils.SetImageLabel(table, "C:\\Users\\Xavi\\Documents\\NetBeansProjects\\PhilosophersDinner\\src\\main\\java\\source\\table2.png");
        ImageUtils.SetImageLabel(Ph1, "C:\\Users\\Xavi\\Documents\\NetBeansProjects\\PhilosophersDinner\\src\\main\\java\\source\\philosopher.png");
        ImageUtils.SetImageLabel(Ph2, "C:\\Users\\Xavi\\Documents\\NetBeansProjects\\PhilosophersDinner\\src\\main\\java\\source\\philosopher.png");
        ImageUtils.SetImageLabel(Ph3, "C:\\Users\\Xavi\\Documents\\NetBeansProjects\\PhilosophersDinner\\src\\main\\java\\source\\philosopher.png");
        ImageUtils.SetImageLabel(Ph4, "C:\\Users\\Xavi\\Documents\\NetBeansProjects\\PhilosophersDinner\\src\\main\\java\\source\\philosopher.png");
        ImageUtils.SetImageLabel(Ph5, "C:\\Users\\Xavi\\Documents\\NetBeansProjects\\PhilosophersDinner\\src\\main\\java\\source\\philosopher.png");
        ImageUtils.SetImageLabel(Fk1, "C:\\Users\\Xavi\\Documents\\NetBeansProjects\\PhilosophersDinner\\src\\main\\java\\source\\forky.png");
        ImageUtils.SetImageLabel(Fk2, "C:\\Users\\Xavi\\Documents\\NetBeansProjects\\PhilosophersDinner\\src\\main\\java\\source\\forky.png");
        ImageUtils.SetImageLabel(Fk3, "C:\\Users\\Xavi\\Documents\\NetBeansProjects\\PhilosophersDinner\\src\\main\\java\\source\\forky.png");
        ImageUtils.SetImageLabel(Fk4, "C:\\Users\\Xavi\\Documents\\NetBeansProjects\\PhilosophersDinner\\src\\main\\java\\source\\forky.png");
        ImageUtils.SetImageLabel(Fk5, "C:\\Users\\Xavi\\Documents\\NetBeansProjects\\PhilosophersDinner\\src\\main\\java\\source\\forky.png");
        this.repaint();
        
        philosopherLabels[0] = Ph5;
        philosopherLabels[1] = Ph1;
        philosopherLabels[2] = Ph2;
        philosopherLabels[3] = Ph3;
        philosopherLabels[4] = Ph4;
        
        forksLabels[0] = Fk1;
        forksLabels[1] = Fk2;
        forksLabels[2] = Fk3;
        forksLabels[3] = Fk4;
        forksLabels[4] = Fk5;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        startProgram = new javax.swing.JButton();
        table = new javax.swing.JLabel();
        Ph1 = new javax.swing.JLabel();
        Ph2 = new javax.swing.JLabel();
        Ph3 = new javax.swing.JLabel();
        Ph4 = new javax.swing.JLabel();
        Ph5 = new javax.swing.JLabel();
        Fk1 = new javax.swing.JLabel();
        Fk2 = new javax.swing.JLabel();
        Fk3 = new javax.swing.JLabel();
        Fk5 = new javax.swing.JLabel();
        Fk4 = new javax.swing.JLabel();
        stopButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        startProgram.setText("Iniciar");
        startProgram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startProgramActionPerformed(evt);
            }
        });

        table.setIcon(new javax.swing.ImageIcon("src/source/table2.png"));
        table.setText("jLabel1");

        Ph1.setIcon(new javax.swing.ImageIcon("/source/philosopher.png"));
        Ph1.setText("jLabel2");

        Ph2.setIcon(new javax.swing.ImageIcon("/source/philosopher.png"));
        Ph2.setText("jLabel3");

        Ph3.setIcon(new javax.swing.ImageIcon("/source/philosopher.png"));
        Ph3.setText("jLabel4");

        Ph4.setIcon(new javax.swing.ImageIcon("/source/philosopher.png"));
        Ph4.setText("jLabel7");

        Ph5.setIcon(new javax.swing.ImageIcon("/source/philosopher.png"));
        Ph5.setText("jLabel8");

        Fk1.setText("jLabel1");

        Fk2.setText("jLabel2");

        Fk3.setText("jLabel3");

        Fk5.setText("jLabel4");

        Fk4.setText("jLabel5");

        stopButton.setText("Detener");
        stopButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Ph3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(249, 249, 249)
                .addComponent(Ph2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Fk4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ph4, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(startProgram)
                                .addGap(29, 29, 29)
                                .addComponent(stopButton))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(Fk5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(table, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(Fk2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Fk3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115)))
                .addContainerGap(144, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(Ph5, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(Fk1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Ph1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(181, 181, 181))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(startProgram)
                            .addComponent(stopButton)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Ph5, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Fk1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(51, 51, 51))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Ph1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Fk2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(Ph2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Fk4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(167, 167, 167))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Fk5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(109, 109, 109)
                                .addComponent(Ph4, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                .addComponent(table, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Ph3, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Fk3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(123, 123, 123))))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void startProgramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startProgramActionPerformed
        Table t = new Table(5, forksLabels);

        for (int i = 1; i <= 5; i++) {
            Philosopher p = new Philosopher(t, i, philosopherLabels[i - 1], forksLabels);
            philosophers.add(p);
            p.start();
        }
        
        startProgram.setEnabled(false);
        stopButton.setEnabled(true);
    }//GEN-LAST:event_startProgramActionPerformed

    private void stopButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopButtonActionPerformed
        for (Philosopher philosopher : philosophers) {
            philosopher.interrupt();
            philosopher.setShouldStop(true);// Interrumpe el hilo del filósofo
        }

    // Desactivar el botón de detener
        stopButton.setEnabled(false);
        startProgram.setEnabled(true);
    }//GEN-LAST:event_stopButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fk1;
    private javax.swing.JLabel Fk2;
    private javax.swing.JLabel Fk3;
    private javax.swing.JLabel Fk4;
    private javax.swing.JLabel Fk5;
    private javax.swing.JLabel Ph1;
    private javax.swing.JLabel Ph2;
    private javax.swing.JLabel Ph3;
    private javax.swing.JLabel Ph4;
    private javax.swing.JLabel Ph5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton startProgram;
    private javax.swing.JButton stopButton;
    private javax.swing.JLabel table;
    // End of variables declaration//GEN-END:variables
}
