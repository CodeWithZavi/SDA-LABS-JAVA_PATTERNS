package ui;

import application.TransportScheduler;
import domain.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TransportApp {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Transport Scheduler");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        TransportScheduler scheduler = new TransportScheduler();

        Transport publicTransport = new PublicTransport();
        Transport ownConveyance = new OwnConveyance();
        Transport universityTSP = new UniversityTSP();

        JButton publicTransportButton = new JButton("Schedule Public Transport");
        JButton ownConveyanceButton = new JButton("Schedule Own Conveyance");
        JButton universityTSPButton = new JButton("Schedule University TSP");

        frame.setLayout(new FlowLayout());

        publicTransportButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                scheduler.scheduleTransport(publicTransport);
                JOptionPane.showMessageDialog(frame, "Public Transport ( You can go with public Trasport )");
            }
        });

        ownConveyanceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                scheduler.scheduleTransport(ownConveyance);
                JOptionPane.showMessageDialog(frame, "Own Conveyance scheduled : Yes you can go");
            }
        });

        universityTSPButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                scheduler.scheduleTransport(universityTSP);
                JOptionPane.showMessageDialog(frame, "You can go with University TSP  ");
            }
        });

        frame.add(publicTransportButton);
        frame.add(ownConveyanceButton);
        frame.add(universityTSPButton);

        frame.setVisible(true);
    }
}
