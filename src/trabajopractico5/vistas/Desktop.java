/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package trabajopractico5.vistas;

import clases.DirectorioTelefonico;
/**
 *
 * @author Hernan
 */
public class Desktop extends javax.swing.JFrame {

    DirectorioTelefonico directorio = new DirectorioTelefonico();
    /**
     * Creates new form Desktop
     */
    public Desktop() {
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

        jMenuItem1 = new javax.swing.JMenuItem();
        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiBuscarportelefono = new javax.swing.JMenuItem();
        jmiBuscarporapellido = new javax.swing.JMenuItem();
        jmiBuscarporciudad = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmiAgregarcontacto = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jmiSalir = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 677, Short.MAX_VALUE)
        );

        jMenu1.setText("Buscar");

        jmiBuscarportelefono.setText("Buscar por numero de telefono");
        jmiBuscarportelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiBuscarportelefonoActionPerformed(evt);
            }
        });
        jMenu1.add(jmiBuscarportelefono);

        jmiBuscarporapellido.setText("Buscar por Apellido");
        jmiBuscarporapellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiBuscarporapellidoActionPerformed(evt);
            }
        });
        jMenu1.add(jmiBuscarporapellido);

        jmiBuscarporciudad.setText("Buscar por ciudad");
        jmiBuscarporciudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiBuscarporciudadActionPerformed(evt);
            }
        });
        jMenu1.add(jmiBuscarporciudad);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Editar");

        jmiAgregarcontacto.setText("Agregar contacto");
        jmiAgregarcontacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAgregarcontactoActionPerformed(evt);
            }
        });
        jMenu2.add(jmiAgregarcontacto);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Salir");

        jmiSalir.setText("Salir");
        jmiSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSalirActionPerformed(evt);
            }
        });
        jMenu3.add(jmiSalir);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiBuscarportelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiBuscarportelefonoActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        Buscarportelefono buscartelefono= new Buscarportelefono(directorio);
        buscartelefono.setVisible(true);
        escritorio.add(buscartelefono);
        escritorio.moveToFront(buscartelefono);
    }//GEN-LAST:event_jmiBuscarportelefonoActionPerformed

    private void jmiBuscarporapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiBuscarporapellidoActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        Buscarporapellido buscarapellido= new Buscarporapellido(directorio);
        buscarapellido.setVisible(true);
        escritorio.add(buscarapellido);
        escritorio.moveToFront(buscarapellido);
    }//GEN-LAST:event_jmiBuscarporapellidoActionPerformed

    private void jmiBuscarporciudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiBuscarporciudadActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        Buscarporciudad buscarciudad= new Buscarporciudad(directorio);
        buscarciudad.setVisible(true);
        escritorio.add(buscarciudad);
        escritorio.moveToFront(buscarciudad);
    }//GEN-LAST:event_jmiBuscarporciudadActionPerformed

    private void jmiAgregarcontactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAgregarcontactoActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        Formulariocontacto formulario= new Formulariocontacto(directorio);
        formulario.setVisible(true);
        escritorio.add(formulario);
        escritorio.moveToFront(formulario);
    }//GEN-LAST:event_jmiAgregarcontactoActionPerformed

    private void jmiSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSalirActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        this.dispose();
    }//GEN-LAST:event_jmiSalirActionPerformed

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
            java.util.logging.Logger.getLogger(Desktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Desktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Desktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Desktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Desktop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jmiAgregarcontacto;
    private javax.swing.JMenuItem jmiBuscarporapellido;
    private javax.swing.JMenuItem jmiBuscarporciudad;
    private javax.swing.JMenuItem jmiBuscarportelefono;
    private javax.swing.JMenuItem jmiSalir;
    // End of variables declaration//GEN-END:variables
}
