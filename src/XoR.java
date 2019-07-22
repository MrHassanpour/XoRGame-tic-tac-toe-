
import java.awt.Color;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author MCSD
 */
public class XoR extends javax.swing.JFrame {

    private String whoseTurn = "X";
    private String playerOne = "player one";
    private String playerTwo = "player two";
    private int playerOneScore = 0;
    private int playerTwoScore = 0;

    public XoR() {
        initComponents();
        setSize(600, 600);
        setLocationRelativeTo(null);
        getPlayerNames();
    }

    private void getPlayerNames() {
        playerOne = JOptionPane.showInputDialog(this, "Enter player one name :", "Player Name", JOptionPane.INFORMATION_MESSAGE);
        playerTwo = JOptionPane.showInputDialog(this, "Enter player two name :", "Player Name", JOptionPane.INFORMATION_MESSAGE);

        if (playerOne.equals("")) {
            playerOne = "Player One";
        }
        if (playerTwo.equals("")) {
            playerTwo = "Player Two";
        }

    }

    private void detDraw() {
        String one = jButton1.getText();
        String two = jButton2.getText();
        String three = jButton3.getText();
        String four = jButton4.getText();
        String five = jButton5.getText();
        String six = jButton6.getText();
        String seven = jButton7.getText();
        String eight = jButton8.getText();
        String nine = jButton9.getText();

        if (one != "" && two != "" && three != "" && four != "" && five != "" && six != "" && seven != "" && eight != "" && nine != "") {
            JOptionPane.showMessageDialog(this, "The match has been drawn !!!", "Match result", JOptionPane.INFORMATION_MESSAGE);
            resetGame();
        }

    }

    private void determineWhoseTurn() {
        if (whoseTurn.equalsIgnoreCase("X")) {
            whoseTurn = "O";
        } else {
            whoseTurn = "X";
        }

    }

    private void xWins() {
        JOptionPane.showMessageDialog(this, playerOne.toUpperCase() + " WINS", "Winner", JOptionPane.INFORMATION_MESSAGE);
        playerOneScore++;
        resetGame();
    }

    private void oWins() {
        JOptionPane.showMessageDialog(this, playerTwo.toUpperCase() + " WINS", "Winner", JOptionPane.INFORMATION_MESSAGE);
        playerTwoScore++;
        resetGame();
    }

    private void determineIfWin() {

        String one = jButton1.getText();
        String two = jButton2.getText();
        String three = jButton3.getText();
        String four = jButton4.getText();
        String five = jButton5.getText();
        String six = jButton6.getText();
        String seven = jButton7.getText();
        String eight = jButton8.getText();
        String nine = jButton9.getText();

        if (one == "X" && two == "X" && three == "X") {
            xWins();
        }
        if (four == "X" && five == "X" && six == "X") {
            xWins();
        }
        if (seven == "X" && eight == "X" && nine == "X") {
            xWins();
        }
        if (one == "X" && two == "X" && three == "X") {
            xWins();
        }
        if (one == "X" && four == "X" && seven == "X") {
            xWins();
        }
        if (two == "X" && five == "X" && eight == "X") {
            xWins();
        }
        if (three == "X" && six == "X" && nine == "X") {
            xWins();
        }
        if (one == "X" && five == "X" && nine == "X") {
            xWins();
        }
        if (seven == "X" && five == "X" && three == "X") {
            xWins();
        }

        // if o wins 
        if (one == "O" && two == "O" && three == "O") {
            oWins();
        }
        if (four == "o" && five == "O" && six == "O") {
            oWins();
        }
        if (seven == "O" && eight == "O" && nine == "O") {
            oWins();
        }
        if (one == "O" && two == "O" && three == "O") {
            oWins();
        }
        if (one == "O" && four == "O" && seven == "O") {
            oWins();
        }
        if (two == "O" && five == "O" && eight == "O") {
            oWins();
        }
        if (three == "O" && six == "O" && nine == "O") {
            oWins();
        }
        if (one == "O" && five == "O" && nine == "O") {
            oWins();
        }
        if (seven == "O" && five == "O" && three == "O") {
            oWins();
        }

    }

    private void resetGame() {
        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        jButton4.setText("");
        jButton5.setText("");
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");

        scorelbl.setText(playerOne.toUpperCase() + "'s score : " + playerOneScore + "                 " + playerTwo.toUpperCase() + "'s score :" + playerTwoScore);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        scorelbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 600));
        setSize(new java.awt.Dimension(600, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 110)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 185));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 110)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 200, 185));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 110)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 200, 185));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 110)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 200, 185));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 110)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 200, 185));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 110)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 200, 185));

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 110)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 200, 185));

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 110)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 200, 185));

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 110)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, 200, 185));

        scorelbl.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        getContentPane().add(scorelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 600, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jButton1.setText(whoseTurn);
        
        if(whoseTurn.equalsIgnoreCase("X")){
            jButton1.setForeground(Color.red);
        }
        else{
            jButton1.setForeground(Color.BLUE);
        }
        determineWhoseTurn();
        determineIfWin();
        detDraw();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jButton2.setText(whoseTurn);
        
        if(whoseTurn.equalsIgnoreCase("X")){
            jButton2.setForeground(Color.red);
        }
        else{
            jButton2.setForeground(Color.BLUE);
        }
        determineWhoseTurn();
        determineIfWin();
        detDraw();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jButton3.setText(whoseTurn);
        
        if(whoseTurn.equalsIgnoreCase("X")){
            jButton3.setForeground(Color.red);
        }
        else{
            jButton3.setForeground(Color.BLUE);
        }
        determineWhoseTurn();
        determineIfWin();
        detDraw();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       jButton4.setText(whoseTurn);
        
        if(whoseTurn.equalsIgnoreCase("X")){
            jButton4.setForeground(Color.red);
        }
        else{
            jButton4.setForeground(Color.BLUE);
        }
        determineWhoseTurn();
        determineIfWin();
        detDraw();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jButton5.setText(whoseTurn);
        
        if(whoseTurn.equalsIgnoreCase("X")){
            jButton5.setForeground(Color.red);
        }
        else{
            jButton5.setForeground(Color.BLUE);
        }
        determineWhoseTurn();
        determineIfWin();
        detDraw();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jButton6.setText(whoseTurn);
        
        if(whoseTurn.equalsIgnoreCase("X")){
            jButton6.setForeground(Color.red);
        }
        else{
            jButton6.setForeground(Color.BLUE);
        }
        determineWhoseTurn();
        determineIfWin();
        detDraw();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
      jButton7.setText(whoseTurn);
        
        if(whoseTurn.equalsIgnoreCase("X")){
            jButton7.setForeground(Color.red);
        }
        else{
            jButton7.setForeground(Color.BLUE);
        }
        determineWhoseTurn();
        determineIfWin();
        detDraw();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jButton8.setText(whoseTurn);
        
        if(whoseTurn.equalsIgnoreCase("X")){
            jButton8.setForeground(Color.red);
        }
        else{
            jButton8.setForeground(Color.BLUE);
        }
        determineWhoseTurn();
        determineIfWin();
        detDraw();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        jButton9.setText(whoseTurn);
        
        if(whoseTurn.equalsIgnoreCase("X")){
            jButton9.setForeground(Color.red);
        }
        else{
            jButton9.setForeground(Color.BLUE);
        }
        determineWhoseTurn();
        determineIfWin();
        detDraw();
    }//GEN-LAST:event_jButton9ActionPerformed

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
            java.util.logging.Logger.getLogger(XoR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(XoR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(XoR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(XoR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new XoR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel scorelbl;
    // End of variables declaration//GEN-END:variables
}
