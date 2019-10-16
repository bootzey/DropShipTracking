import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DropShipTracking {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Dropship Tracking Tool");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700,500);

        JLabel textArea = new JLabel("Use the buttons below to generate your tracking file");
        //add a button to select a file

        //ADD BUTTONS BELOW
        JButton importTrackingButton = new JButton("Import Tracking");
        importTrackingButton.setSize(75,20);
        importTrackingButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String shipmentsFileName = FileChooser.getFile();
                ShipmentRepo shipmentRepo = new ShipmentRepo();
                shipmentRepo.loadShipments(shipmentsFileName);
                DisplayTracking.displayTracking(shipmentRepo.toArray());


            }
        });
        JButton importOrdersButton = new JButton("Import Orders");
        JButton processTrackingButton = new JButton("Process Tracking");
        JButton exportTrackingButton = new JButton("Export Tracking File");

        //Add components to panel
        JPanel southPanel = new JPanel();
        southPanel.add(importTrackingButton);
        southPanel.add(importOrdersButton);
        southPanel.add(processTrackingButton);
        southPanel.add(exportTrackingButton);

        frame.getContentPane().add(BorderLayout.SOUTH,southPanel);

        frame.getContentPane().add(BorderLayout.CENTER, textArea);
        frame.setVisible(true);

    }


}


