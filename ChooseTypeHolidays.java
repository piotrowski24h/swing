package com.tutorial;

import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.ActionEvent;

import static java.awt.SystemColor.text;

public class ChooseTypeHolidays {

    JFrame frame;
    String holi = "";

    ChooseTypeHolidays(JFrame frame) {
       this.frame = new JFrame("Wybierz typ urlopu");

     String holidays[] = {"wypoczynkowy", "rodzicielski", "szkoleniowy", "na żądanie", "okolicznościowy"};
        JComboBox holiday = new JComboBox(holidays);
        holiday.setBounds(50, 50, 90, 20);
       this.frame.add(holiday);
        this.frame.setLayout(null);
        this.frame.setSize(400, 200);
      //  this.frame.setBackground(Color.red);
        this.frame.setVisible(true);

        final JPanel p = new JPanel();
        final JTextField text = new JTextField(20);
        final JFrame f =new JFrame();
  /* p.addAncestorListener(new AncestorListener() {
       @Override
       public void ancestorAdded(AncestorEvent event) {
           text.setText(new ChooseTypeHolidays(f).setHoli());
       }

       @Override
       public void ancestorRemoved(AncestorEvent event) {

       }

       @Override
       public void ancestorMoved(AncestorEvent event) {

       }
   });
      //  p.add(text);
       // f.pack();
       // f.setVisible(true);
       // f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
*/
    }

    public void displayHoliday() {
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat();
    }
    public String setHoli(){
        if(holi.equals(""))
            return holi;
        return null;
    }

}
    class Main {
        public static void main(String args[]) {
            JFrame frame = new JFrame();
            new ChooseTypeHolidays(frame);
        }

    }

