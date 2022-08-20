/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ELschleifentool.ui;

import ELschleifentool.gebäude.GebäudebauPanel;
import ELschleifentool.interfaces.LoginListener;
import ELschleifentool.network.Repository;
import ELschleifentool.schiffsbau.SchiffsbauPanel;
import ELschleifentool.util.Log;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nico
 */
public class MainPanel extends javax.swing.JPanel {

    SchiffsbauPanel schiffbau;
    GebäudebauPanel gebäudebau;
    LoginListener loginListener;

    /**
     * Creates new form MainPanel
     *
     * @param sid
     * @param loginListener
     */
    public MainPanel(String sid, LoginListener loginListener) {
        initComponents();
        this.loginListener = loginListener;
        schiffbau = new SchiffsbauPanel(sid);
        gebäudebau = new GebäudebauPanel(sid);
        layout_konstruktion.add(gebäudebau);
        layout_produktion.add(schiffbau);
        revalidate();
//
//        ArrayList<String> namen = new ArrayList<>();
//        namen.add("Hauptquartier");
//        namen.add("Biozelle");
//        namen.add("Bunker");
//        namen.add("Farm");
//        namen.add("Eisenmine");
//        namen.add("Titanmine");
//        namen.add("Bohrturm");
//        namen.add("Chemiefabrik");
//        namen.add("Recyclingcenter");
//        namen.add("Nahrungssilo");
//        namen.add("Eisenspeicher");
//        namen.add("Titanspeicher");
//        namen.add("Wasserspeicher");
//        namen.add("Wasserstoffspeicher");
//        namen.add("Universität");
//        namen.add("Vergnügungszentrum");
//        namen.add("Schiffsfabrik");
//        namen.add("Verteidigungsstation");
//        namen.add("Flottenkontrollzentrum");
//        namen.add("Schildgenerator");
//        namen.add("Intergalaktischer Weltraumhafen");
//        namen.add("Palast");
//        namen.add("Kernforschungszentrum");
//        namen.add("Statue des Imperators");
//        calc(namen, sid, 0, null);
    }

//    final void calc(ArrayList<String> namen, String sid, int stufe, PrintStream templog) {
//        String current = namen.get(0);
//        try {
//            if (templog == null) {
//                templog = new PrintStream(current + ".txt");
//            }
//            final PrintStream log = templog;
//            new Repository().gebäudeBaukosten(current, sid, stufe, (t) -> {
//                log.println(t.kosten);
//                System.out.println(current + " " + t.kosten);
//                if (stufe < 499) {
//                    calc(namen, sid, stufe + 1, log);
//                } else {
//                    namen.remove(0);
//                    if (!namen.isEmpty()) {
//                        calc(namen, sid, 0, null);
//                    }
//                }
//            });
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        layout_konstruktion = new javax.swing.JPanel();
        layout_produktion = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(0, 0, 0));

        jTabbedPane1.setBackground(new java.awt.Color(0, 0, 0));
        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });
        jTabbedPane1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                jTabbedPane1CaretPositionChanged(evt);
            }
        });

        layout_konstruktion.setBackground(new java.awt.Color(0, 0, 0));
        layout_konstruktion.setLayout(new javax.swing.BoxLayout(layout_konstruktion, javax.swing.BoxLayout.LINE_AXIS));
        jTabbedPane1.addTab("Konstruktion", layout_konstruktion);

        layout_produktion.setBackground(new java.awt.Color(0, 0, 0));
        layout_produktion.setLayout(new javax.swing.BoxLayout(layout_produktion, javax.swing.BoxLayout.LINE_AXIS));
        jTabbedPane1.addTab("Produktion", layout_produktion);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 704, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 369, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Account/Login", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        System.out.println("state change");
        int count = jTabbedPane1.getTabCount();
        if (count > 0 && jTabbedPane1.getSelectedIndex() == 2) {
            loginListener.onLogout();
        }
    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void jTabbedPane1CaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTabbedPane1CaretPositionChanged
        System.out.println("jTabbedPane1CaretPositionChanged");
    }//GEN-LAST:event_jTabbedPane1CaretPositionChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel layout_konstruktion;
    private javax.swing.JPanel layout_produktion;
    // End of variables declaration//GEN-END:variables
}