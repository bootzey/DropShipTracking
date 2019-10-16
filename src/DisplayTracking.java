import javax.swing.*;
import java.awt.*;
import java.util.List;

public class DisplayTracking {

    public static void displayTracking (String [][] tableData){

        String [] columnNames = {"Tracking Number", "Reference Number","Shipper Name", "Ship To Name","Ship To City","Ship To State"};
        JTable shipmentTable = new JTable(tableData,columnNames);

        JScrollPane scrollPane = new JScrollPane(shipmentTable);
        shipmentTable.setFillsViewportHeight(true);

        JFrame frame = new JFrame("Shipments");
        frame.setSize(800,800);
        frame.getContentPane().add(scrollPane);

        frame.setVisible(true);
    }
}
