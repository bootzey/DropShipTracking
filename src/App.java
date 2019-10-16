import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Dropship Tracking Tool");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);

        JTextArea textArea = new JTextArea();
        //add a button to select a file

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


        frame.getContentPane().add(BorderLayout.CENTER, textArea);
        frame.getContentPane().add(BorderLayout.SOUTH, importTrackingButton);

        frame.setVisible(true);

    }


}


