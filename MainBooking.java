package com.tutorial;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import java.util.ArrayList;

public class MainBooking {



    // JSlider - dodamy suwak do okna imion. A imiona zamienimy na miasta albo dodamy nowe okienko
    static List model = new ArrayList<Booking>();
    static JLabel labelastName = new JLabel("Nazwisko:");
    static JLabel labelName = new JLabel("Imię:  ");
    static JLabel labelfirstDay = new JLabel("Pierwszy dzień: ");
    static JLabel labellastDay = new JLabel("Ostatni dzień: ");
    static JTextField holiday = new JTextField(10);
    static JTextField imie = new JTextField(12);
    static JTextField to = new JTextField(10);
    static JTextField out = new JTextField(10);
   

    private static JPanel topPanel(JFrame frame) {
        JPanel p = new JPanel();

        JTextField holiday = new JTextField(10);
        JTextField imie = new JTextField(20);
        JTextField to = new JTextField(12);


        to.addMouseListener((new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

                to.setText(new DatePicker(frame).setPickedDate());

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        }));

       out.addMouseListener((new MouseListener() {
           @Override
           public void mouseClicked(MouseEvent e) {
               out.setText(new DatePicker(frame).setPickedDate());
           }

           @Override
           public void mousePressed(MouseEvent e) {

           }

           @Override
           public void mouseReleased(MouseEvent e) {

           }

           @Override
           public void mouseEntered(MouseEvent e) {

           }

           @Override
           public void mouseExited(MouseEvent e) {

           }
       }));
        p.add(new JLabel("Wybierz Typ urlopu: "));
        p.add(holiday);
        holiday.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                holiday.setText(new ChooseTypeHolidays(frame).setHoli());
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        p.add(new JLabel("Imię: "));
        p.add(imie);
        JButton save = new JButton("Zapisz");
        p.add(save);

        p.add(new JLabel("Pierwszy dzień: "));
        p.add(to);
        p.add(new JLabel("Ostatni dzień"));
        p.add(out);
        JButton ok = new JButton("check");
 /*       ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SimpleDateFormat sdf = new SimleDateFormat(("dd-mm-yyyy"));
                if (validatonForm(nazwisko,imie,labelfirstDay, labelastName)){
                    try {
                        model.add(new Booking(imie.getText()));
                        nazwisko.getText();
                        sdf.parse(labelfirstDay.getText());
                        sdf.parse(labellastDay.getText());
                    } catch (ParseException ex) {
                        ex.printStackTrace();
                    }
                }

            }
        });

  */
        p.add(ok);
        return p;
    }

    private static JPanel centerPanel() {
        JPanel p = new JPanel();
        JList list = new JList(model.stream().toArray());
        p.add(list);
        return p;
    }

    private static JPanel buildPanel(JFrame frame) {
        JPanel p = new JPanel();
        p.add(BorderLayout.WEST, topPanel(frame));
        p.add(BorderLayout.CENTER, centerPanel());
        return p;
    }



    private void add(JComboBox holiday) {
    }

    public static void main(String args[]) {
        JFrame frame = new JFrame("Wybierz urlop");
        frame.add(buildPanel(frame));
        frame.setSize(1200, 300);
        frame.setBackground(Color.red);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
