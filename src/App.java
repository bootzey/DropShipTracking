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
        JButton fileChooseButton = new JButton("Choose File");
        fileChooseButton.setSize(75,20);


        fileChooseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String shipmentsFileName = FileChooser.getFile();
                ShipmentRepo shipmentRepo = new ShipmentRepo();
                shipmentRepo.loadShipments(shipmentsFileName);

                Shipment s = shipmentRepo.findShipment("165733").get();
                textArea.setText(s.trackingNumber);

            }
        });

        frame.getContentPane().add(BorderLayout.CENTER, textArea);
        frame.getContentPane().add(BorderLayout.SOUTH, fileChooseButton);

        frame.setVisible(true);

    }


}


