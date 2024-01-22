
import java.awt.Color;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author LENOVO
 */
public class GamePanel extends javax.swing.JFrame {

    private String startGame = "X";
    private int xcount = 0;
    private int draw=0;
    private int ocount = 0;
    boolean checker;
    /**
     * Creates new form GamePanel
     */
    public GamePanel() {
        initComponents();
    }

    private void gameScore() {
        playerx.setText(String.valueOf(xcount));
        playero.setText(String.valueOf(ocount));
        drawgame.setText(String.valueOf(draw));

    }

    private void choose_a_player() {
        if (startGame.equalsIgnoreCase("X")) {
            startGame = "O";
        } else {
            startGame = "X";
        }
    }


    private void winner() {
        String b1 = btn1.getText();
        String b2 = btn2.getText();
        String b3 = btn3.getText();

        String b4 = btn4.getText();
        String b5 = btn5.getText();
        String b6 = btn6.getText();

        String b7 = btn7.getText();
        String b8 = btn8.getText();
        String b9 = btn9.getText();
        
        if (b1 == ("X") && b2 == ("X") && b3 == ("X")) {
            JOptionPane.showMessageDialog(this, "Player X Win", "Tic tac toe", JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            gameScore();
            
            btn1.setBackground(Color.yellow);
            btn2.setBackground(Color.yellow);
            btn3.setBackground(Color.yellow);
        }
        if (b4 == ("X") && b5 == ("X") && b6 == ("X")) {
            JOptionPane.showMessageDialog(this, "Player X Win", "Tic tac toe", JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            gameScore();

            btn4.setBackground(Color.yellow);
            btn5.setBackground(Color.yellow);
            btn6.setBackground(Color.yellow);
        }
        if (b7 == ("X") && b8 == ("X") && b9 == ("X")) {
            JOptionPane.showMessageDialog(this, "Player X Win", "Tic tac toe", JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            gameScore();

            btn7.setBackground(Color.yellow);
            btn8.setBackground(Color.yellow);
            btn9.setBackground(Color.yellow);
        }
        if (b1 == ("X") && b4 == ("X") && b7 == ("X")) {
            JOptionPane.showMessageDialog(this, "Player X Win", "Tic tac toe", JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            gameScore();

            btn1.setBackground(Color.yellow);
            btn4.setBackground(Color.yellow);
            btn7.setBackground(Color.yellow);
        }
        if (b2 == ("X") && b5 == ("X") && b8 == ("X")) {
            JOptionPane.showMessageDialog(this, "Player X Win", "Tic tac toe", JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            gameScore();

            btn2.setBackground(Color.yellow);
            btn5.setBackground(Color.yellow);
            btn8.setBackground(Color.yellow);
        }
        if (b3 == ("X") && b6 == ("X") && b9 == ("X")) {
            JOptionPane.showMessageDialog(this, "Player X Win", "Tic tac toe", JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            gameScore();

            btn3.setBackground(Color.yellow);
            btn6.setBackground(Color.yellow);
            btn9.setBackground(Color.yellow);
        }
        if (b1 == ("X") && b5 == ("X") && b9 == ("X")) {
            JOptionPane.showMessageDialog(this, "Player X Win", "Tic tac toe", JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            gameScore();

            btn1.setBackground(Color.yellow);
            btn5.setBackground(Color.yellow);
            btn9.setBackground(Color.yellow);
        }
        if (b3 == ("X") && b5 == ("X") && b7 == ("X")) {
            JOptionPane.showMessageDialog(this, "Player X Win", "Tic tac toe", JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            gameScore();

            btn3.setBackground(Color.yellow);
            btn5.setBackground(Color.yellow);
            btn7.setBackground(Color.yellow);
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        if (b1 == ("O") && b2 == ("O") && b3 == ("O")) {
            JOptionPane.showMessageDialog(this, "Player O Win", "Tic tac toe", JOptionPane.INFORMATION_MESSAGE);
            ocount++;
            gameScore();

            btn1.setBackground(Color.yellow);
            btn2.setBackground(Color.yellow);
            btn3.setBackground(Color.yellow);
        }
        if (b4 == ("O") && b5 == ("O") && b6 == ("O")) {
            JOptionPane.showMessageDialog(this, "Player O Win", "Tic tac toe", JOptionPane.INFORMATION_MESSAGE);
            ocount++;
            gameScore();

            btn4.setBackground(Color.yellow);
            btn5.setBackground(Color.yellow);
            btn6.setBackground(Color.yellow);
        }
        if (b7 == ("O") && b8 == ("O") && b9 == ("O")) {
            JOptionPane.showMessageDialog(this, "Player O Win", "Tic tac toe", JOptionPane.INFORMATION_MESSAGE);
            ocount++;
            gameScore();

            btn7.setBackground(Color.yellow);
            btn8.setBackground(Color.yellow);
            btn9.setBackground(Color.yellow);
        }
        if (b1 == ("O") && b4 == ("O") && b7 == ("O")) {
            JOptionPane.showMessageDialog(this, "Player O Win", "Tic tac toe", JOptionPane.INFORMATION_MESSAGE);
            ocount++;
            gameScore();

            btn1.setBackground(Color.yellow);
            btn4.setBackground(Color.yellow);
            btn7.setBackground(Color.yellow);
        }
        if (b2 == ("O") && b5 == ("O") && b8 == ("O")) {
            JOptionPane.showMessageDialog(this, "Player O Win", "Tic tac toe", JOptionPane.INFORMATION_MESSAGE);
            ocount++;
            gameScore();

            btn2.setBackground(Color.yellow);
            btn5.setBackground(Color.yellow);
            btn8.setBackground(Color.yellow);
        }
        if (b3 == ("O") && b6 == ("O") && b9 == ("O")) {
            JOptionPane.showMessageDialog(this, "Player O Win", "Tic tac toe", JOptionPane.INFORMATION_MESSAGE);
            ocount++;
            gameScore();

            btn3.setBackground(Color.yellow);
            btn6.setBackground(Color.yellow);
            btn9.setBackground(Color.yellow);
        }
        if (b1 == ("O") && b5 == ("O") && b9 == ("O")) {
            JOptionPane.showMessageDialog(this, "Player O Win", "Tic tac toe", JOptionPane.INFORMATION_MESSAGE);
            ocount++;
            gameScore();

            btn1.setBackground(Color.yellow);
            btn5.setBackground(Color.yellow);
            btn9.setBackground(Color.yellow);
        }
        if (b3 == ("O") && b5 == ("O") && b7 == ("O")) {
            JOptionPane.showMessageDialog(this, "Player O Win", "Tic tac toe", JOptionPane.INFORMATION_MESSAGE);
            ocount++;
            gameScore();

            btn3.setBackground(Color.yellow);
            btn5.setBackground(Color.yellow);
            btn7.setBackground(Color.yellow);
        }
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn2 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        playero = new javax.swing.JLabel();
        playerx = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        drawgame = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jPanel2.setBackground(new java.awt.Color(0, 51, 204));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" Tic Tac Toe");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        btn2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(255, 153, 153));
        jButton10.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jButton10.setText("EXIT");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(153, 102, 255));
        jButton11.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jButton11.setText("RESET");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Player X :");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Player O :");

        playero.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        playerx.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Draw :");

        drawgame.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(drawgame, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playero, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerx, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(playerx, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(playero, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(drawgame, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(99, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:

        int dialogResult = JOptionPane.showConfirmDialog(null, "Do you really want to Exit", "warning", JOptionPane.YES_NO_OPTION);

        if (dialogResult == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        btn5.setEnabled(true);
        btn6.setEnabled(true);
        btn7.setEnabled(true);
        btn8.setEnabled(true);
        btn9.setEnabled(true);
        
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");

        btn1.setBackground(Color.LIGHT_GRAY);
        btn2.setBackground(Color.LIGHT_GRAY);
        btn3.setBackground(Color.LIGHT_GRAY);
        btn4.setBackground(Color.LIGHT_GRAY);
        btn5.setBackground(Color.LIGHT_GRAY);
        btn6.setBackground(Color.LIGHT_GRAY);
        btn7.setBackground(Color.LIGHT_GRAY);
        btn8.setBackground(Color.LIGHT_GRAY);
        btn9.setBackground(Color.LIGHT_GRAY);

    }//GEN-LAST:event_jButton11ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        btn1.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            btn1.setForeground(Color.red);
        } else {
            btn1.setForeground(Color.MAGENTA);
        }
        choose_a_player();
        winner();
        
        btn1.setEnabled(false);
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        btn2.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            btn2.setForeground(Color.red);
        } else {
            btn2.setForeground(Color.MAGENTA);
        }
        choose_a_player();
        winner();
        btn2.setEnabled(false);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:

        btn3.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            btn3.setForeground(Color.red);
        } else {
            btn3.setForeground(Color.MAGENTA);
        }
        choose_a_player();
        winner();
        btn3.setEnabled(false);
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
        btn4.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            btn4.setForeground(Color.red);
        } else {
            btn4.setForeground(Color.MAGENTA);
        }
        choose_a_player();
        winner();
        btn4.setEnabled(false);
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
        btn5.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            btn5.setForeground(Color.red);
        } else {
            btn5.setForeground(Color.MAGENTA);
        }
        choose_a_player();
        winner();
        btn5.setEnabled(false);
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:

        btn6.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            btn6.setForeground(Color.red);
        } else {
            btn6.setForeground(Color.MAGENTA);
        }
        choose_a_player();
        winner();
        btn6.setEnabled(false);
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:
        btn7.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            btn7.setForeground(Color.red);
        } else {
            btn7.setForeground(Color.MAGENTA);
        }
        choose_a_player();
        winner();
        btn7.setEnabled(false);
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:
        btn8.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            btn8.setForeground(Color.red);
        } else {
            btn8.setForeground(Color.MAGENTA);
        }
        choose_a_player();
        winner();
        btn8.setEnabled(false);
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // TODO add your handling code here:
        btn9.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            btn9.setForeground(Color.red);
        } else {
            btn9.setForeground(Color.MAGENTA);
        }
        choose_a_player();
        winner();
        btn9.setEnabled(false);
    }//GEN-LAST:event_btn9ActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GamePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GamePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GamePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GamePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GamePanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JLabel drawgame;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel playero;
    private javax.swing.JLabel playerx;
    // End of variables declaration//GEN-END:variables
}
