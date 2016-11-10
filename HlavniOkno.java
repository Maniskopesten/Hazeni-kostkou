package net.sevecek;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class HlavniOkno extends JFrame {

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner non-commercial license
    JPanel contentPane;
    JButton btnHodKostkou;
    JLabel labHozeno;
    JTextField txtHozeno;
    JLabel labKostka1;
    JLabel labKostka2;
    JLabel labKostka3;
    JLabel labKostka4;
    JLabel labKostka5;
    JLabel labKostka6;
    Random generatorNahodnychCisel;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    public HlavniOkno() {
        initComponents();
    }

    private void priStiskuBtnHodKostkou(ActionEvent e) {
        Integer nahodneCislo;
        String nahodneCisloJakoText;
        nahodneCislo = generatorNahodnychCisel.nextInt(6) + 1;
        nahodneCisloJakoText = nahodneCislo.toString();
        txtHozeno.setText(nahodneCisloJakoText);

        if (nahodneCislo == 1) {
            labKostka1.setVisible(true);
            labKostka2.setVisible(false);
            labKostka3.setVisible(false);
            labKostka4.setVisible(false);
            labKostka5.setVisible(false);
            labKostka6.setVisible(false);
            }

        if (nahodneCislo == 2) {
            labKostka1.setVisible(false);
            labKostka2.setVisible(true);
            labKostka3.setVisible(false);
            labKostka4.setVisible(false);
            labKostka5.setVisible(false);
            labKostka6.setVisible(false);
        }
        if (nahodneCislo == 3) {
            labKostka1.setVisible(false);
            labKostka2.setVisible(false);
            labKostka3.setVisible(true);
            labKostka4.setVisible(false);
            labKostka5.setVisible(false);
            labKostka6.setVisible(false);
        }
        if (nahodneCislo == 4) {
            labKostka1.setVisible(false);
            labKostka2.setVisible(false);
            labKostka3.setVisible(false);
            labKostka4.setVisible(true);
            labKostka5.setVisible(false);
            labKostka6.setVisible(false);
        }
        if (nahodneCislo == 5) {
            labKostka1.setVisible(false);
            labKostka2.setVisible(false);
            labKostka3.setVisible(false);
            labKostka4.setVisible(false);
            labKostka5.setVisible(true);
            labKostka6.setVisible(false);
        }
        if (nahodneCislo == 6) {
            labKostka1.setVisible(false);
            labKostka2.setVisible(false);
            labKostka3.setVisible(false);
            labKostka4.setVisible(false);
            labKostka5.setVisible(false);
            labKostka6.setVisible(true);
        }

    }

    private void priNajetiMysiNadLabHozeno(MouseEvent e) {
        Color barva;
        barva = new Color(255, 0, 0);
        labHozeno.setForeground(barva);
    }

    private void priOdjetiMysiZLabHozeno(MouseEvent e) {
        Color barva;
        barva = new Color(0, 0, 0);
        labHozeno.setForeground(barva);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner non-commercial license
        contentPane = new JPanel();
        btnHodKostkou = new JButton();
        labHozeno = new JLabel();
        txtHozeno = new JTextField();
        labKostka1 = new JLabel();
        labKostka2 = new JLabel();
        labKostka3 = new JLabel();
        labKostka4 = new JLabel();
        labKostka5 = new JLabel();
        labKostka6 = new JLabel();
        generatorNahodnychCisel = new Random();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Moje nov\u00e1 aplikace");
        Container contentPane2 = getContentPane();
        contentPane2.setLayout(new BorderLayout());

        //======== contentPane ========
        {
            contentPane.setLayout(null);

            //---- btnHodKostkou ----
            btnHodKostkou.setText("Hod kostkou");
            btnHodKostkou.setFont(btnHodKostkou.getFont().deriveFont(btnHodKostkou.getFont().getSize() + 5f));
            btnHodKostkou.setIcon(new ImageIcon(getClass().getResource("/net/sevecek/hraci-kostka.png")));
            btnHodKostkou.addActionListener(e -> priStiskuBtnHodKostkou(e));
            contentPane.add(btnHodKostkou);
            btnHodKostkou.setBounds(145, 55, 225, 95);

            //---- labHozeno ----
            labHozeno.setText("Hozeno:");
            labHozeno.setFont(labHozeno.getFont().deriveFont(labHozeno.getFont().getSize() + 5f));
            labHozeno.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    priNajetiMysiNadLabHozeno(e);
                }
                @Override
                public void mouseExited(MouseEvent e) {
                    priOdjetiMysiZLabHozeno(e);
                }
            });
            contentPane.add(labHozeno);
            labHozeno.setBounds(60, 195, 65, 25);

            //---- txtHozeno ----
            txtHozeno.setFont(txtHozeno.getFont().deriveFont(txtHozeno.getFont().getSize() + 5f));
            contentPane.add(txtHozeno);
            txtHozeno.setBounds(145, 185, 305, 40);

            //---- labKostka1 ----
            labKostka1.setIcon(new ImageIcon(getClass().getResource("/net/sevecek/kostka1.png")));
            contentPane.add(labKostka1);
            labKostka1.setBounds(new Rectangle(new Point(150, 250), labKostka1.getPreferredSize()));

            //---- labKostka2 ----
            labKostka2.setIcon(new ImageIcon(getClass().getResource("/net/sevecek/kostka2.png")));
            contentPane.add(labKostka2);
            labKostka2.setBounds(new Rectangle(new Point(150, 250), labKostka2.getPreferredSize()));

            //---- labKostka3 ----
            labKostka3.setIcon(new ImageIcon(getClass().getResource("/net/sevecek/kostka3.png")));
            contentPane.add(labKostka3);
            labKostka3.setBounds(new Rectangle(new Point(150, 250), labKostka3.getPreferredSize()));

            //---- labKostka4 ----
            labKostka4.setIcon(new ImageIcon(getClass().getResource("/net/sevecek/kostka4.png")));
            contentPane.add(labKostka4);
            labKostka4.setBounds(new Rectangle(new Point(150, 250), labKostka4.getPreferredSize()));

            //---- labKostka5 ----
            labKostka5.setIcon(new ImageIcon(getClass().getResource("/net/sevecek/kostka5.png")));
            contentPane.add(labKostka5);
            labKostka5.setBounds(new Rectangle(new Point(150, 250), labKostka5.getPreferredSize()));

            //---- labKostka6 ----
            labKostka6.setIcon(new ImageIcon(getClass().getResource("/net/sevecek/kostka6.png")));
            contentPane.add(labKostka6);
            labKostka6.setBounds(new Rectangle(new Point(150, 250), labKostka6.getPreferredSize()));

            { // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < contentPane.getComponentCount(); i++) {
                    Rectangle bounds = contentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = contentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                contentPane.setMinimumSize(preferredSize);
                contentPane.setPreferredSize(preferredSize);
            }
        }
        contentPane2.add(contentPane, BorderLayout.CENTER);
        setSize(535, 485);
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
}
