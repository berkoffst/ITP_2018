package akarshana;

import java.awt.Color;
import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class courseFee extends javax.swing.JFrame {

    /**
     * Creates new form courseFee
     */
    public courseFee() {
        initComponents();
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
        Header_full = new javax.swing.JPanel();
        Header_Internam = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        repeat_btn = new javax.swing.JPanel();
        repeat_btn_name = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_apply_new = new javax.swing.JPanel();
        name_apply_btn = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Header_full.setBackground(new java.awt.Color(51, 153, 255));

        Header_Internam.setBackground(new java.awt.Color(51, 153, 255));

        jLabel2.setFont(new java.awt.Font("Bodoni MT Black", 1, 38)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("JEEWA EDUCATION");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Student Management System");

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Desktop\\itp\\itp\\image\\Jeewa-O.png")); // NOI18N

        javax.swing.GroupLayout Header_InternamLayout = new javax.swing.GroupLayout(Header_Internam);
        Header_Internam.setLayout(Header_InternamLayout);
        Header_InternamLayout.setHorizontalGroup(
            Header_InternamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Header_InternamLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(Header_InternamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Header_InternamLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel3))
                    .addGroup(Header_InternamLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        Header_InternamLayout.setVerticalGroup(
            Header_InternamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Header_InternamLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Header_InternamLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jLabel4.setBackground(new java.awt.Color(255, 255, 0));
        jLabel4.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("HI.....");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel8.setText("Prakash Akarshana");

        javax.swing.GroupLayout Header_fullLayout = new javax.swing.GroupLayout(Header_full);
        Header_full.setLayout(Header_fullLayout);
        Header_fullLayout.setHorizontalGroup(
            Header_fullLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Header_fullLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(Header_Internam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(Header_fullLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        Header_fullLayout.setVerticalGroup(
            Header_fullLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Header_fullLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(Header_Internam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(Header_fullLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        repeat_btn.setBackground(new java.awt.Color(255, 255, 255));
        repeat_btn.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 102, 255), new java.awt.Color(51, 153, 255)));
        repeat_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                repeat_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                repeat_btnMouseExited(evt);
            }
        });

        repeat_btn_name.setBackground(new java.awt.Color(51, 102, 255));
        repeat_btn_name.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        repeat_btn_name.setForeground(new java.awt.Color(51, 102, 255));
        repeat_btn_name.setText("Repeat Registration");

        javax.swing.GroupLayout repeat_btnLayout = new javax.swing.GroupLayout(repeat_btn);
        repeat_btn.setLayout(repeat_btnLayout);
        repeat_btnLayout.setHorizontalGroup(
            repeat_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, repeat_btnLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(repeat_btn_name, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        repeat_btnLayout.setVerticalGroup(
            repeat_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(repeat_btn_name, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
        );

        jLabel5.setBackground(new java.awt.Color(51, 102, 255));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 153, 255));
        jLabel5.setText("Online Ragistration ");

        btn_apply_new.setBackground(new java.awt.Color(255, 255, 255));
        btn_apply_new.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 102, 255), new java.awt.Color(51, 153, 255)));
        btn_apply_new.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_apply_newMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_apply_newMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_apply_newMouseReleased(evt);
            }
        });

        name_apply_btn.setBackground(new java.awt.Color(51, 102, 255));
        name_apply_btn.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        name_apply_btn.setForeground(new java.awt.Color(51, 102, 255));
        name_apply_btn.setText("Appy For New Intake");
        name_apply_btn.setFocusable(false);
        name_apply_btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        name_apply_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                name_apply_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                name_apply_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                name_apply_btnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btn_apply_newLayout = new javax.swing.GroupLayout(btn_apply_new);
        btn_apply_new.setLayout(btn_apply_newLayout);
        btn_apply_newLayout.setHorizontalGroup(
            btn_apply_newLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_apply_newLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(name_apply_btn)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        btn_apply_newLayout.setVerticalGroup(
            btn_apply_newLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(name_apply_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(434, Short.MAX_VALUE)
                .addComponent(repeat_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(68, 68, 68)
                    .addComponent(btn_apply_new, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(443, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addComponent(repeat_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                    .addContainerGap(198, Short.MAX_VALUE)
                    .addComponent(btn_apply_new, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(115, 115, 115)))
        );

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Desktop\\itp\\itp\\image\\backarrow.png")); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Header_full, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Header_full, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabel6)
                .addContainerGap(59, Short.MAX_VALUE))
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

    private void btn_apply_newMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_apply_newMouseEntered
        
         btn_apply_new.setBackground(new java.awt.Color(51,153,255));
       
        name_apply_btn.setForeground(Color.white);
    }//GEN-LAST:event_btn_apply_newMouseEntered

    private void btn_apply_newMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_apply_newMouseReleased
        
    }//GEN-LAST:event_btn_apply_newMouseReleased

    private void btn_apply_newMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_apply_newMouseExited
       btn_apply_new.setBackground(Color.white);
       
        name_apply_btn.setForeground(new java.awt.Color(51,102,255));
    }//GEN-LAST:event_btn_apply_newMouseExited

    private void repeat_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_repeat_btnMouseEntered
      repeat_btn.setBackground(new java.awt.Color(51,153,255));
       
        repeat_btn_name.setForeground(Color.white);
    }//GEN-LAST:event_repeat_btnMouseEntered

    private void repeat_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_repeat_btnMouseExited
         repeat_btn.setBackground(Color.white);
       
        repeat_btn_name.setForeground(new java.awt.Color(51,102,255));
    }//GEN-LAST:event_repeat_btnMouseExited

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
    
  
    JLabel label = new JLabel();
    
    
    label.setText("akarsjsndsvnjgnofsgmjfkmkx;");
    jLabel2.add(label);
    
    
 
     
    }//GEN-LAST:event_jLabel6MouseClicked

    private void name_apply_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_name_apply_btnMouseClicked
       this.setVisible(false);
       new newIntake().setVisible(true);
    }//GEN-LAST:event_name_apply_btnMouseClicked

    private void name_apply_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_name_apply_btnMouseEntered
         btn_apply_new.setBackground(new java.awt.Color(51,153,255));
       
        name_apply_btn.setForeground(Color.white);
    }//GEN-LAST:event_name_apply_btnMouseEntered

    private void name_apply_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_name_apply_btnMouseExited
           btn_apply_new.setBackground(Color.white);
       
        name_apply_btn.setForeground(new java.awt.Color(51,102,255));
    }//GEN-LAST:event_name_apply_btnMouseExited

    /**
     * @param args the command line arguments
     * 
     * 
     */
    public void mouseEnter(){
        
    }
     public void mouseRelease(String btn){
         
        
    }
    
    public void messa(){
        
        
        
    }
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
            java.util.logging.Logger.getLogger(courseFee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(courseFee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(courseFee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(courseFee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
       
        

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new courseFee().setVisible(true);
                
               
                
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header_Internam;
    private javax.swing.JPanel Header_full;
    private javax.swing.JPanel btn_apply_new;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel name_apply_btn;
    private javax.swing.JPanel repeat_btn;
    private javax.swing.JLabel repeat_btn_name;
    // End of variables declaration//GEN-END:variables
}

