///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
// */
//package CT4;
//
///**
// *
// * @author User
// */
//public class CT4_practic extends javax.swing.JFrame {
//
//    /**
//     * Creates new form CT4_practice
//     */
//    public CT4_practic() {
//        initComponents();
//    }
//
//    /**
//     * This method is called from within the constructor to initialize the form.
//     * WARNING: Do NOT modify this code. The content of this method is always
//     * regenerated by the Form Editor.
//     */
//    @SuppressWarnings("unchecked")
//    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
//    private void initComponents() {
//
//        jPanel1 = new javax.swing.JPanel();
//        Student = new javax.swing.JLabel();
//        CT = new javax.swing.JLabel();
//        Mid = new javax.swing.JLabel();
//        Final = new javax.swing.JLabel();
//        jTextField1 = new javax.swing.JTextField();
//        CTmark = new javax.swing.JTextField();
//        MIDmark = new javax.swing.JTextField();
//        FINALmark = new javax.swing.JTextField();
//        GradeCalculator = new javax.swing.JButton();
//
//        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
//        setTitle("Subject Grade Calculator");
//        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
//
//        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
//
//        Student.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
//        Student.setText("Student ID");
//        jPanel1.add(Student, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));
//
//        CT.setText("CT Marks");
//        jPanel1.add(CT, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));
//
//        Mid.setText("Mid Marks");
//        jPanel1.add(Mid, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));
//
//        Final.setText("Final Marks");
//        jPanel1.add(Final, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));
//
//        jTextField1.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                jTextField1ActionPerformed(evt);
//            }
//        });
//        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 230, -1));
//
//        CTmark.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                CTmarkActionPerformed(evt);
//            }
//        });
//        jPanel1.add(CTmark, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 230, -1));
//
//        MIDmark.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                MIDmarkActionPerformed(evt);
//            }
//        });
//        jPanel1.add(MIDmark, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 230, -1));
//
//        FINALmark.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                FINALmarkActionPerformed(evt);
//            }
//        });
//        jPanel1.add(FINALmark, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 188, 230, -1));
//
//        GradeCalculator.setText("Calculate Grade");
//        GradeCalculator.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                GradeCalculatorActionPerformed(evt);
//            }
//        });
//        jPanel1.add(GradeCalculator, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, -1, -1));
//
//        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 390, 300));
//
//        pack();
//        setLocationRelativeTo(null);
//    }// </editor-fold>//GEN-END:initComponents
//
//    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
//        // TODO add your handling code here:
//    }//GEN-LAST:event_jTextField1ActionPerformed
//
//    private void MIDmarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIDmarkActionPerformed
//        // TODO add your handling code here:
//    }//GEN-LAST:event_MIDmarkActionPerformed
//
//    private void FINALmarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FINALmarkActionPerformed
//        // TODO add your handling code here:
//    }//GEN-LAST:event_FINALmarkActionPerformed
//
//    private void GradeCalculatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GradeCalculatorActionPerformed
//        // TODO add your handling code here:
////        GradeInfo jf1= new GradeInfo();//objectfor SignUp for;
////        jf1.show();//display JFM2
////        dispose();//close after open JFM2
////
//        double CT,MID,FINAL,total = 0;
//        String Grade = null;
//
//        //CT = CTmark.getText();
//        CT=Double.parseDouble(CTmark.getText());
//        MID=Double.parseDouble(MIDmark.getText());
//        FINAL=Double.parseDouble(FINALmark.getText());
//        total=CT+MID+FINAL;
//
//        if(total>=90)
//        {
//            Grade= "A";
//        }
//        else if(total>=86 && total<=89)
//        {
//            Grade="A-";
//        }
//         else if(total>=82 && total<=85)
//        {
//            Grade="B+";
//        }
//         else if(total>=78 && total<=81)
//        {
//            Grade="B";
//        }
//         else if(total>=74 && total<=77)
//        {
//            Grade="B-";
//        }
//         else if(total>=70 && total<=73)
//        {
//            Grade="C+";
//        }
//         else if(total>=66 && total<=69)
//        {
//            Grade="C";
//        }
//         else if(total>=62 && total<=69)
//        {
//            Grade="C-";
//        }
//         else if(total>=58 && total<=61)
//        {
//            Grade="D+";
//        }
//          else if(total>=55 && total<=57)
//        {
//            Grade="D";
//        }
//        else
//         {
//             if(total<55)
//             {
//                Grade="F";
//             }
//         }
//
//        //lbltotal.setText(String.valueOf(total));
//        //txtGrade.setText(Grade);
//
//        GradeShow jf2= new GradeShow();//objectfor SignUp for;
//        jf2.setTotal(total);
//        jf2.setGrade(Grade);
//        jf2.show();//display JFM2
//        dispose();
//    }//GEN-LAST:event_GradeCalculatorActionPerformed
//
//    private void CTmarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CTmarkActionPerformed
//        // TODO add your handling code here:
//    }//GEN-LAST:event_CTmarkActionPerformed
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(CT4_practic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(CT4_practic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(CT4_practic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(CT4_practic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new CT4_practic().setVisible(true);
//            }
//        });
//    }
//
//    // Variables declaration - do not modify//GEN-BEGIN:variables
//    private javax.swing.JLabel CT;
//    private javax.swing.JTextField CTmark;
//    private javax.swing.JTextField FINALmark;
//    private javax.swing.JLabel Final;
//    private javax.swing.JButton GradeCalculator;
//    private javax.swing.JTextField MIDmark;
//    private javax.swing.JLabel Mid;
//    private javax.swing.JLabel Student;
//    private javax.swing.JPanel jPanel1;
//    private javax.swing.JTextField jTextField1;
//    // End of variables declaration//GEN-END:variables
//}
