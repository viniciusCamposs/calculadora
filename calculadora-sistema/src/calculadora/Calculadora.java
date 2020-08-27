/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.awt.Color;

/**
 *
 * @author Vinícius Alves de Campos
 */
public class Calculadora extends javax.swing.JFrame {

    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        painel_principal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_cancel = new javax.swing.JButton();
        btn_mais = new javax.swing.JButton();
        btn_res = new javax.swing.JButton();
        btn_menos = new javax.swing.JButton();
        btn_div = new javax.swing.JButton();
        btn_0 = new javax.swing.JButton();
        btn_mult = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        painel_principal.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("0");
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btn_cancel.setBackground(new java.awt.Color(204, 204, 204));
        btn_cancel.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        btn_cancel.setForeground(new java.awt.Color(102, 102, 102));
        btn_cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/logout.png"))); // NOI18N
        btn_cancel.setBorderPainted(false);
        btn_cancel.setFocusPainted(false);
        btn_cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_cancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_cancelMouseExited(evt);
            }
        });
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });

        btn_mais.setBackground(new java.awt.Color(102, 102, 102));
        btn_mais.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        btn_mais.setForeground(new java.awt.Color(204, 204, 204));
        btn_mais.setText("+");
        btn_mais.setBorderPainted(false);
        btn_mais.setFocusPainted(false);
        btn_mais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_maisMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_maisMouseExited(evt);
            }
        });

        btn_res.setBackground(new java.awt.Color(102, 102, 102));
        btn_res.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        btn_res.setForeground(new java.awt.Color(204, 204, 204));
        btn_res.setText("=");
        btn_res.setBorderPainted(false);
        btn_res.setFocusPainted(false);
        btn_res.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_resMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_resMouseExited(evt);
            }
        });

        btn_menos.setBackground(new java.awt.Color(102, 102, 102));
        btn_menos.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        btn_menos.setForeground(new java.awt.Color(204, 204, 204));
        btn_menos.setText("-");
        btn_menos.setBorderPainted(false);
        btn_menos.setFocusPainted(false);
        btn_menos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_menosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_menosMouseExited(evt);
            }
        });

        btn_div.setBackground(new java.awt.Color(102, 102, 102));
        btn_div.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        btn_div.setForeground(new java.awt.Color(204, 204, 204));
        btn_div.setText("/");
        btn_div.setBorderPainted(false);
        btn_div.setFocusPainted(false);
        btn_div.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_divMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_divMouseExited(evt);
            }
        });

        btn_0.setBackground(new java.awt.Color(102, 102, 102));
        btn_0.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        btn_0.setForeground(new java.awt.Color(204, 204, 204));
        btn_0.setText("0");
        btn_0.setBorderPainted(false);
        btn_0.setFocusPainted(false);
        btn_0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_0MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_0MouseExited(evt);
            }
        });

        btn_mult.setBackground(new java.awt.Color(102, 102, 102));
        btn_mult.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        btn_mult.setForeground(new java.awt.Color(204, 204, 204));
        btn_mult.setText("*");
        btn_mult.setBorderPainted(false);
        btn_mult.setFocusPainted(false);
        btn_mult.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_multMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_multMouseExited(evt);
            }
        });

        btn_1.setBackground(new java.awt.Color(102, 102, 102));
        btn_1.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        btn_1.setForeground(new java.awt.Color(204, 204, 204));
        btn_1.setText("1");
        btn_1.setBorderPainted(false);
        btn_1.setFocusPainted(false);
        btn_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_1MouseExited(evt);
            }
        });

        btn_3.setBackground(new java.awt.Color(102, 102, 102));
        btn_3.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        btn_3.setForeground(new java.awt.Color(204, 204, 204));
        btn_3.setText("3");
        btn_3.setBorderPainted(false);
        btn_3.setFocusPainted(false);
        btn_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_3MouseExited(evt);
            }
        });

        btn_2.setBackground(new java.awt.Color(102, 102, 102));
        btn_2.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        btn_2.setForeground(new java.awt.Color(204, 204, 204));
        btn_2.setText("2");
        btn_2.setBorderPainted(false);
        btn_2.setFocusPainted(false);
        btn_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_2MouseExited(evt);
            }
        });

        btn_4.setBackground(new java.awt.Color(102, 102, 102));
        btn_4.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        btn_4.setForeground(new java.awt.Color(204, 204, 204));
        btn_4.setText("4");
        btn_4.setBorderPainted(false);
        btn_4.setFocusPainted(false);
        btn_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_4MouseExited(evt);
            }
        });

        btn_6.setBackground(new java.awt.Color(102, 102, 102));
        btn_6.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        btn_6.setForeground(new java.awt.Color(204, 204, 204));
        btn_6.setText("6");
        btn_6.setBorderPainted(false);
        btn_6.setFocusPainted(false);
        btn_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_6MouseExited(evt);
            }
        });

        btn_5.setBackground(new java.awt.Color(102, 102, 102));
        btn_5.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        btn_5.setForeground(new java.awt.Color(204, 204, 204));
        btn_5.setText("5");
        btn_5.setBorderPainted(false);
        btn_5.setFocusPainted(false);
        btn_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_5MouseExited(evt);
            }
        });

        btn_8.setBackground(new java.awt.Color(102, 102, 102));
        btn_8.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        btn_8.setForeground(new java.awt.Color(204, 204, 204));
        btn_8.setText("8");
        btn_8.setBorderPainted(false);
        btn_8.setFocusPainted(false);
        btn_8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_8MouseExited(evt);
            }
        });

        btn_9.setBackground(new java.awt.Color(102, 102, 102));
        btn_9.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        btn_9.setForeground(new java.awt.Color(204, 204, 204));
        btn_9.setText("9");
        btn_9.setBorderPainted(false);
        btn_9.setFocusPainted(false);
        btn_9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_9MouseExited(evt);
            }
        });

        btn_7.setBackground(new java.awt.Color(102, 102, 102));
        btn_7.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        btn_7.setForeground(new java.awt.Color(204, 204, 204));
        btn_7.setText("7");
        btn_7.setBorderPainted(false);
        btn_7.setFocusPainted(false);
        btn_7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_7MouseExited(evt);
            }
        });
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(102, 102, 102));

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Calculadora Básica");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout painel_principalLayout = new javax.swing.GroupLayout(painel_principal);
        painel_principal.setLayout(painel_principalLayout);
        painel_principalLayout.setHorizontalGroup(
            painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_principalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painel_principalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_mult, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painel_principalLayout.createSequentialGroup()
                                .addComponent(btn_0, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_div, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_res, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painel_principalLayout.createSequentialGroup()
                                .addComponent(btn_2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_mais, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painel_principalLayout.createSequentialGroup()
                                .addComponent(btn_5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_menos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_principalLayout.createSequentialGroup()
                                .addComponent(btn_8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painel_principalLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        painel_principalLayout.setVerticalGroup(
            painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_principalLayout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_principalLayout.createSequentialGroup()
                        .addGroup(painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_menos, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btn_2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_mais, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painel_principalLayout.createSequentialGroup()
                                .addComponent(btn_1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn_mult, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_0, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_div, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_res, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(btn_4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_7MouseEntered
        btn_7.setBackground(new Color(204,204,204));
        btn_7.setForeground(new Color(0,0,0));
        
    }//GEN-LAST:event_btn_7MouseEntered

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_7MouseExited
        btn_7.setBackground(new Color(102,102,102));
        btn_7.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_btn_7MouseExited

    private void btn_8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_8MouseEntered
        btn_8.setBackground(new Color(204,204,204));
        btn_8.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_btn_8MouseEntered

    private void btn_9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_9MouseEntered
        btn_9.setBackground(new Color(204,204,204));
        btn_9.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_btn_9MouseEntered

    private void btn_4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_4MouseEntered
        btn_4.setBackground(new Color(204,204,204));
        btn_4.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_btn_4MouseEntered

    private void btn_5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_5MouseEntered
        btn_5.setBackground(new Color(204,204,204));
        btn_5.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_btn_5MouseEntered

    private void btn_6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_6MouseEntered
        btn_6.setBackground(new Color(204,204,204));
        btn_6.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_btn_6MouseEntered

    private void btn_1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_1MouseEntered
        btn_1.setBackground(new Color(204,204,204));
        btn_1.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_btn_1MouseEntered

    private void btn_2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_2MouseEntered
        btn_2.setBackground(new Color(204,204,204));
        btn_2.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_btn_2MouseEntered

    private void btn_3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_3MouseEntered
        btn_3.setBackground(new Color(204,204,204));
        btn_3.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_btn_3MouseEntered

    private void btn_multMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_multMouseEntered
        btn_mult.setBackground(new Color(204,204,204));
        btn_mult.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_btn_multMouseEntered

    private void btn_0MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_0MouseEntered
        btn_0.setBackground(new Color(204,204,204));
        btn_0.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_btn_0MouseEntered

    private void btn_divMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_divMouseEntered
        btn_div.setBackground(new Color(204,204,204));
        btn_div.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_btn_divMouseEntered

    private void btn_resMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_resMouseEntered
        btn_res.setBackground(new Color(204,204,204));
        btn_res.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_btn_resMouseEntered

    private void btn_maisMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_maisMouseEntered
        btn_mais.setBackground(new Color(204,204,204));
        btn_mais.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_btn_maisMouseEntered

    private void btn_menosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_menosMouseEntered
        btn_menos.setBackground(new Color(204,204,204));
        btn_menos.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_btn_menosMouseEntered

    private void btn_cancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cancelMouseEntered
    }//GEN-LAST:event_btn_cancelMouseEntered

    private void btn_8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_8MouseExited
        btn_8.setBackground(new Color(102,102,102));
        btn_8.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_btn_8MouseExited

    private void btn_9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_9MouseExited
        btn_9.setBackground(new Color(102,102,102));
        btn_9.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_btn_9MouseExited

    private void btn_cancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cancelMouseExited
    }//GEN-LAST:event_btn_cancelMouseExited

    private void btn_4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_4MouseExited
        btn_4.setBackground(new Color(102,102,102));
        btn_4.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_btn_4MouseExited

    private void btn_5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_5MouseExited
        btn_5.setBackground(new Color(102,102,102));
        btn_5.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_btn_5MouseExited

    private void btn_6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_6MouseExited
        btn_6.setBackground(new Color(102,102,102));
        btn_6.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_btn_6MouseExited

    private void btn_menosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_menosMouseExited
        btn_menos.setBackground(new Color(102,102,102));
        btn_menos.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_btn_menosMouseExited

    private void btn_1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_1MouseExited
        btn_1.setBackground(new Color(102,102,102));
        btn_1.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_btn_1MouseExited

    private void btn_2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_2MouseExited
        btn_2.setBackground(new Color(102,102,102));
        btn_2.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_btn_2MouseExited

    private void btn_3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_3MouseExited
        btn_3.setBackground(new Color(102,102,102));
        btn_3.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_btn_3MouseExited

    private void btn_maisMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_maisMouseExited
        btn_mais.setBackground(new Color(102,102,102));
        btn_mais.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_btn_maisMouseExited

    private void btn_multMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_multMouseExited
        btn_mult.setBackground(new Color(102,102,102));
        btn_mult.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_btn_multMouseExited

    private void btn_0MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_0MouseExited
        btn_0.setBackground(new Color(102,102,102));
        btn_0.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_btn_0MouseExited

    private void btn_divMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_divMouseExited
        btn_div.setBackground(new Color(102,102,102));
        btn_div.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_btn_divMouseExited

    private void btn_resMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_resMouseExited
        btn_res.setBackground(new Color(102,102,102));
        btn_res.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_btn_resMouseExited

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_cancelActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_div;
    private javax.swing.JButton btn_mais;
    private javax.swing.JButton btn_menos;
    private javax.swing.JButton btn_mult;
    private javax.swing.JButton btn_res;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel painel_principal;
    // End of variables declaration//GEN-END:variables
}
